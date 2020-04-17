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
	
	public PageInfo<ZxpUserVO> finds(Integer n,Integer s){
		PageHelper.startPage(n,s);
		return new PageInfo<ZxpUserVO> (dao.findUser());
	}
	
	
}
