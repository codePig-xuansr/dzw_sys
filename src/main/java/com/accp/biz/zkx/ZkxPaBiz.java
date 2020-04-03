package com.accp.biz.zkx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zkx.ZkxPaDao;
import com.accp.pojo.zkx.ZkxPa;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZkxPaBiz {

	@Autowired
	private ZkxPaDao dao;

	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer removePaByRid(Integer rid) {
		return dao.deleteById(rid);
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public Integer addPa(List<ZkxPa> plist) {
		return dao.addPas(plist);
	}
}
