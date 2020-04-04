package com.accp.biz.sw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.sw.IFuwuDao;
import com.accp.vo.sw.FuwuVo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class FuwuBiz {
	@Autowired
	private IFuwuDao dao;

	/**
	 * 根据单号查询维修项目
	 * 
	 * @param recordid
	 * @return
	 */
	public List<FuwuVo> findByRecordid(String recordid) {
		return dao.queryList(recordid);
	}
}
