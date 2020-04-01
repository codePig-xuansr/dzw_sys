package com.accp.vo.ljl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
/**
 * 维修项目VO
 * @author ASUS
 *
 */
public class LjlWeixiuXiangmuVo {
	/**
	 * 服务项目编码
	 */
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
	/**
	 * 项目类别名称
	 */
	private String xname;
	/**
	 * 项目类别父级编号 0：父级项目
	 */
	private int xfid;
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
	public LjlWeixiuXiangmuVo(int fwcod, String fwname, int fwprice, int xid, int vipprice, String xname, int xfid) {
		super();
		this.fwcod = fwcod;
		this.fwname = fwname;
		this.fwprice = fwprice;
		this.xid = xid;
		this.vipprice = vipprice;
		this.xname = xname;
		this.xfid = xfid;
	}
	public LjlWeixiuXiangmuVo() {
		super();
	}
	@Override
	public String toString() {
		return "LjlWeixiuXiangmuVo [fwcod=" + fwcod + ", fwname=" + fwname + ", fwprice=" + fwprice + ", xid=" + xid
				+ ", vipprice=" + vipprice + ", xname=" + xname + ", xfid=" + xfid + "]";
	}
}
