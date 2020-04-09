package com.accp.zxp;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.zxp.ZxpUserBiz;
import com.accp.pojo.zxp.ZxpTongxunlu;
import com.accp.pojo.zxp.tongxunlu;
import com.accp.pojo.zxp.zxpp;
import com.alibaba.fastjson.JSON;

@SpringBootTest
public class Zxpuser {


	@Autowired
	private ZxpUserBiz biz;




	@Test 
	public void show() {
		biz.finds(1, 1).getList().forEach(action->{
			System.out.println(action);
		});
	}

}
