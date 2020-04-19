package com.accp.vo.zxp;

import java.util.Date;

public class ZxpLVO {
	private Integer uid;
	private String user;
	private String pwd;
	private String username;
	private Date comedate;
	private String address;
	private String sex;
	private String rname;
	private String depname;
	private Date leavedate;
	private String content;
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
	public Date getLeavedate() {
		return leavedate;
	}
	public void setLeavedate(Date leavedate) {
		this.leavedate = leavedate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ZxpLVO() {
		// TODO Auto-generated constructor stub
	}
	public ZxpLVO(Integer uid, String user, String pwd, String username, Date comedate, String address, String sex,
			String rname, String depname, Date leavedate, String content) {
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
		this.leavedate = leavedate;
		this.content = content;
	}
	@Override
	public String toString() {
		return "ZxpLVO [uid=" + uid + ", user=" + user + ", pwd=" + pwd + ", username=" + username + ", comedate="
				+ comedate + ", address=" + address + ", sex=" + sex + ", rname=" + rname + ", depname=" + depname
				+ ", leavedate=" + leavedate + ", content=" + content + "]";
	}
	
}
