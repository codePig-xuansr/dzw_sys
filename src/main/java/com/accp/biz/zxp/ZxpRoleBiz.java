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
public class ZxpRoleBiz {
	
	@Autowired
	private IZxpRoleDao dao;
	
	public PageInfo<ZxpRole> queryRoleAll(Integer n,Integer s){
		PageHelper.startPage(n,s);
		List<ZxpRole> list = dao.selectList(null);
		PageInfo<ZxpRole> pageInfo=new PageInfo<ZxpRole>(list);
		return pageInfo;
	}
	
	public int addRole(ZxpRole role) {
		return dao.insert(role);
	}
	
	public int delete(Integer rid) {
		return dao.deleteById(rid);
	}
	
	public ZxpRole selectByIdt(Integer uid) {
		return dao.selectById(uid);
	}
	
	public int update(ZxpRole role) {
		return dao.updateById(role);
	}
}
