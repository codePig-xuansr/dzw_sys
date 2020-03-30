package com.accp.action.zkx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zkx.ZkxUserBiz;
import com.accp.pojo.zkx.ZkxUser;

@RestController
@RequestMapping("/api/zkx/user")
public class ZkxUserAction {

	@Autowired
	private ZkxUserBiz biz;
	
	@GetMapping("{user}/{pwd}")
	public ZkxUser loginUser(@PathVariable String user,@PathVariable String pwd) {
		return biz.queryUser(user, pwd);
	}
}