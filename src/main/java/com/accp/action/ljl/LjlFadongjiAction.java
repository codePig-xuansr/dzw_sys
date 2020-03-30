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
import com.accp.pojo.ljl.*;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/ljl/fdj")
public class LjlFadongjiAction {
	
	@Autowired
	private LjlFadongjiBiz biz;
	
	@GetMapping("/All/{sum}/{size}")
	public PageInfo<LjlFadongji> selectAll(@PathVariable Integer sum, @PathVariable Integer size){
		//System.out.println(1);
		return biz.selectAll(sum, size);
	}
	
	@GetMapping("/MaxId")
	public int selectAll(){
		//System.out.println(1);
		return biz.selectId();
	}
	
	@PostMapping("add")
	public Map<Object, Object> addFadongji(@RequestBody LjlFadongji fdj){
		Map<Object, Object> map = new HashMap<Object, Object>();
		//System.out.println(fdj);
		int sum = biz.addFadongji(fdj);
		if (sum>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}
	
	@GetMapping("selectById/{fadongjiid}")
	public LjlFadongji selectById(@PathVariable Integer fadongjiid) {
		return biz.selectById(fadongjiid);
	}
	
	@PutMapping("update")
	public Map<Object, Object> updateFadongji(@RequestBody LjlFadongji fdj){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.updateFadongji(fdj);
		if (sum>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}
	
	@DeleteMapping("delete/{fadongjiid}")
	public Map<Object, Object> deleteFadongji(@PathVariable Integer fadongjiid){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.delete(fadongjiid);
		//System.out.println(fadongjiid);
		if (sum>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}
}
