package com.accp.dao.zkx;

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
}
