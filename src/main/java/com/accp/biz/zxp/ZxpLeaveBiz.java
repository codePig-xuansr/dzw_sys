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
public class ZxpLeaveBiz {
	@Autowired
	private IZxpLeaveDao dao;
	
	public PageInfo<ZxpLeave> queryRoleAll(Integer n,Integer s){
		PageHelper.startPage(n,s);
		List<ZxpLeave> list = dao.selectList(null);
		PageInfo<ZxpLeave> pageInfo=new PageInfo<ZxpLeave>(list);
		return pageInfo;
	}
}
