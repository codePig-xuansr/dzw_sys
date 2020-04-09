package com.accp.action.zxp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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
import com.accp.biz.zzy.ZzyStarBiz;
import com.accp.pojo.ljl.LjlFadongji;
import com.accp.pojo.zxp.*;
import com.accp.pojo.zzy.ZzyStar;
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
	@GetMapping("queryUserAll/{n}/{s}")
	public PageInfo<zxpp> queryUserAll(@PathVariable Integer n,@PathVariable Integer s) {		
		return biz.queryUserAll(n, s);
	}


	@PostMapping("add")
	public Map<Object, Object> addFadongji(@RequestBody zxpp use){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int uid=use.getUid();
		String phone=use.getPhone();
		String email=use.getEmail();
		int sum = biz.addTongxunlu(new tongxunlu(0,uid,phone,email));
		if(sum>0) {
			tongxunlu txl=biz.find();
			int tid=txl.getTid();
			int jg=biz.addUser(new zxpp(use.getUid(), use.getUser(), use.getPwd(), use.getUsername(), use.getComedate(), use.getAddress(), use.getSex(), use.getDepid(), use.getRid(), tid));
			if(jg>0) {
				map.put("code", "200");
			}else {
				map.put("code", "300");
			}
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
	
	@GetMapping("selectById/{uid}")
	public zxpp selectById(@PathVariable Integer uid) {
		return biz.selectById(uid);
	}
	
	@GetMapping("selectByIdt/{uid}")
	public tongxunlu selectByIdt(@PathVariable Integer uid) {
		return biz.selectByIdt(uid);
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
	
	@PutMapping("update")
	public Map<Object, Object> updateFadongji(@RequestBody zxpp use) throws ParseException{
		Map<Object, Object> map = new HashMap<Object, Object>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date =use.getComedate(); 
		String strDate= sdf.format(date ); 
		Date newDate =sdf.parse(strDate);
		java.sql.Date resultDate = new java.sql.Date(newDate.getTime());
		use.setComedate(resultDate);
		System.out.println(use);
		
		 int sum = biz.updateUser(use); 
		
		 if (sum>0) { map.put("code", "200"); }else { map.put("code", "300"); }
		 
		return map;
	}
}
