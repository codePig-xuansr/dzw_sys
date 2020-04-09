package com.accp.biz.zkx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zkx.ZkxMainDao;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZkxMainBiz {

	@Autowired
	private ZkxMainDao dao;
	
	public Integer queryToDayDCount() {
		return dao.queryToDayDCount();
	}
	
	public Float queryToDayMoney() {
		return dao.queryToDayMoney();
	}
	
	public Integer queryToDayWx() {
		return dao.queryToDayWx();
	}
	
	public Float querySumMoney() {
		return dao.querySumMoney();
	}
}
