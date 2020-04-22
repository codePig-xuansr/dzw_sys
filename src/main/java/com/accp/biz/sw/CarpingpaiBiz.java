package com.accp.biz.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.sw.ICarpingpaiDao;
import com.accp.pojo.sw.Carpingpai;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CarpingpaiBiz {
	@Autowired
	private ICarpingpaiDao dao;

	/**
	 * 查询所有品牌
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Carpingpai> findPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(dao.selectList(null));
	}

}
