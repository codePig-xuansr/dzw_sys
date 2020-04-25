package com.accp.pojo.zzy;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("banzu")
public class ZzyBanzu {
	@TableId(value = "bzid", type = IdType.AUTO)
	private int bzid;
	private String bzname;
	private String bztype;
	private int bzcost;
	private int bzstatus;
	
	public ZzyBanzu(int bzid, String bzname, String bztype, int bzcost, int bzstatus) {
		super();
		this.bzid = bzid;
		this.bzname = bzname;
		this.bztype = bztype;
		this.bzcost = bzcost;
		this.bzstatus = bzstatus;
	}
	public int getBzstatus() {
		return bzstatus;
	}
	public void setBzstatus(int bzstatus) {
		this.bzstatus = bzstatus;
	}
	public ZzyBanzu(int bzid, String bzname, String bztype, int bzcost) {
		super();
		this.bzid = bzid;
		this.bzname = bzname;
		this.bztype = bztype;
		this.bzcost = bzcost;
	}
	public ZzyBanzu() {
		super();
	}
	public int getBzid() {
		return bzid;
	}
	public void setBzid(int bzid) {
		this.bzid = bzid;
	}
	public String getBzname() {
		return bzname;
	}
	public void setBzname(String bzname) {
		this.bzname = bzname;
	}
	public String getBztype() {
		return bztype;
	}
	public void setBztype(String bztype) {
		this.bztype = bztype;
	}
	public int getBzcost() {
		return bzcost;
	}
	public void setBzcost(int bzcost) {
		this.bzcost = bzcost;
	}
	@Override
	public String toString() {
		return "ZzyBanzu [bzid=" + bzid + ", bzname=" + bzname + ", bztype=" + bztype + ", bzcost=" + bzcost + "]";
	}
	
	
}
