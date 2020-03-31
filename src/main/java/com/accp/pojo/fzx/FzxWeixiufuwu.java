package com.accp.pojo.fzx;

public class FzxWeixiufuwu {
	private int fwcod;
	private String fwname;
	private int fwprice;
	private int xid;
	private int vipprice;
	public FzxWeixiufuwu(int fwcod, String fwname, int fwprice, int xid, int vipprice) {
		super();
		this.fwcod = fwcod;
		this.fwname = fwname;
		this.fwprice = fwprice;
		this.xid = xid;
		this.vipprice = vipprice;
	}
	public FzxWeixiufuwu() {
		super();
	}
	public int getFwcod() {
		return fwcod;
	}
	public void setFwcod(int fwcod) {
		this.fwcod = fwcod;
	}
	public String getFwname() {
		return fwname;
	}
	public void setFwname(String fwname) {
		this.fwname = fwname;
	}
	public int getFwprice() {
		return fwprice;
	}
	public void setFwprice(int fwprice) {
		this.fwprice = fwprice;
	}
	public int getXid() {
		return xid;
	}
	public void setXid(int xid) {
		this.xid = xid;
	}
	public int getVipprice() {
		return vipprice;
	}
	public void setVipprice(int vipprice) {
		this.vipprice = vipprice;
	}
	
}
