package com.accp.dao.sw;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.sw.WeixiuVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IWeixiuDao {
	public List<WeixiuVo> queryListById(@Param("id") Integer id);
}
