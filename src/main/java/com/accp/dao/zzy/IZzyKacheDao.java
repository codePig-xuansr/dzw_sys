package com.accp.dao.zzy;

import java.util.List;

import com.accp.pojo.zzy.ZzyKache;
import com.accp.vo.zzy.ZzyKacheVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IZzyKacheDao extends BaseMapper<ZzyKache>{
	/**
	 * 查看外勤车辆信息
	 * @return
	 */
	public List<ZzyKacheVo> queryKache();
	
	/**
	 * 根据卡车id查看卡车信息
	 * @param kaid
	 * @return
	 */
	public ZzyKacheVo queryKacheById(int kaid);
	
}