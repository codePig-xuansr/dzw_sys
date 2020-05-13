package com.accp.zkx;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.zkx.ZkxAlipayServiceImpl;
import com.accp.biz.zkx.ZkxFunBiz;
import com.alibaba.fastjson.JSON;

@SpringBootTest
public class ZkxTest01 {

	@Autowired
	private ZkxFunBiz biz;
	
	

	@Test
	public void show() {
		System.out.println(JSON.toJSONString(biz.showFunByUser("admin", "admin")));
	}

	/*
	 * @Test public void aaa() { try {
	 * //service.aliPay("15893551503972020513153319", "747"); } catch (IOException
	 * e) { e.printStackTrace(); } }
	 */

}
