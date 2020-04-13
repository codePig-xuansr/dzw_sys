package com.accp.dao.zkx;

import java.util.List;

import com.accp.vo.zkx.ZkxWeek;

public interface ZkxMainDao {

	/**
	 * 查询今日订单数
	 * @return
	 */
	public Integer queryToDayDCount();
	
	/**
	 * 查询今日收入
	 * @return
	 */
	public Float queryToDayMoney();
	
	/**
	 * 查询今日维修车辆台次
	 * @return
	 */
	public Integer queryToDayWx();
	
	/**
	 * 查询总收入
	 * @return
	 */
	public Float querySumMoney();
	
	/**
	 * 查询过去七天每天的总收入
	 * @return
	 */
	public List<ZkxWeek> queryWeek();
}
