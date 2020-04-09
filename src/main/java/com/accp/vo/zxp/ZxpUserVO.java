package com.accp.vo.zxp;

import com.accp.pojo.zxp.tongxunlu;
import com.accp.pojo.zxp.zxpp;

public class ZxpUserVO {
	private tongxunlu txl;
	private zxpp user;
	public tongxunlu getTxl() {
		return txl;
	}
	public void setTxl(tongxunlu txl) {
		this.txl = txl;
	}
	public zxpp getUser() {
		return user;
	}
	public void setUser(zxpp user) {
		this.user = user;
	}
	public ZxpUserVO() {
		// TODO Auto-generated constructor stub
	}
	public ZxpUserVO(tongxunlu txl, zxpp user) {
		super();
		this.txl = txl;
		this.user = user;
	}
	@Override
	public String toString() {
		return "ZxpUserVO [txl=" + txl + ", user=" + user + "]";
	}
	
	
}
