package com.accp.vo.zkx;

public class ZkxWeek {
	
	private Float summ;
	private String ddate;
	public Float getSumm() {
		return summ;
	}
	public void setSumm(Float summ) {
		this.summ = summ;
	}
	public String getDdate() {
		return ddate;
	}
	public void setDdate(String ddate) {
		this.ddate = ddate;
	}
	public ZkxWeek(Float summ, String ddate) {
		super();
		this.summ = summ;
		this.ddate = ddate;
	}
	
	
}
