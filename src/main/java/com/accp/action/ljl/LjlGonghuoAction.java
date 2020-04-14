package com.accp.action.ljl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljl.*;
import com.accp.pojo.ljl.LjlGonghuoDanwei;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/ljl/ghdw")
public class LjlGonghuoAction {
	
	@Autowired
	private LjlGonghuoBiz biz;
	
	@GetMapping("/gonghuo/All/{n}/{s}")
	public PageInfo<LjlGonghuoDanwei> selectAll(@PathVariable Integer n, @PathVariable Integer s){
		return biz.selectAll(n, s);
	}
	
	@GetMapping("All/danwei/byname/{ghname}/{n}/{s}")
	public PageInfo<LjlGonghuoDanwei> selectByname(@PathVariable String ghname, @PathVariable int n, @PathVariable int s){
		PageInfo<LjlGonghuoDanwei> list = biz.selectAllByName(ghname, n, s);
		return list;
	}
	
	@DeleteMapping("danweidel/{ghid}")
	public Map<Object, Object> delete(@PathVariable int ghid){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.deleteGonghuo(ghid);
		if (sum>0) {
			map.put("msg", "移除成功");
		}else {
			map.put("msg", "移除失败");
		}
		return map;
	}
	
	@GetMapping("/gonghuo/selectByid/{ghid}")
	public LjlGonghuoDanwei selectByid(@PathVariable int ghid){
		return biz.selectById(ghid);
	}
	
	@PutMapping("updatedanwei")
	public Map<Object, Object> update(@RequestBody LjlGonghuoDanwei guohuoadd){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.updateGonghuo(guohuoadd);
		if (sum>0) {
			map.put("msg", "修改成功");
		}else {
			map.put("msg", "修改失败");
		}
		return map;
	}
	
	@PostMapping("gonghuodanwei/add")
	public Map<Object, Object> add(@RequestBody LjlGonghuoDanwei guohuoadd){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.insertGonghuo(guohuoadd);
		if (sum>0) {
			map.put("msg", "添加成功");
		}else {
			map.put("msg", "添加失败");
		}
		return map;
	}

}
