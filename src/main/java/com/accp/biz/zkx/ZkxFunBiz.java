package com.accp.biz.zkx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zkx.ZkxFunDao;
import com.accp.pojo.zkx.ZkxFunction;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZkxFunBiz {
	
	@Autowired
	private ZkxFunDao dao;
	
	public List<ZkxFunction> showFunByUser(String user,String pwd){
		return dao.showFunByUser(user, pwd);
	}

}
