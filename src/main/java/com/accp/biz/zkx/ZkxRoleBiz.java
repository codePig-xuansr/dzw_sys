package com.accp.biz.zkx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zkx.ZkxRoleDao;
import com.accp.pojo.zkx.ZkxRole;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZkxRoleBiz {

	@Autowired
	private ZkxRoleDao dao;
	
	/**
	 * 查询所有角色
	 * @param num
	 * @param size
	 * @return
	 */
	public PageInfo<ZkxRole> queryAllRole(Integer num,Integer size){
		QueryWrapper<ZkxRole> qw=Wrappers.query();
		PageHelper.startPage(num, size);
		return new PageInfo<ZkxRole>(dao.selectList(null));
	}
}
