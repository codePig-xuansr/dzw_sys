package com.accp.dao.ljl;

import java.util.*;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ljl.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ILjlGonghuoDao extends BaseMapper<LjlGonghuoDanwei>{
	
	public List<LjlGonghuoDanwei> selectAll();
	
	public int insertGonghuo(@Param("g")LjlGonghuoDanwei g);
	
	public LjlGonghuoDanwei selectById(@Param("ghid")int ghid);
	
	public int updateGonghuo(@Param("g")LjlGonghuoDanwei g);
	
	public List<LjlGonghuoDanwei> selectAllByName(@Param("ghname")String name);
	
	public int deleteGonghuo(@Param("ghid")int ghid);

}
