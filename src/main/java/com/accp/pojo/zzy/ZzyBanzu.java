package com.accp.pojo.zzy;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("banzu")
public class ZzyBanzu {
	@TableId(value = "bid", type = IdType.AUTO)
	private int bid;
	private String bzname;
	private String bztype;
	private String bzpp;
	private int bzcost;
	@Override
	public String toString() {
		return "ZzyBanzu [bid=" + bid + ", bzname=" + bzname + ", bztype=" + bztype + ", bzpp=" + bzpp + ", bzcost="
				+ bzcost + "]";
	}
	public ZzyBanzu() {
		super();
	}
	public ZzyBanzu(int bid, String bzname, String bztype, String bzpp, int bzcost) {
		super();
		this.bid = bid;
		this.bzname = bzname;
		this.bztype = bztype;
		this.bzpp = bzpp;
		this.bzcost = bzcost;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
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
	public String getBzpp() {
		return bzpp;
	}
	public void setBzpp(String bzpp) {
		this.bzpp = bzpp;
	}
	public int getBzcost() {
		return bzcost;
	}
	public void setBzcost(int bzcost) {
		this.bzcost = bzcost;
	}
}
