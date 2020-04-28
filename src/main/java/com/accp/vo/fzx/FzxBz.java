package com.accp.vo.fzx;

public class FzxBz {
	private int bzid;
	private int sid;
	private String bzname;
	private float ticheng;
	private int bzstatus;
	private String recordid;
	private int jiuyuanfy;
	private String sname;
	private String truename;
	public FzxBz(int bzid, int sid, String bzname, float ticheng, int bzstatus, String recordid, int jiuyuanfy,
			String sname, String truename) {
		super();
		this.bzid = bzid;
		this.sid = sid;
		this.bzname = bzname;
		this.ticheng = ticheng;
		this.bzstatus = bzstatus;
		this.recordid = recordid;
		this.jiuyuanfy = jiuyuanfy;
		this.sname = sname;
		this.truename = truename;
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
	public int getBzstatus() {
		return bzstatus;
	}
	public void setBzstatus(int bzstatus) {
		this.bzstatus = bzstatus;
	}
	public String getRecordid() {
		return recordid;
	}
	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}
	public int getJiuyuanfy() {
		return jiuyuanfy;
	}
	public void setJiuyuanfy(int jiuyuanfy) {
		this.jiuyuanfy = jiuyuanfy;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
	
	
	
}
