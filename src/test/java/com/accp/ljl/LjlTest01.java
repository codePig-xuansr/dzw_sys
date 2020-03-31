package com.accp.ljl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.ljl.LjlFadongjiBiz;
import com.accp.pojo.ljl.LjlFadongji;
import com.github.pagehelper.PageInfo;

@SpringBootTest
public class LjlTest01 {
	@Autowired
	private LjlFadongjiBiz biz;

	@Test
	void contextLoads() {
		/*
		 * PageInfo<LjlFadongji> lists = biz.selectAll(1, 5);
		 * lists.getList().forEach(row->{ System.out.println(row); });
		 */
		System.out.println(biz.delete(7));
	}
}
