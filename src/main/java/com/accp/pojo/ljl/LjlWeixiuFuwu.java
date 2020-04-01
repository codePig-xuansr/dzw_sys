package com.accp.pojo.ljl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 维修服务表
 * @author ASUS
 *
 */
@TableName("weixiufuwu")
public class LjlWeixiuFuwu {
	/**
	 * 服务项目编码
	 */
	@TableId(value = "fwcod",type = IdType.AUTO)
	private int fwcod;
	/**
	 * 项目名称
	 */
	private String fwname;
	/**
	 * 售价
	 */
	private int fwprice;
	/**
	 * 项目类别编号
	 */
	private int xid;
	/**
	 * 会员价
	 */
	private int vipprice;
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
	public LjlWeixiuFuwu(int fwcod, String fwname, int fwprice, int xid, int vipprice) {
		super();
		this.fwcod = fwcod;
		this.fwname = fwname;
		this.fwprice = fwprice;
		this.xid = xid;
		this.vipprice = vipprice;
	}
	public LjlWeixiuFuwu() {
		super();
	}
	@Override
	public String toString() {
		return "LjlWeixiuFuwu [fwcod=" + fwcod + ", fwname=" + fwname + ", fwprice=" + fwprice + ", xid=" + xid
				+ ", vipprice=" + vipprice + "]";
	}
}
