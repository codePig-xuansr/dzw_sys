package com.accp.vo.zkx;

public class ZkxMain {
	private Integer ddCount;//今日订单数
	
	private Float todayMoney;//今日收入
	
	private Integer todayWx;//今日维修台次
	
	private Float sumMoney;//总收入

	public Integer getDdCount() {
		return ddCount;
	}

	public void setDdCount(Integer ddCount) {
		this.ddCount = ddCount;
	}

	public Float getTodayMoney() {
		return todayMoney;
	}

	public void setTodayMoney(Float todayMoney) {
		this.todayMoney = todayMoney;
	}

	public Integer getTodayWx() {
		return todayWx;
	}

	public void setTodayWx(Integer todayWx) {
		this.todayWx = todayWx;
	}

	public Float getSumMoney() {
		return sumMoney;
	}

	public void setSumMoney(Float sumMoney) {
		this.sumMoney = sumMoney;
	}

	public ZkxMain(Integer ddCount, Float todayMoney, Integer todayWx, Float sumMoney) {
		super();
		this.ddCount = ddCount;
		this.todayMoney = todayMoney;
		this.todayWx = todayWx;
		this.sumMoney = sumMoney;
	}

	@Override
	public String toString() {
		return "ZkxMain [ddCount=" + ddCount + ", todayMoney=" + todayMoney + ", todayWx=" + todayWx + ", sumMoney="
				+ sumMoney + "]";
	}
	
	

}
