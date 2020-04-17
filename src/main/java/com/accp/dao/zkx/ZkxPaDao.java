package com.accp.dao.zkx;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.zkx.ZkxPa;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ZkxPaDao extends BaseMapper<ZkxPa>{

	public Integer addPas(@Param("plist")List<ZkxPa> plist);
	
	public Integer deleteById(@Param("rid")Integer rid);
	
	public Integer queryPa(@Param("rid")Integer rid);
}
