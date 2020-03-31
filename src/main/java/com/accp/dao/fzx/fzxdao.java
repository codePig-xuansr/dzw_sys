package com.accp.dao.fzx;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.fzx.FzxCarinfo;
import com.accp.vo.fzx.FzxCtcar;
import com.accp.vo.fzx.FzxWeixiu;

public interface fzxdao {
	/**
	 * 查询车牌号
	 * @return
	 */
	List<FzxCarinfo> selectBy(@Param("carno") String carno);
	/**
	 * 根据车牌号查询信息
	 * @return
	 */
	List<FzxCtcar> selectAll(@Param("carno") String carno);
	/**
	 * 按车牌号查询维修记录
	 * @return
	 */
	List<FzxWeixiu> selectWeixiuAll(@Param("carno") String carno);
}
