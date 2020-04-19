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
import com.accp.vo.zxp.ZxpTXL;
import com.accp.vo.zxp.ZxpUTVO;
import com.accp.vo.zxp.ZxpUV;
import com.accp.vo.zxp.ZxpUserVO;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZxpTongxunluBiz {
	@Autowired
	private  IZxpUserDao dao;
	@Autowired
	private IZxpTongxunluDao tdao;
	
	public PageInfo<ZxpTXL> findUR(Integer n,Integer s,String name){
		PageHelper.startPage(n,s);
		return new PageInfo<ZxpTXL> (tdao.selectUSER(name));
	}
	public PageInfo<ZxpUTVO> findUR(Integer n,Integer s,String name,Integer id){
		PageHelper.startPage(n,s);
		return new PageInfo<ZxpUTVO> (tdao.findUVO(name,id));
	}
	
	
	public PageInfo<ZxpUserVO> finds(Integer n,Integer s,String name){
		PageHelper.startPage(n,s);
		return new PageInfo<ZxpUserVO> (dao.findUser(name));
	}
	
	
}
