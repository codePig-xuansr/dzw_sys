package com.accp.pojo.fzx;

public class FzxWeixiuxm {
	private int wid;
	private String recordid;
	private int fwcod;
	public FzxWeixiuxm(int wid, String recordid, int fwcod) {
		super();
		this.wid = wid;
		this.recordid = recordid;
		this.fwcod = fwcod;
	}
	public FzxWeixiuxm() {
		super();
	}
	public int getWid() {
		return wid;
	}
	public void setWid(int wid) {
		this.wid = wid;
	}
	public String getRecordid() {
		return recordid;
	}
	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}
	public int getFwcod() {
		return fwcod;
	}
	public void setFwcod(int fwcod) {
		this.fwcod = fwcod;
	}
	
}
