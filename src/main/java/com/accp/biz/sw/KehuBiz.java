package com.accp.biz.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.sw.IKehuDao;
import com.accp.pojo.sw.Kehu;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class KehuBiz {
	@Autowired
	private IKehuDao dao;

	/**
	 * 客户分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Kehu> findPage(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(dao.selectList(null));
	}

	/**
	 * 查询最新新增的客户
	 * 
	 * @return
	 */
	public Kehu findMaxId() {
		return dao.queryMaxId();
	}

	/**
	 * 根据客户id查询
	 * 
	 * @param id
	 * @return
	 */
	public Kehu findById(Integer id) {
		return dao.selectById(id);
	}

	/**
	 * 根据客户id删除
	 * 
	 * @param id
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int removeById(Integer id) {
		return dao.deleteById(id);
	}

	/**
	 * 修改客户
	 * 
	 * @param bill
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int modifyKehu(Kehu kehu) {
		return dao.updateById(kehu);
	}

	/**
	 * 新增客户
	 * 
	 * @param bill
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addKehu(Kehu kehu) {
		return dao.insert(kehu);
	}

}
