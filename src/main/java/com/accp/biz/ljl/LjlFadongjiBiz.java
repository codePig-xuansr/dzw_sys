package com.accp.biz.ljl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ljl.ILjlFadongjiDao;
import com.accp.pojo.ljl.LjlFadongji;
import com.accp.pojo.zkx.ZkxUser;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LjlFadongjiBiz {

	@Autowired
	private ILjlFadongjiDao dao;

	public PageInfo<LjlFadongji> selectAll(Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<LjlFadongji>(dao.selectList(null));
	}
	
	public int selectId() {
		return dao.selectId();
	}
	public int addFadongji(LjlFadongji fdj) {
		return dao.addFadongji(fdj);
	}
	
	public LjlFadongji selectById(Integer fadongjiid) {
		return dao.selectById(fadongjiid);
	}
	
	public int updateFadongji(LjlFadongji fdj) {
		return dao.updateFadongji(fdj);
	}
	
	public int delete(Integer fadongjiid) {
		return dao.deletefadongji(fadongjiid);
	}
	
	public PageInfo<LjlFadongji> selectLikeName(String fadongjiname) {
		//QueryWrapper<ZkxUser> qw=Wrappers.query();
		return new PageInfo<LjlFadongji>(dao.selectLikeName(fadongjiname));
	}
}
