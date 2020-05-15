package com.accp.biz.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.sw.IWeixiuDao;
import com.accp.pojo.sw.Weixiurecord;
import com.accp.vo.sw.WeixiuVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class WeixiuBiz {
	@Autowired
	private IWeixiuDao dao;

	/**
	 * 修改结算状态
	 * 
	 * @param weixiu
	 * @return
	 */
	public int modifyById(Weixiurecord weixiu) {
		return dao.updateById(weixiu);
	}
	
	public Integer modifyWxStatus(String wxrecordid) {
		return dao.modifyWxStatus(wxrecordid);
	}

	/**
	 * 根据维修单号查询
	 * 
	 * @param recordid
	 * @return
	 */
	public PageInfo<WeixiuVo> findPageByRecordid(String recordid) {
		PageHelper.startPage(1, 1);
		return new PageInfo<>(dao.queryListByJsstatus(null, recordid));
	}

	/**
	 * 根据状态查询维修
	 * 
	 * @param status
	 * @return
	 */
	public PageInfo<WeixiuVo> findPageByStatus(Integer pageNum, Integer pageSize, Integer status) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(dao.queryListByJsstatus(status, null));
	}

	/**
	 * 根据客户id或车牌查询消费记录并分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param id
	 * @return
	 */
	public PageInfo<WeixiuVo> findPage(Integer pageNum, Integer pageSize, Integer id, String carno) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(dao.queryListById(id, carno));
	}

}
