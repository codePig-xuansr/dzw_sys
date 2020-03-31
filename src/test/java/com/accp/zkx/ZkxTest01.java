package com.accp.zkx;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
	
}
