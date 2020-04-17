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
import com.accp.pojo.ljl.LjlFadongji;
import com.accp.pojo.zxp.*;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zxp/api/role")
public class ZxpRoleAction {
	@Autowired
	private ZxpRoleBiz biz;
	
	@GetMapping("queryRoleAll/{n}/{s}")
	public PageInfo<ZxpRole> queryUserAll(@PathVariable Integer n,@PathVariable Integer s) {		
		return biz.queryRoleAll(n, s);
	}
	
	@PostMapping("add")
	public Map<Object, Object> addRole(@RequestBody ZxpRole role){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.addRole(new ZxpRole(0,"bb",role.getRname(),"系统管理员",new Date()));
		if(sum>0) {
				map.put("code", "200");
				
			}else {
				map.put("code", "300");
			}
		return map;
	}
	
	
	@DeleteMapping("delete/{rid}")
	public Map<Object, Object> deleteRole(@PathVariable Integer rid){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.delete(rid);
		if (sum>0) {
			map.put("code", "200");
		}else {
			map.put("code", "300");
		}
		return map;
	}
	
	
	@GetMapping("selectById/{rid}")
	public ZxpRole selectByIda(@PathVariable Integer rid) {
		return biz.selectByIdt(rid);
	}
	
	@PutMapping("update")
	public Map<Object, Object> updateFadongji(@RequestBody ZxpRole role) throws ParseException{
		Map<Object, Object> map = new HashMap<Object, Object>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date =role.getCreatedate();
		String strDate= sdf.format(date ); 
		Date newDate =sdf.parse(strDate);
		java.sql.Date resultDate = new java.sql.Date(newDate.getTime());
		role.setCreatedate(resultDate);
		 int sum = biz.update(role); 
		
		 if (sum>0) { map.put("code", "200"); }else { map.put("code", "300"); }
		 
		return map;
	}
}
