package com.accp.dao.sw;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.sw.FuwuVo;

public interface IFuwuDao {
	/**
	 * 根据单号查询维修项目
	 * 
	 * @param recordid
	 * @return
	 */
	public List<FuwuVo> queryList(@Param("recordid") String recordid);
}
