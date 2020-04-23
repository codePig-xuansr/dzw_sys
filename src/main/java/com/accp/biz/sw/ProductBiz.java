package com.accp.biz.sw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.sw.IProductDao;
import com.accp.vo.sw.ProductVo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ProductBiz {
	@Autowired
	private IProductDao dao;

	/**
	 * 根据维修单号查询消费商品
	 * 
	 * @param recordid
	 * @return
	 */
	public List<ProductVo> findListByRecordid(String recordid) {
		return dao.queryListByRecordid(recordid);
	}
}
