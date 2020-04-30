package com.accp.zxp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.zxp.ZxpLeaveBiz;
import com.accp.biz.zxp.ZxpRoleBiz;
import com.accp.biz.zxp.ZxpTongxunluBiz;
import com.accp.biz.zxp.ZxpUserBiz;
import com.accp.pojo.zxp.ZxpLeave;
import com.accp.pojo.zxp.ZxpRole;
import com.accp.pojo.zxp.ZxpTongxunlu;
import com.accp.pojo.zxp.tongxunlu;
import com.accp.pojo.zxp.zxpp;
import com.accp.vo.zxp.ZxpUserVO;
import com.alibaba.fastjson.JSON;

@SpringBootTest
public class Zxpuser {


	@Autowired
	private ZxpUserBiz biz;
	@Autowired
	private ZxpLeaveBiz lbiz;
	@Autowired
	private ZxpRoleBiz rbiz;
	@Autowired
	private ZxpTongxunluBiz tbiz;
	



	@Test 
	public void show() {
		
//		  lbiz.finds(1, 1).getList().forEach(action->{ System.out.println(action); });
		/* rbiz.addRole(new ZxpRole(0,"bb","保镖","系统管理员",new Date())); */
		/*
		 * zxpp zx= biz.find1("李四"); lbiz.addRole(new ZxpLeave(0,zx.getUid(),new
		 * Date(),"缺钱"));
		 */
		/*int a= biz.addTongxunlu(new tongxunlu(0, 7, "111", "1111"));*/
		/*
		 * biz.addUser(new zxpp(7, "11", "1", "1", new Date(), "1", "男", 1, 1, 7, 0));
		 */
		/*
		 * tongxunlu a=new tongxunlu(0, 1, "1", "1"); tongxunlu b=new tongxunlu(0, 1,
		 * "1", "1"); tongxunlu c=new tongxunlu(0, 1, "1", "1"); List<tongxunlu>
		 * list=new ArrayList<tongxunlu>(); list.add(a); list.add(b); list.add(c); zxpp
		 * d=new zxpp(125, "1", "1", "1", new Date(), "1", "男", 1, 1, 1, 0);
		 * biz.addUser(new ZxpUserVO(list,d));
		 */
		/* System.out.println( biz.finds(1, 3)); */
		/*
		 * biz.findDepartment(); biz.findRole();
		 */
		/*
		 * biz.updateUser(new zxpp(55, null, null, null, null, null, null, null, null,
		 * null, 0));
		 */
		 System.out.println(biz.findRole(1,20)); 
	}
	
	
	

}
