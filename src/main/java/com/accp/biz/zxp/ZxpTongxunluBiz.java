package com.accp.biz.zxp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zxp.*;
import com.accp.pojo.zxp.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZxpTongxunluBiz {
	@Autowired
	private IZxpTongxunluDao dao;
	
	public PageInfo<tongxunlu> queryRoleAll(Integer n,Integer s){
		PageHelper.startPage(n,s);
		List<tongxunlu> list = dao.selectList(null);
		PageInfo<tongxunlu> pageInfo=new PageInfo<tongxunlu>(list);
		return pageInfo;
	}
	
	
}
