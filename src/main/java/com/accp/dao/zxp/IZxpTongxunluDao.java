package com.accp.dao.zxp;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ljl.LjlFadongji;
import com.accp.pojo.zxp.ZxpTongxunlu;
import com.accp.pojo.zxp.tongxunlu;
import com.accp.pojo.zxp.zxpp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IZxpTongxunluDao extends BaseMapper<tongxunlu>{
	public tongxunlu findT();
	public int updateT(@Param("txl")tongxunlu txl);
}
