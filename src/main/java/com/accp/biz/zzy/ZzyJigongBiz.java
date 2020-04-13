package com.accp.biz.zzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zzy.IZzyJigongDao;
import com.accp.pojo.zzy.ZzyJigong;
import com.accp.vo.zzy.ZzyJigongVo;
import com.accp.vo.zzy.ZzyKacheVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZzyJigongBiz {
	@Autowired
	private IZzyJigongDao dao;
	
	/**
	 * 查看外勤车辆信息
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<ZzyJigongVo> queryJigong(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(dao.queryJigong());
	}
	/**
	 * 根据卡车id查看卡车信息
	 * @param kaid
	 * @return
	 */
	public ZzyJigongVo queryJigongById(int jid) {
		return dao.queryJigongById(jid);
	}
	/**
	 * 新增技工信息
	 * @param jigong
	 * @return
	 */
	public int addJigong(ZzyJigong jigong) {
		return dao.insert(jigong);
	}
}
