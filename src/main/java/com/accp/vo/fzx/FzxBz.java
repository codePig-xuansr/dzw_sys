package com.accp.vo.fzx;

public class FzxBz {
	private int bzid;
	private int sid;
	private String bzname;
	private float ticheng;
	public FzxBz(int bzid, int sid, String bzname, float ticheng) {
		super();
		this.bzid = bzid;
		this.sid = sid;
		this.bzname = bzname;
		this.ticheng = ticheng;
	}
	public FzxBz() {
		super();
	}
	public int getBzid() {
		return bzid;
	}
	public void setBzid(int bzid) {
		this.bzid = bzid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getBzname() {
		return bzname;
	}
	public void setBzname(String bzname) {
		this.bzname = bzname;
	}
	public float getTicheng() {
		return ticheng;
	}
	public void setTicheng(float ticheng) {
		this.ticheng = ticheng;
	}
	
}
