package com.accp.biz.zxp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zxp.*;
import com.accp.dao.zzy.IZzyStarDao;
import com.accp.pojo.ljl.LjlFadongji;
import com.accp.pojo.zkx.ZkxPa;
import com.accp.pojo.zkx.ZkxUser;
import com.accp.pojo.zxp.*;
import com.accp.pojo.zzy.ZzyStar;
import com.accp.vo.zxp.ZxpUV;
import com.accp.vo.zxp.ZxpUVO;
import com.accp.vo.zxp.ZxpUserVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZxpUserBiz {
	@Autowired
	private  IZxpUserDao dao;
	@Autowired
	private IZxpTongxunluDao tdao;
	@Autowired
	private IZxpRoleDao rdao;
	@Autowired
	private IZxpDepartmentDao ddao;
	
	public PageInfo<zxpp> queryUserAll(Integer n,Integer s,String name){
		PageHelper.startPage(n,s);
		QueryWrapper<zxpp> qw = Wrappers.query();
		qw.eq("ustatus", 0).like("username",  name);
		List<zxpp> list = dao.selectList(qw);
		PageInfo<zxpp> pageInfo=new PageInfo<zxpp>(list);
		return pageInfo;
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer addU(List<zxpp> ulist) {
		return dao.addUser(ulist);
	}
	
	public zxpp finduid() {
		return dao.finduid();
	}
	
	public int addUser(zxpp user) {
		return dao.insert(user);
	}
	
	public int addTongxunlu(tongxunlu tong) {
		return tdao.insert(tong);
	}
	
	public int addUser(ZxpUserVO use) {
		int us=dao.insert(use.getUser());
		for (tongxunlu tx : use.getTxl()) {
			tx.setUid(use.getUser().getUid());
			tdao.insert(tx);
		}
		return us;
	}
	public int insertUser(zxpp user) {
		return dao.insert(user);
	}
	
	
	
	  public tongxunlu find () {
		  return tdao.findT();
	  }
	 
	
	public int delete(Integer uid) {
		return dao.deleteById(uid);
	}
	
	public ZxpUVO selectById(Integer uid) {
		zxpp user=dao.selectById(uid);
		ZxpRole role=rdao.selectById(user.getRid());
		ZxpDepartment department=ddao.selectById(user.getDepid());
		return new ZxpUVO(user,role,department);
	}
	
	public int updateUser(zxpp use) {
		return dao.updateUser(use);
	}
	
	public tongxunlu selectByIdt(Integer uid) {
		return tdao.selectById(uid);
	}
	
	public int updateTxl(tongxunlu txl) {
		return tdao.updateT(txl);
	}
	
	public PageInfo<ZxpUserVO> finds(Integer n,Integer s,String name){
		PageHelper.startPage(n,s);
		return new PageInfo<ZxpUserVO> (dao.findUser(name));
	}
	
	public PageInfo<ZxpUV> findUR(Integer n,Integer s,String name){
		PageHelper.startPage(n,s);
		return new PageInfo<ZxpUV> (dao.findUVO(name));
	}
	
	public zxpp find1(String username) {
		return dao.find(username);
	}
	
	public PageInfo<ZxpRole> findRole(Integer n,Integer s) {
		PageHelper.startPage(n,s);
		return new PageInfo <ZxpRole> (rdao.selectList(null));
	}
	
	public PageInfo<ZxpDepartment> findDepartment(Integer n,Integer s) {
		PageHelper.startPage(n,s);
		return new PageInfo <ZxpDepartment> (ddao.selectList(null));
	}
}
