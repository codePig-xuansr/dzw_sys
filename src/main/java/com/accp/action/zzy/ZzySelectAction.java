package com.accp.action.zzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zzy.ZzySelectBiz;
import com.accp.pojo.zzy.ZzyDepartment;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zxp/api/select")
public class ZzySelectAction {
	@Autowired
	private ZzySelectBiz biz;
	
	@GetMapping("queryDepartment/{n}/{s}")
	public PageInfo<ZzyDepartment> queryDepartment(@PathVariable Integer n,@PathVariable Integer s){
		return biz.findDepartment(n, s);
	}
}
