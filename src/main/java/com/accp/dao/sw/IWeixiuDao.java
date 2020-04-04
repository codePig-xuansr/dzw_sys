package com.accp.dao.sw;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.sw.Weixiurecord;
import com.accp.vo.sw.WeixiuVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IWeixiuDao extends BaseMapper<Weixiurecord> {
	/**
	 * 根据客户id或车牌查询消费记录
	 * 
	 * @param id
	 * @param carno
	 * @return
	 */
	public List<WeixiuVo> queryListById(@Param("id") Integer id, @Param("carno") String carno);

	/**
	 * 根据状态查询维修
	 * 
	 * @param status
	 * @return
	 */
	public List<WeixiuVo> queryListByJsstatus(@Param("status") Integer status,@Param("recordid") String recordid);
}
