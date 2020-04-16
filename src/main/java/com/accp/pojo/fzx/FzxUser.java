package com.accp.pojo.fzx;

import java.util.Date;

public class FzxUser {
	private int uid;
	private String user;//员工账号 用于登录
	private String pwd;//密码
	private String username;//真实姓名
	private Date comedate;//入职日期
	private String address;//员工地址
	private String sex;//性别
	private int depid;//所属部门编号
	private int rid;//职位(角色)编号
	private int tid;//所关联的通讯录编号
	private int ustatus;//用户离职状态 0：在职 1：离职
	public FzxUser(int uid, String user, String pwd, String username, Date comedate, String address, String sex,
			int depid, int rid, int tid, int ustatus) {
		super();
		this.uid = uid;
		this.user = user;
		this.pwd = pwd;
		this.username = username;
		this.comedate = comedate;
		this.address = address;
		this.sex = sex;
		this.depid = depid;
		this.rid = rid;
		this.tid = tid;
		this.ustatus = ustatus;
	}
	public FzxUser() {
		super();
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
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
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getUstatus() {
		return ustatus;
	}
	public void setUstatus(int ustatus) {
		this.ustatus = ustatus;
	}
	
}
