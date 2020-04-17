package com.accp.vo.zxp;

import com.accp.pojo.zxp.ZxpDepartment;
import com.accp.pojo.zxp.ZxpRole;
import com.accp.pojo.zxp.zxpp;

public class ZxpUVO {
	private zxpp user;
	private ZxpRole role;
	private ZxpDepartment department;
	public zxpp getUser() {
		return user;
	}
	public void setUser(zxpp user) {
		this.user = user;
	}
	public ZxpRole getRole() {
		return role;
	}
	public void setRole(ZxpRole role) {
		this.role = role;
	}
	public ZxpDepartment getDepartment() {
		return department;
	}
	public void setDepartment(ZxpDepartment department) {
		this.department = department;
	}
	public ZxpUVO() {
		// TODO Auto-generated constructor stub
	}
	public ZxpUVO(zxpp user, ZxpRole role, ZxpDepartment department) {
		super();
		this.user = user;
		this.role = role;
		this.department = department;
	}
	@Override
	public String toString() {
		return "ZxpUVO [user=" + user + ", role=" + role + ", department=" + department + "]";
	}
	
}
