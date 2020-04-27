package com.accp.action.zkx;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zkx.ZkxAlipayServiceImpl;
import com.alipay.demo.trade.Main;

@RestController
@RequestMapping("/zkx/api/pay")
public class ZkxAlipay {

	Main m=new Main();
	
	ZkxAlipayServiceImpl pay;
	
	@GetMapping("payRes/{payNo}")
	public String getPayResult(@PathVariable String payNo) {
		return m.test_trade_query(payNo);
	}
	
	@GetMapping("getImg/{weixiuno}/{jsmoney}")
	public String getPayImg(@PathVariable String weixiuno,@PathVariable String jsmoney) {
		return m.test_trade_precreate(weixiuno,jsmoney);
	}
	
	@GetMapping("getResult/{order_number}/{total_amount}")
	public String getResult(@PathVariable String order_number, @PathVariable String total_amount) throws IOException {
		return pay.aliPay(order_number, total_amount);
	}
}
