package com.accp.zzy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.zzy.ZzyBanzuBiz;
import com.accp.biz.zzy.ZzyKacheBiz;
import com.accp.biz.zzy.ZzyProductBiz;
import com.accp.biz.zzy.ZzyStarBiz;
import com.accp.pojo.zzy.ZzyKache;

@SpringBootTest
public class ZzyTest01 {
	
	@Autowired
	private ZzyKacheBiz biz;

	//删除状态信息
	/*
	 * @Test public void show() { biz.queryCarinfo(1, 3); }
	 */
	@Test
	public void show() {
		System.out.println(biz.queryKacheByStaro(1, 2));
		
	}
	/*public void show() {
		biz.deleteKache(21);
	}*/
	/*public void show() {
		biz.queryKache(1, 1).getList().forEach(action->{
			System.out.println(action);
		});	
	}*/
//	public void insertCarinfo() {
//		biz.addCarinfo(new ZzyKache("10033","22","33",1,22));
//	}
	/*public void show() {
		biz.deleteStar(5);
	}*/
}
