package com.accp.pojo.zzy;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("product")
public class ZzyProduct {
	@TableId(value = "proid")
	private int proid;
	private String proname;
	private int pronum;
	private int proprice;
	private int ghid;
	private String propp;
	private int prostar;
	private String prodw;
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
	public ZzyProduct(int proid, String proname, int pronum, int proprice, int ghid, String propp, int prostar,
			String prodw) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.pronum = pronum;
		this.proprice = proprice;
		this.ghid = ghid;
		this.propp = propp;
		this.prostar = prostar;
		this.prodw = prodw;
	}
	public ZzyProduct() {
		super();
	}
	@Override
	public String toString() {
		return "ZzyProduct [proid=" + proid + ", proname=" + proname + ", pronum=" + pronum + ", proprice=" + proprice
				+ ", ghid=" + ghid + ", propp=" + propp + ", prostar=" + prostar + ", prodw=" + prodw + "]";
	}
	
}
