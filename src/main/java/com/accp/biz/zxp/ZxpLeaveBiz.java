package com.accp.biz.zxp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zxp.*;
import com.accp.pojo.zxp.*;
import com.accp.vo.zxp.ZxpLVO;
import com.accp.vo.zxp.ZxpLeaveVO;
import com.accp.vo.zxp.ZxpUTVO;
import com.accp.vo.zxp.ZxpUVO;
import com.accp.vo.zxp.ZxpUserVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZxpLeaveBiz {
	@Autowired
	private  IZxpUserDao dao;
	@Autowired
	private IZxpLeaveDao ldao;
	@Autowired
	private IZxpRoleDao rdao;
	@Autowired
	private IZxpDepartmentDao ddao;
	
	/*
	 * public PageInfo<ZxpLeave> queryRoleAll(Integer n,Integer s){
	 * PageHelper.startPage(n,s); List<ZxpLeave> list = dao.selectList(null);
	 * PageInfo<ZxpLeave> pageInfo=new PageInfo<ZxpLeave>(list); return pageInfo; }
	 */
	public PageInfo<ZxpLVO> findUR(Integer n,Integer s,String name){
		PageHelper.startPage(n,s);
		return new PageInfo<ZxpLVO> (ldao.findUVO(name));
	}
	public ZxpLVO findU(String name){
		return  (ZxpLVO) ldao.findUVO(name);
	}
	
	public int deletea(int id) {
		return ldao.deletea(id);
	}
	
	public List<ZxpLVO> findx() {
		return ldao.findX();
	}
	
	public PageInfo<ZxpLeaveVO> finds(Integer n,Integer s){
		PageHelper.startPage(n,s);
		QueryWrapper<zxpp> qw=Wrappers.query();
		qw.eq("ustatus", 1);
		 List<ZxpLeave> use=ldao.selectList(null);
		 List<ZxpLeaveVO> uvo=new ArrayList<ZxpLeaveVO>();
		  for (ZxpLeave zxp : use) { zxpp
		  lx=dao.selectById(zxp.getUid()); 
		  uvo.add(new ZxpLeaveVO(lx,zxp)); 
		  }
		 
		return new PageInfo<ZxpLeaveVO> (uvo);
	}
	public List<ZxpLeaveVO> finda(){
		QueryWrapper<zxpp> qw=Wrappers.query();
		QueryWrapper<ZxpLeave> qq=Wrappers.query();
		 List<ZxpLeave> use=ldao.selectList(null);
		 List<ZxpLeaveVO> uvo=new ArrayList<ZxpLeaveVO>();
		  for (ZxpLeave zxp : use) {
			zxpp lx=dao.selectById(zxp.getUid()); 
			uvo.add(new ZxpLeaveVO(lx,zxp)); 
		  }
		 
		return  uvo;
	}
	public int addLeave(ZxpLeave leave) {
		return ldao.insert(leave);
	}
	
	public PageInfo<ZxpLeaveVO> findLeave(Integer n,Integer s,String name){
		PageHelper.startPage(n,s);
		return new PageInfo<ZxpLeaveVO> (ldao.findLeave(name));
	}
	
	public PageInfo<zxpp> findUser(Integer n,Integer s) {
		PageHelper.startPage(n,s);
		QueryWrapper<zxpp> qw = Wrappers.query();
		qw.eq("ustatus", 0);
		List<zxpp> list = dao.selectList(qw);
		PageInfo<zxpp> pageInfo=new PageInfo<zxpp>(list);
		return pageInfo;
	}
	
	public ZxpUVO selectuser() {
		zxpp user= dao.selectOne(null);
		ZxpRole role=rdao.selectById(user.getRid());
		ZxpDepartment department=ddao.selectById(user.getDepid());
		return new ZxpUVO(user,role,department);
	}
}
