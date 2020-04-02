package com.accp.pojo.ljl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 项目类别表
 * @author ASUS
 *
 */
@TableName("xiangmutype")
public class LjlXiangmuLeibie {
	/**
	 * 项目类别编号/
	 */
	@TableId(value = "xid",type = IdType.AUTO)
	private int xid;
	/**
	 * 项目类别名称
	 */
	private String xname;
	/**
	 * 项目类别父级编号 0：父级项目
	 */
	private int xfid;
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
	public LjlXiangmuLeibie(int xid, String xname, int xfid) {
		super();
		this.xid = xid;
		this.xname = xname;
		this.xfid = xfid;
	}
	public LjlXiangmuLeibie() {
		super();
	}
	@Override
	public String toString() {
		return "LjlXiangmuLeibie [xid=" + xid + ", xname=" + xname + ", xfid=" + xfid + "]";
	}
}
