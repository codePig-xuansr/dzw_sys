package com.accp.dao.zkx;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.zkx.ZkxFunction;
import com.accp.vo.zkx.ZkxURoleVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ZkxFunDao extends BaseMapper<ZkxFunction>{

	public List<ZkxFunction> showFunByUser(@Param("user")String user,@Param("pwd")String pwd);
	
	public List<ZkxFunction> queryUFuns(@Param("rid")Integer rid);
}
