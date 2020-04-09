package com.accp.biz.zzy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zzy.IZzyKacheDao;
import com.accp.pojo.zzy.ZzyKache;
import com.accp.vo.zzy.ZzyKacheVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZzyKacheBiz {
	@Autowired
	private IZzyKacheDao dao;
	
	/**
	 * 查看外勤车辆信息
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<ZzyKacheVo> queryKache(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(dao.queryKache());
	}
	/**
	 * 根据卡车id查看卡车信息
	 * @param kaid
	 * @return
	 */
	public ZzyKacheVo queryKacheById(int kaid) {
		return dao.queryKacheById(kaid);
	}
	/**
	 * 根据id修改卡车信息
	 * @param kache
	 * @return
	 */
	public int modifyKache(ZzyKache kache) {
		return dao.updateById(kache);
	}
	/**
	 * 新增外勤车辆
	 * @param carinfo
	 * @return
	 */
	public int addKache(ZzyKache kache) {
		return dao.insert(kache);
	}
	/**
	 * 根据车牌号新增车辆
	 * @param kano车牌号
	 * @return
	 */
	public int deleteKache(int kaid) {
		return dao.deleteById(kaid);
	}
}