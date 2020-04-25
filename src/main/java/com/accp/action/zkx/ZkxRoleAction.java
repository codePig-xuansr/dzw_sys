package com.accp.action.zkx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zkx.ZkxRoleBiz;
import com.accp.pojo.zkx.ZkxRole;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zkx/api/role")
public class ZkxRoleAction {

	@Autowired
	private ZkxRoleBiz biz;
	
	@GetMapping("{num}/{size}")
	public PageInfo<ZkxRole> queryAllRole(@PathVariable Integer num,@PathVariable Integer size){
		return biz.queryAllRole(num, size);
	}
}
