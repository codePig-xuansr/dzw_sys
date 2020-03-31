package com.accp.biz.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.sw.IWeixiuDao;
import com.accp.vo.sw.WeixiuVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class WeixiuBiz {
	@Autowired
	private IWeixiuDao dao;

	/**
	 * 根据客户id查询客户的消费记录并分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param id
	 * @return
	 */
	public PageInfo<WeixiuVo> findPage(Integer pageNum, Integer pageSize, Integer id) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(dao.queryListById(id));
	}
}
