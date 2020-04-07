package com.accp.dao.zzy;

import java.util.List;

import com.accp.vo.zzy.ZzyCarinfoVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IZzyCarinfoDao extends BaseMapper<ZzyCarinfoVo>{
	/**
	 * 查看外勤车辆信息
	 * @return
	 */
	public List<ZzyCarinfoVo> queryCarinfo();

}
