package com.accp.pojo.fzx;

public class Fzxxiangmutype {
	private int xid;
	private String xname;
	private int xfid;
	public Fzxxiangmutype(int xid, String xname, int xfid) {
		super();
		this.xid = xid;
		this.xname = xname;
		this.xfid = xfid;
	}
	public Fzxxiangmutype() {
		super();
	}
	public int getXid() {
		return xid;
	}
	public void setXid(int xid) {
		this.xid = xid;
	}
	public String getXname() {
		return xname;
	}
	public void setXname(String xname) {
		this.xname = xname;
	}
	public int getXfid() {
		return xfid;
	}
	public void setXfid(int xfid) {
		this.xfid = xfid;
	}
	
	
}
