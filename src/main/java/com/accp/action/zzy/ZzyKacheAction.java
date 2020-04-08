package com.accp.action.zzy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zzy.ZzyKacheBiz;
import com.accp.pojo.zzy.ZzyKache;
import com.accp.pojo.zzy.ZzyStar;
import com.accp.vo.zzy.ZzyKacheVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zzy/api/kache")
public class ZzyKacheAction {

	@Autowired
	private ZzyKacheBiz biz;
	
	/**
	 * 分页查询外勤车辆
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("queryKache/{pageNum}/{pageSize}")
	public PageInfo<ZzyKacheVo> queryKache(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		System.out.println(biz.queryKache(pageNum, pageSize));
		return biz.queryKache(pageNum, pageSize);		
	}
	
	/**
	 * 新增外勤车辆
	 * @param carinfo
	 * @return
	 */
	@PostMapping("addkache")
	public Map<String, Object> addCarinfo(@RequestBody ZzyKache kache) {
		int count=biz.addKache(kache);
		System.out.println(kache);
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
	/**
	 * 删除救援车辆
	 * @param kaid
	 * @return
	 */
	@DeleteMapping("deleteKache/{kaid}")
	public Map<String, Object> deleteKache(@PathVariable int kaid) {
		int count=biz.deleteKache(kaid);
		Map<String, Object> message = new HashMap<String, Object>();
		if(count!=0) {
			message.put("code", "200");
			message.put("msg", "删除成功!");
		}else {
			message.put("code", "300");
			message.put("msg", "删除失败!");
		}
		return message;
	}
}
