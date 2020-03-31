package com.accp.biz.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.sw.IVipDao;
import com.accp.pojo.sw.Vipcard;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class VipBiz {
	@Autowired
	private IVipDao dao;

	/**
	 * 查询会员卡是否重复
	 * 
	 * @param vipcode
	 * @return
	 */
	public int findRepetition(Integer vipcode) {
		QueryWrapper<Vipcard> qw = Wrappers.query();
		qw.eq("vipcode", vipcode);
		return dao.selectCount(qw);
	}

	/**
	 * 新增会员卡
	 * 
	 * @param bill
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addVip(Vipcard vip) {
		return dao.insert(vip);
	}
}
