package com.accp.dao.sw;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.sw.Kehu;
import com.accp.vo.sw.KehuVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IKehuDao extends BaseMapper<Kehu> {
	/**
	 * 查询最新的客户id
	 * 
	 * @return
	 */
	public Kehu queryMaxId();

	public KehuVo queryById(@Param("id") Integer id);
}
