package com.accp.action.zxp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zxp.*;
import com.accp.pojo.ljl.LjlFadongji;
import com.accp.pojo.zxp.*;
import com.accp.vo.zxp.ZxpUTVO;
import com.accp.vo.zxp.ZxpUVO;
import com.accp.vo.zxp.ZxpUserVO;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zxp/api/txl")
public class ZxpTongxunluAction {
	@Autowired
	private ZxpTongxunluBiz biz;
	@Autowired
	private ZxpUserBiz ubiz;
	
	@GetMapping("queryTxlAll/{n}/{s}/{name}")
	public PageInfo<ZxpUserVO> queryTxlAll(@PathVariable Integer n,@PathVariable Integer s,@PathVariable String name) {		
		return biz.finds(n, s,"null".equals(name)?"":name);
	}
	
	@PostMapping("add")
	public Map<Object, Object> addUser(@RequestBody ZxpUserVO use){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int a=biz.addUser(use);
		if(a>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}
	
	
	@GetMapping("selectById/{tid}")
	public tongxunlu selectById(@PathVariable Integer tid) {
		return biz.findtxl(tid);
	}
	
	
	@DeleteMapping("delete/{tid}")
	public Map<Object, Object> deleteFadongji(@PathVariable Integer tid){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.deletetxl(tid);
		if (sum>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}
	
	@PutMapping("update")
	public Map<Object, Object> updateUser(@RequestBody tongxunlu txl) throws ParseException{
		Map<Object, Object> map = new HashMap<Object, Object>();
		
		 int sum = biz.updateTXL(txl);
		
		 if (sum>0) { 
			 map.put("code", "200"); 
		 }
		 else { 
			 map.put("code", "300");
			 }
		 
		return map;
	}
}
