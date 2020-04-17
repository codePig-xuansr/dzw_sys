package com.accp.action.zxp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zxp.*;
import com.accp.pojo.ljl.LjlFadongji;
import com.accp.pojo.zxp.*;
import com.accp.vo.zxp.ZxpLeaveVO;
import com.accp.vo.zxp.ZxpUserVO;
import com.github.pagehelper.PageInfo;

import jxl.Workbook;
import jxl.write.WritableCellFormat;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

@RestController
@RequestMapping("/zxp/api/leave")
public class ZxpLeaveAction {
	@Autowired
	private ZxpLeaveBiz biz;
	@Autowired
	private ZxpUserBiz ubiz;
	
	@GetMapping("queryLeaAll/{n}/{s}/{name}")
	public PageInfo<ZxpLeaveVO> queryTxlAll(@PathVariable Integer n,@PathVariable Integer s,@PathVariable String name) {		
		return biz.findLeave(n, s,"null".equals(name)?"":name);
	}
	
	@PostMapping("add")
	public Map<Object, Object> addRole(@RequestBody ZxpLeave leave){
		Map<Object, Object> map = new HashMap<Object, Object>();
		zxpp zs=ubiz.find1(leave.getUsername());
		ubiz.updateUser(new zxpp(zs.getUid(), null, null, null, null, null, null, null, null, null, 1));
		int sum = biz.addLeave(new ZxpLeave(0, zs.getUid(), new Date(), leave.getContent()));
		if(sum>0) {
				map.put("code", "200");
				
			}else {
				map.put("code", "300");
			}
		return map;
	}
	
	@GetMapping("daochukhzl")
	public Map<String, Object> daochukhzl() {
		Map<String, Object> message = new HashMap<String, Object>();
		List<ZxpLeaveVO> kehuziliao=biz.finda();
		List<String[]> data = new ArrayList<String[]>();
		for(int i=0;i<kehuziliao.size();i++) {
			data.add(new String[] {
					String.valueOf(kehuziliao.get(i).getUser().getDepid()),
					String.valueOf(kehuziliao.get(i).getUser().getRid()),
					String.valueOf(kehuziliao.get(i).getUser().getUid()),
					String.valueOf(kehuziliao.get(i).getUser().getUsername()),
					String.valueOf(kehuziliao.get(i).getUser().getSex()),
					String.valueOf(kehuziliao.get(i).getLeave().getLeavedate()),
					String.valueOf(kehuziliao.get(i).getLeave().getContent()),
			});
		}
		String fileName = "离职登记";
		try {
			WritableWorkbook wbook = Workbook
					.createWorkbook(new FileOutputStream("E:\\表格专用\\导出Excel"+"/"+fileName + ".xls")); // 建立excel文件
			WritableSheet wsheet = wbook.createSheet("导出数据", 0); // sheet名称
			WritableCellFormat cellFormatNumber = new WritableCellFormat();
			cellFormatNumber.setAlignment(Alignment.RIGHT);
			WritableFont wf = new WritableFont(WritableFont.ARIAL, 12,
					WritableFont.BOLD, false, UnderlineStyle.NO_UNDERLINE,
					jxl.format.Colour.BLACK); // 定义格式、字体、粗体、斜体、下划线、颜色
			WritableCellFormat wcf = new WritableCellFormat(wf); // title单元格定义
			WritableCellFormat wcfc = new WritableCellFormat(); // 一般单元格定义
			WritableCellFormat wcfe = new WritableCellFormat(); // 一般单元格定义
			wcf.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式
			wcfc.setAlignment(jxl.format.Alignment.CENTRE); // 设置对齐方式

			wcf.setBorder(jxl.format.Border.ALL,
					jxl.format.BorderLineStyle.THIN);
			wcfc.setBorder(jxl.format.Border.ALL,
					jxl.format.BorderLineStyle.THIN);
			wcfe.setBorder(jxl.format.Border.ALL,
					jxl.format.BorderLineStyle.THIN);

			wsheet.setColumnView(0, 20);// 设置列宽
			wsheet.setColumnView(1, 10);
			wsheet.setColumnView(2, 20);

			int rowIndex = 0;
			int columnIndex = 0;
			if (null != data) {
				// rowIndex++;
				columnIndex = 0;
				wsheet.setRowView(rowIndex, 500);// 设置标题行高
				wsheet.addCell(new Label(columnIndex++, rowIndex, fileName, wcf));
				wsheet.mergeCells(0, rowIndex,  7, rowIndex);// 合并标题所占单元格
				rowIndex++;
				columnIndex = 0;
				wsheet.setRowView(rowIndex, 380);// 设置项目名行高
				wsheet.addCell(new Label(columnIndex++, rowIndex, "部门", wcf));
				wsheet.addCell(new Label(columnIndex++, rowIndex, "职位", wcf));
				wsheet.addCell(new Label(columnIndex++, rowIndex, "员工编号", wcf));
				wsheet.addCell(new Label(columnIndex++, rowIndex, "姓名", wcf));
				wsheet.addCell(new Label(columnIndex++, rowIndex, "性别", wcf));
				wsheet.addCell(new Label(columnIndex++, rowIndex, "离职日期", wcf));
				wsheet.addCell(new Label(columnIndex++, rowIndex, "离职原因", wcf));
				// 开始行循环
				for (String[] array : data) { // 循环列
					rowIndex++;
					columnIndex = 0;
					for(int j=0;j<7;j++) {
						wsheet.addCell(new Label(columnIndex++, rowIndex, array[j],wcfe));
					}
				}
				rowIndex++;
				columnIndex = 0;
			}
			wbook.write();
			if (wbook != null) {
				wbook.close();
			}
			message.put("code", "200");
			message.put("msg", "导出成功");
			return message;
		} catch (Exception e) {
			message.put("code", "300");
			message.put("msg", "导出失败");
			return message;
		}
	}
	
	
	@GetMapping("modifyUser/{uid}")
	public Map<String, Object> modifyUser(@PathVariable int uid) {
		int count=ubiz.updateUser(new zxpp(uid, null, null, null, null, null, null, null, null, null, 0));
		Map<String, Object> message = new HashMap<String, Object>();
		if(count!=0) {
			message.put("code", "ok");
			message.put("msg", "回滚成功!");
		}else {
			message.put("code", "300");
			message.put("msg", "回滚失败！");
		}
		return message;
	}

}
