package com.accp.action.zkx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alipay.demo.trade.Main;

@RestController
@RequestMapping("/zkx/api/pay")
public class ZkxAlipay {

	Main m=new Main();
	
	@GetMapping
	public String getPayImg() {
		return m.test_trade_precreate();
	}
}
