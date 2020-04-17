package com.accp.action.zxp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.omg.CosNaming.IstringHelper;
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
import com.accp.biz.zzy.ZzyStarBiz;
import com.accp.pojo.ljl.LjlFadongji;
import com.accp.pojo.zxp.*;
import com.accp.pojo.zzy.ZzyStar;
import com.accp.vo.zxp.ZxpUVO;
import com.accp.vo.zxp.ZxpUserVO;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zxp/api/user")
public class ZxpUserAction {
	@Autowired
	private ZxpUserBiz biz;

	/**
	 * 查询状态信息
	 * @param n
	 * @param s
	 * @return
	 */
	@GetMapping("queryUserAll/{n}/{s}/{name}")
	public PageInfo<zxpp> queryUserAll(@PathVariable Integer n,@PathVariable Integer s,@PathVariable String name) {	
		return biz.queryUserAll(n, s,"null".equals(name)?"":name);
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
	
	@PostMapping("add1")
	public Map<Object, Object> addUser1(@RequestBody List<zxpp> user){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int a=biz.addU(user);
		if(a>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}


	@DeleteMapping("delete/{uid}")
	public Map<Object, Object> deleteFadongji(@PathVariable Integer uid){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.delete(uid);
		if (sum>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}
	
	
	
	@GetMapping("selectByIdt/{uid}")
	public tongxunlu selectByIdt(@PathVariable Integer uid) {
		return biz.selectByIdt(uid);
	}
	
	@GetMapping("finduid")
	public zxpp finduid() {
		return biz.finduid();
	}
	
	@PutMapping("updatetxl")
	public Map<Object, Object> updateTxl(@RequestBody tongxunlu txl) throws ParseException{
		Map<Object, Object> map = new HashMap<Object, Object>();
		
		 int sum = biz.updateTxl(txl); 
		
		 if (sum>0) {
			 map.put("code", "200"); 
		 }else {
			 map.put("code", "300"); 
			 
		 }
		 
		return map;
	}
	
	@GetMapping("selectById/{uid}")
	public ZxpUVO selectById(@PathVariable Integer uid) {
		return biz.selectById(uid);
	}
	
	@PutMapping("update")
	public Map<Object, Object> updateFadongji(@RequestBody zxpp use) throws ParseException{
		Map<Object, Object> map = new HashMap<Object, Object>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date =use.getComedate(); 
		String strDate= sdf.format(date ); 
		Date newDate =sdf.parse(strDate);
		java.sql.Date resultDate = new java.sql.Date(newDate.getTime());
		use.setComedate(resultDate);
		
		 int sum = biz.updateUser(use); 
		
		 if (sum>0) { map.put("code", "200"); }else { map.put("code", "300"); }
		 
		return map;
	}
	
	@GetMapping("queryDepartment/{n}/{s}")
	public PageInfo<ZxpDepartment> queryDepartment(@PathVariable Integer n,@PathVariable Integer s){
		return biz.findDepartment(n,s);
	}
	
	@GetMapping("queryRole/{n}/{s}")
	public PageInfo<ZxpRole> queryRole(@PathVariable Integer n,@PathVariable Integer s){
		return biz.findRole(n,s);
	}
}
