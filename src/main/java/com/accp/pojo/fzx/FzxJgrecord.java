package com.accp.pojo.fzx;

import java.util.Date;


public class FzxJgrecord {
	private int jgid;
	private String recordid;
	private Date shijidate;
	private int jgstatus;
	private String yuanyin;
	private int chufa;
	private String checkperson;
	private String fuzeperson;
	private int zicount;//返工次数
	
	public int getZicount() {
		return zicount;
	}
	public void setZicount(int zicount) {
		this.zicount = zicount;
	}
	public FzxJgrecord(int jgid, String recordid, Date shijidate, int jgstatus, String yuanyin, int chufa,
			String checkperson, String fuzeperson) {
		super();
		this.jgid = jgid;
		this.recordid = recordid;
		this.shijidate = shijidate;
		this.jgstatus = jgstatus;
		this.yuanyin = yuanyin;
		this.chufa = chufa;
		this.checkperson = checkperson;
		this.fuzeperson = fuzeperson;
	}
	public FzxJgrecord() {
		super();
	}
	public int getJgid() {
		return jgid;
	}
	public void setJgid(int jgid) {
		this.jgid = jgid;
	}
	public String getRecordid() {
		return recordid;
	}
	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}
	public Date getShijidate() {
		return shijidate;
	}
	public void setShijidate(Date shijidate) {
		this.shijidate = shijidate;
	}
	public int getJgstatus() {
		return jgstatus;
	}
	public void setJgstatus(int jgstatus) {
		this.jgstatus = jgstatus;
	}
	public String getYuanyin() {
		return yuanyin;
	}
	public void setYuanyin(String yuanyin) {
		this.yuanyin = yuanyin;
	}
	public int getChufa() {
		return chufa;
	}
	public void setChufa(int chufa) {
		this.chufa = chufa;
	}
	public String getCheckperson() {
		return checkperson;
	}
	public void setCheckperson(String checkperson) {
		this.checkperson = checkperson;
	}
	public String getFuzeperson() {
		return fuzeperson;
	}
	public void setFuzeperson(String fuzeperson) {
		this.fuzeperson = fuzeperson;
	}
	
}
