package com.accp.ljl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.ljl.*;
import com.accp.pojo.ljl.*;
import com.github.pagehelper.PageInfo;

@SpringBootTest
public class LjlTest01 {
	@Autowired
	private LjlFadongjiBiz fbiz;
	
	@Autowired
	private LjlWeixiuxiangmuBiz wbiz;

	@Test
	void contextLoads() {
		/*
		 * PageInfo<LjlFadongji> lists = biz.selectAll(1, 5);
		 * lists.getList().forEach(row->{ System.out.println(row); });
		 */
		//System.out.println(biz.delete(7));
		/*
		 * wbiz.selectLeibie().forEach(row->{ System.out.println(row); });
		 
		wbiz.selectWeixiu(3, 1, 4).getList().forEach(r->{
			System.out.println(r);
		});*/
		//System.out.println(wbiz.selectTypeF(0, 3));
		int [] id = new int [3];
		id[0] = 1;
		id[1] = 3;
		wbiz.ceshiselectWeixiu(id).forEach(e->{
			System.out.println(e);
		});
	}
}
