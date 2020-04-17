package com.accp.dao.zxp;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ljl.LjlFadongji;
import com.accp.pojo.zxp.zxpp;
import com.accp.vo.zxp.ZxpUserVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IZxpUserDao extends BaseMapper<zxpp>{
	public int deleteuser(@Param("uid")Integer uid);
	public int updateUser(@Param("use")zxpp use);
	public zxpp find(@Param("username")String username);
	public List<ZxpUserVO> findUser(@Param("name") String name);
}
