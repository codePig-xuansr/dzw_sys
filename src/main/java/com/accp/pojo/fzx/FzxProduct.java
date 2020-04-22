package com.accp.pojo.fzx;

import java.util.Date;

public class FzxProduct {
	private int proid;//商品编号
	private String proname;//商品名称
	private int pronum;//商品库存
	private int proprice;//商品单价
	private Date prodate;//商品入库日期
	private int ghid;//供货单位编号
	private int prostar;//商品状态
	private String prodw;//商品单位
	private String propp;//商品品牌
	public FzxProduct(int proid, String proname, int pronum, int proprice, Date prodate, int ghid, int prostar,
			String prodw, String propp) {
		super();
		this.proid = proid;
		this.proname = proname;
		this.pronum = pronum;
		this.proprice = proprice;
		this.prodate = prodate;
		this.ghid = ghid;
		this.prostar = prostar;
		this.prodw = prodw;
		this.propp = propp;
	}
	public FzxProduct() {
		super();
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
	public Date getProdate() {
		return prodate;
	}
	public void setProdate(Date prodate) {
		this.prodate = prodate;
	}
	public int getGhid() {
		return ghid;
	}
	public void setGhid(int ghid) {
		this.ghid = ghid;
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
	public String getPropp() {
		return propp;
	}
	public void setPropp(String propp) {
		this.propp = propp;
	}
	
}
