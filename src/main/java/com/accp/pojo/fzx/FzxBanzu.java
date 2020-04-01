package com.accp.pojo.fzx;

public class FzxBanzu {
	private int bzid;
	private String bzname;
	private String bztype;
	private String bzpp;
	private int bzcost;
	private String guzhanginfo;
	private String guzhangyuanyin;
	public FzxBanzu(int bzid, String bzname, String bztype, String bzpp, int bzcost, String guzhanginfo,
			String guzhangyuanyin) {
		super();
		this.bzid = bzid;
		this.bzname = bzname;
		this.bztype = bztype;
		this.bzpp = bzpp;
		this.bzcost = bzcost;
		this.guzhanginfo = guzhanginfo;
		this.guzhangyuanyin = guzhangyuanyin;
	}
	public FzxBanzu() {
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
	public String getGuzhanginfo() {
		return guzhanginfo;
	}
	public void setGuzhanginfo(String guzhanginfo) {
		this.guzhanginfo = guzhanginfo;
	}
	public String getGuzhangyuanyin() {
		return guzhangyuanyin;
	}
	public void setGuzhangyuanyin(String guzhangyuanyin) {
		this.guzhangyuanyin = guzhangyuanyin;
	}
	
	
}
