package com.accp.biz.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.sw.IJsrecordDao;
import com.accp.pojo.sw.Jsrecord;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class JsrecordBiz {
	@Autowired
	private IJsrecordDao dao;

	/**
	 * 新增结算
	 * 
	 * @param jsrecord
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addJrecord(Jsrecord jsrecord) {
		return dao.insert(jsrecord);
	}
}
