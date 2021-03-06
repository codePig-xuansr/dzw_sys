package com.accp.biz.zzy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zzy.IZzyGonghuoDao;
import com.accp.pojo.zzy.ZzyBanzu;
import com.accp.pojo.zzy.ZzyGonghuo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZzyGonghuoBiz {
	@Autowired
	private IZzyGonghuoDao dao;
	
	/**
	 * 查询供货商名称
	 * @return
	 */	
	public PageInfo<ZzyGonghuo> queryGonghuo(Integer n,Integer s){
		PageHelper.startPage(n,s);
		List<ZzyGonghuo> list = dao.selectList(null);
		PageInfo<ZzyGonghuo> pageInfo=new PageInfo<ZzyGonghuo>(list);
		//System.out.println(pageInfo);
		return pageInfo;
	}
}
