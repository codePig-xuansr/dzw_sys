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
import com.accp.pojo.zkx.ZkxUser;
import com.accp.pojo.zxp.*;
import com.accp.pojo.zzy.ZzyStar;
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
	
	public PageInfo<zxpp> queryUserAll(Integer n,Integer s){
		PageHelper.startPage(n,s);
		List<zxpp> list = dao.selectList(null);
		PageInfo<zxpp> pageInfo=new PageInfo<zxpp>(list);
		return pageInfo;
	}
	
	public int addUser(zxpp user) {
		return dao.insert(user);
	}
	
	public int addTongxunlu(tongxunlu tong) {
		return tdao.insert(tong);
	}
	
	
	  public tongxunlu find () {
		  return tdao.findT();
	  }
	 
	
	public int delete(Integer uid) {
		return dao.deleteById(uid);
	}
	
	public zxpp selectById(Integer uid) {
		return dao.selectById(uid);
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
	
	public PageInfo<ZxpUserVO> finds(Integer n,Integer s){
		PageHelper.startPage(n,s);
		QueryWrapper<zxpp> qw=Wrappers.query();
		QueryWrapper<tongxunlu> qq=Wrappers.query();
		 List<zxpp> use=dao.selectList(qw);
		 List<ZxpUserVO> uvo=new ArrayList<ZxpUserVO>();
		 for (zxpp zxp : use) {
			 tongxunlu tx=tdao.selectById(zxp.getTid());
			 uvo.add(new ZxpUserVO(tx,zxp));
		}
		return new PageInfo<ZxpUserVO> (uvo);
	}
	
	/*
	 * public tongxunlu findss() { return tdao.selectById(2); }
	 */
}
