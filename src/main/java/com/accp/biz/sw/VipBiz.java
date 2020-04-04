package com.accp.biz.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.sw.IVipDao;
import com.accp.pojo.sw.Vipcard;
import com.accp.vo.sw.VipVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class VipBiz {
	@Autowired
	private IVipDao dao;

	/**
	 * 修改vip积分状态
	 * 
	 * @param weixiu
	 * @return
	 */
	public int modifyById(Vipcard vip) {
		return dao.updateById(vip);
	}
	/**
	 * 会员登入
	 * 
	 * @param vipcode
	 * @param vippwd
	 * @return
	 */
	public Vipcard findLogin(Integer vipcode, String vippwd) {
		QueryWrapper<Vipcard> qw = Wrappers.query();
		qw.eq("vipcode", vipcode).eq("vippwd", vippwd);
		return dao.selectOne(qw);
	}

	/**
	 * 会员分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<VipVo> findPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(dao.queryList());
	}

	/**
	 * 查询具体会员
	 * 
	 * @param kid
	 * @return
	 */
	public VipVo findById(Integer kid) {
		return dao.queryById(kid);
	}

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

	/**
	 * 删除会员卡
	 * 
	 * @param id
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int removeVip(Integer id) {
		return dao.deleteById(id);
	}
}
