package com.accp.action.zkx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alipay.demo.trade.Main;

@RestController
@RequestMapping("/zkx/api/pay")
public class ZkxAlipay {

	Main m=new Main();
	
	@GetMapping("payRes/{payNo}")
	public String getPayResult(@PathVariable String payNo) {
		return m.test_trade_query(payNo);
	}
	
	@GetMapping("getImg/{weixiuno}/{jsmoney}")
	public String getPayImg(@PathVariable String weixiuno,@PathVariable String jsmoney) {
		return m.test_trade_precreate(weixiuno,jsmoney);
	}
}
