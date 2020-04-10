package com.accp.vo.zzy;

public class ZzyProductVo {
	private int proid;
	private String proname;
	private int pronum;
	private int proprice;
	private int ghid;
	private String propp;
	private int prostar;
	private String prodw;
	private String ghaddress;
	private String ghname;
	public ZzyProductVo() {
		super();
	}
	
	@Override
	public String toString() {
		return "ZzyProductVo [proid=" + proid + ", proname=" + proname + ", pronum=" + pronum + ", proprice=" + proprice
				+ ", ghid=" + ghid + ", propp=" + propp + ", prostar=" + prostar + ", prodw=" + prodw + ", ghaddress="
				+ ghaddress + ", ghname=" + ghname + "]";
	}

	public ZzyProductVo(int proid, String proname, int pronum, int proprice, int ghid, String propp, int prostar,
			String prodw, String ghaddress, String ghname) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.pronum = pronum;
		this.proprice = proprice;
		this.ghid = ghid;
		this.propp = propp;
		this.prostar = prostar;
		this.prodw = prodw;
		this.ghaddress = ghaddress;
		this.ghname = ghname;
	}
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getPronum() {
		return pronum;
	}
	public void setPronum(int pronum) {
		this.pronum = pronum;
	}
	public int getProprice() {
		return proprice;
	}
	public void setProprice(int proprice) {
		this.proprice = proprice;
	}
	public int getGhid() {
		return ghid;
	}
	public void setGhid(int ghid) {
		this.ghid = ghid;
	}
	public String getPropp() {
		return propp;
	}
	public void setPropp(String propp) {
		this.propp = propp;
	}
	public int getProstar() {
		return prostar;
	}
	public void setProstar(int prostar) {
		this.prostar = prostar;
	}
	public String getProdw() {
		return prodw;
	}
	public void setProdw(String prodw) {
		this.prodw = prodw;
	}
	public String getGhaddress() {
		return ghaddress;
	}
	public void setGhaddress(String ghaddress) {
		this.ghaddress = ghaddress;
	}
	public String getGhname() {
		return ghname;
	}
	public void setGhname(String ghname) {
		this.ghname = ghname;
	}
}
