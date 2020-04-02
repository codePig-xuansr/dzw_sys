package com.accp.pojo.fzx;

public class Fzxxiangmutype {
	private int xxid;
	private int xid;
	private String fwname;
	private int fwcod;
	public Fzxxiangmutype(int xxid, int xid, String fwname, int fwcod) {
		super();
		this.xxid = xxid;
		this.xid = xid;
		this.fwname = fwname;
		this.fwcod = fwcod;
	}
	public Fzxxiangmutype() {
		super();
	}
	public int getXxid() {
		return xxid;
	}
	public void setXxid(int xxid) {
		this.xxid = xxid;
	}
	public int getXid() {
		return xid;
	}
	public void setXid(int xid) {
		this.xid = xid;
	}
	public String getFwname() {
		return fwname;
	}
	public void setFwname(String fwname) {
		this.fwname = fwname;
	}
	public int getFwcod() {
		return fwcod;
	}
	public void setFwcod(int fwcod) {
		this.fwcod = fwcod;
	}
	
	
}
