package com.accp.biz.zzy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zzy.IZzyStarDao;
import com.accp.pojo.zzy.ZzyStar;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZzyStarBiz {
	@Autowired
	private IZzyStarDao dao;
	public PageInfo<ZzyStar> queryStarAll(Integer n,Integer s){
		PageHelper.startPage(n,s);
		List<ZzyStar> list = dao.selectList(null);
		PageInfo<ZzyStar> pageInfo=new PageInfo<ZzyStar>(list);
		System.out.println(pageInfo);
		return pageInfo;
	}
}
