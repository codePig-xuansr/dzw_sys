package com.accp.vo.zxp;

import java.util.Date;

public class ZxpUV {
	private Integer uid;
	private String user;
	private String pwd;
	private String username;
	private Date comedate;
	private String address;
	private String sex;
	private String rname;
	private String depname;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getComedate() {
		return comedate;
	}
	public void setComedate(Date comedate) {
		this.comedate = comedate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public ZxpUV() {
		// TODO Auto-generated constructor stub
	}
	public ZxpUV(Integer uid, String user, String pwd, String username, Date comedate, String address, String sex,
			String rname, String depname) {
		super();
		this.uid = uid;
		this.user = user;
		this.pwd = pwd;
		this.username = username;
		this.comedate = comedate;
		this.address = address;
		this.sex = sex;
		this.rname = rname;
		this.depname = depname;
	}
	@Override
	public String toString() {
		return "ZxpUV [uid=" + uid + ", user=" + user + ", pwd=" + pwd + ", username=" + username + ", comedate="
				+ comedate + ", address=" + address + ", sex=" + sex + ", rname=" + rname + ", depname=" + depname
				+ "]";
	}
	
}
