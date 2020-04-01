package com.accp.biz.zkx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zkx.ZkxUserDao;
import com.accp.pojo.zkx.ZkxUser;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZkxUserBiz {

	@Autowired
	private ZkxUserDao dao;
	
	/**
	 * 查询用户密码是否正确
	 * @param user 用户名
	 * @param pwd 密码
	 * @return
	 */
	public ZkxUser queryUser(String user,String pwd) {
		QueryWrapper<ZkxUser> qw=Wrappers.query();
		qw.eq("user", user).eq("pwd", pwd);
		return dao.selectOne(qw);
	}
	
	public List<ZkxUser> queryUserList(){
		return dao.selectList(null);
	}
}
