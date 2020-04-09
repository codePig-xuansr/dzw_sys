package com.accp.action.zkx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zkx.ZkxMainBiz;

@RestController
@RequestMapping("/zkx/api/main")
public class ZkxMainAction {

	@Autowired
	private ZkxMainBiz biz;
	
	@GetMapping("dd")
	public Integer queryToDayDCount() {
		return biz.queryToDayDCount();
	}
	
	@GetMapping("money")
	public Float queryToDayMoney() {
		return biz.queryToDayMoney();
	}
	
	@GetMapping("wx")
	public Integer queryToDayWx() {
		return biz.queryToDayWx();
	}
	
	@GetMapping("sum")
	public Float querySumMoney() {
		return biz.querySumMoney();
	}
}
