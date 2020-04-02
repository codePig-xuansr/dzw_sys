package com.accp.zzy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.zzy.ZzyStarBiz;

@SpringBootTest
public class ZzyTest01 {
	
	@Autowired
	private ZzyStarBiz biz;

	//删除状态信息
	@Test
	public void show() {
		biz.deleteStar(5);
	}
}
