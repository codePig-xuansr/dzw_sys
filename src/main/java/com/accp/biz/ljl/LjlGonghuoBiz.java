package com.accp.biz.ljl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ljl.*;
import com.accp.pojo.ljl.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LjlGonghuoBiz {
	@Autowired
	private ILjlGonghuoDao dao;

	public PageInfo<LjlGonghuoDanwei> selectAll(Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<LjlGonghuoDanwei>(dao.selectAll());
	}
	

	public int insertGonghuo(LjlGonghuoDanwei g) {
		return dao.insertGonghuo(g);
	}
	
	public LjlGonghuoDanwei selectById(int ghid) {
		return dao.selectById(ghid);
	}
	
	public int updateGonghuo(LjlGonghuoDanwei g) {
		return dao.updateGonghuo(g);
	}
	
	public PageInfo<LjlGonghuoDanwei> selectAllByName(String name,Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<LjlGonghuoDanwei>(dao.selectAllByName(name));
	}
	
	public int deleteGonghuo(int ghid) {
		return dao.deleteGonghuo(ghid);
	}

}
