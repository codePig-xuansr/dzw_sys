package com.accp.dao.zxp;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ljl.LjlFadongji;
import com.accp.pojo.zxp.zxpp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IZxpUserDao extends BaseMapper<zxpp>{
	public int deleteuser(@Param("uid")Integer uid);
	public int updateUser(@Param("use")zxpp use);
}
