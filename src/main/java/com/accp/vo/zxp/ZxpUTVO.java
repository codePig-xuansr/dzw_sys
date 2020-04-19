package com.accp.vo.zxp;

import java.util.Date;

public class ZxpUTVO {
	private Integer uid;
	private String user;
	private String pwd;
	private String username;
	private Date comedate;
	private String address;
	private String sex;
	private String rname;
	private String depname;
	private String phone;
	private String email;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ZxpUTVO() {
		// TODO Auto-generated constructor stub
	}
	public ZxpUTVO(Integer uid, String user, String pwd, String username, Date comedate, String address, String sex,
			String rname, String depname, String phone, String email) {
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
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return "ZxpUTVO [uid=" + uid + ", user=" + user + ", pwd=" + pwd + ", username=" + username + ", comedate="
				+ comedate + ", address=" + address + ", sex=" + sex + ", rname=" + rname + ", depname=" + depname
				+ ", phone=" + phone + ", email=" + email + "]";
	}
	
}
