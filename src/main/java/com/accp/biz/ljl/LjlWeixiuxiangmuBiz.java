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
import com.accp.vo.ljl.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LjlWeixiuxiangmuBiz {

	@Autowired
	private IWeixiuxiangmuDao dao;

	public List<LjlXiangmuLeibie> selectLeibie(){
		return dao.selectLeibie();
	}
	
	public PageInfo<LjlWeixiuXiangmuVo> selectWeixiu(Integer xid, Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<LjlWeixiuXiangmuVo>(dao.selectWeixiu(xid));
	}
	
	public LjlXiangmuLeibie selectTypeF(Integer xfid) {
		return dao.selectTypeF(xfid);
	}
	
	public PageInfo<LjlWeixiuXiangmuVo> ceshiselectWeixiu(int[] xid, Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<LjlWeixiuXiangmuVo>(dao.ceshiselectWeixiu(xid));
	}
	
	public PageInfo<LjlWeixiuXiangmuVo> selectLikeName(String xname, Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<LjlWeixiuXiangmuVo>(dao.selectLikeName(xname));
	}
	
	public int selectId() {
		return dao.selectId();
	}
}
