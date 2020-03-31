package com.accp.biz.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.sw.ICarinfoDao;
import com.accp.pojo.sw.Carinfo;
import com.accp.vo.sw.CarVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class CarinfoBiz {
	@Autowired
	private ICarinfoDao dao;

	/**
	 * 根据客户id查询客户拥有的车辆并分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param id
	 * @return
	 */
	public PageInfo<CarVo> findPage(Integer pageNum, Integer pageSize, Integer id) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(dao.queryListById(id));
	}

	/**
	 * 新增车辆资料
	 * 
	 * @param bill
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addCar(Carinfo car) {
		return dao.insert(car);
	}
}
