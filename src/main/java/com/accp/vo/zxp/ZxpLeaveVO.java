package com.accp.vo.zxp;

import com.accp.pojo.zxp.ZxpLeave;
import com.accp.pojo.zxp.zxpp;

public class ZxpLeaveVO {
	private zxpp user;
	private ZxpLeave leave;
	public zxpp getUser() {
		return user;
	}
	public void setUser(zxpp user) {
		this.user = user;
	}
	public ZxpLeave getLeave() {
		return leave;
	}
	public void setLeave(ZxpLeave leave) {
		this.leave = leave;
	}
	public ZxpLeaveVO() {
		// TODO Auto-generated constructor stub
	}
	public ZxpLeaveVO(zxpp user, ZxpLeave leave) {
		super();
		this.user = user;
		this.leave = leave;
	}
	@Override
	public String toString() {
		return "ZxpLeaveVO [user=" + user + ", leave=" + leave + "]";
	}
	
}
