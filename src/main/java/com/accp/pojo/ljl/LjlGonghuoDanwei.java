package com.accp.pojo.ljl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 供货单位
 * @author ASUS
 *
 */
@TableName("gonghuo")
public class LjlGonghuoDanwei {
	/**
	 * 供货单位编号
	 */
	@TableId(value = "ghid",type = IdType.AUTO)
	private int ghid;
	/**
	 * 单位名称
	 */
	private String ghname;
	/**
	 * 单位地址
	 */
	private String ghaddress;
	/**
	 * 联系电话
	 */
	private String ghphone;
	/**
	 * 邮箱
	 */
	private String ghemail;
	public int getGhid() {
		return ghid;
	}
	public void setGhid(int ghid) {
		this.ghid = ghid;
	}
	public String getGhname() {
		return ghname;
	}
	public void setGhname(String ghname) {
		this.ghname = ghname;
	}
	public String getGhaddress() {
		return ghaddress;
	}
	public void setGhaddress(String ghaddress) {
		this.ghaddress = ghaddress;
	}
	public String getGhphone() {
		return ghphone;
	}
	public void setGhphone(String ghphone) {
		this.ghphone = ghphone;
	}
	public String getGhemail() {
		return ghemail;
	}
	public void setGhemail(String ghemail) {
		this.ghemail = ghemail;
	}
	public LjlGonghuoDanwei(int ghid, String ghname, String ghaddress, String ghphone, String ghemail) {
		super();
		this.ghid = ghid;
		this.ghname = ghname;
		this.ghaddress = ghaddress;
		this.ghphone = ghphone;
		this.ghemail = ghemail;
	}
	public LjlGonghuoDanwei() {
		super();
	}
	@Override
	public String toString() {
		return "LjlGonghuoDanwei [ghid=" + ghid + ", ghname=" + ghname + ", ghaddress=" + ghaddress + ", ghphone="
				+ ghphone + ", ghemail=" + ghemail + "]";
	}
}
