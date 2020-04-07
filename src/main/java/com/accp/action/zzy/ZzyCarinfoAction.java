package com.accp.action.zzy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zzy.ZzyCarinfoBiz;
import com.accp.pojo.zzy.ZzyCarinfo;
import com.accp.pojo.zzy.ZzyStar;
import com.accp.vo.zzy.ZzyCarinfoVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zzy/api/carinfos")
public class ZzyCarinfoAction {

	@Autowired
	private ZzyCarinfoBiz biz;
	
	/**
	 * 分页查询外勤车辆
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("queryCarinfo/{pageNum}/{pageSize}")
	public PageInfo<ZzyCarinfoVo> queryCarinfo(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		return biz.queryCarinfo(pageNum, pageSize);
	}
	
	/**
	 * 新增外勤车辆
	 * @param carinfo
	 * @return
	 */
	@PostMapping("addCarinfo/{carinfo}")
	public Map<String, Object> addCarinfo(@RequestBody ZzyCarinfo carinfo) {
		int count=biz.addCarinfo(new ZzyCarinfo(carinfo.getCarno(),carinfo.getCarpp(),carinfo.getCarxinghao(),1,carinfo.getLicheng()));
		System.out.println();
		Map<String, Object> message = new HashMap<String, Object>();
		if(count!=0) {
			message.put("code", "ok");
			message.put("msg", "新增成功!");
		}else {
			message.put("code", "300");
			message.put("msg", "新增失败！");
		}
		return message;
	}
}
