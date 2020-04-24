package com.accp.biz.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.sw.ICardanganDao;
import com.accp.pojo.sw.Cardangan;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CardanganBiz {
	@Autowired
	private ICardanganDao dao;

	/**
	 * 按照品牌编号查询所有车型
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Cardangan> findPage(Integer pid,Integer pageNum, Integer pageSize) {
		QueryWrapper<Cardangan> qw=Wrappers.query();
		PageHelper.startPage(pageNum, pageSize);
		if(pid!=0) {
			qw.eq("pid", pid);
			return new PageInfo<>(dao.selectList(qw));
		}
		return new PageInfo<>(dao.selectList(null));
	}
}
