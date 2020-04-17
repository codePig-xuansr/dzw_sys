package com.accp.vo.zxp;

import java.util.List;

import com.accp.pojo.zxp.tongxunlu;
import com.accp.pojo.zxp.zxpp;

public class ZxpUserVO {
	private List<tongxunlu> txl;
	private zxpp user;
	public List<tongxunlu> getTxl() {
		return txl;
	}
	public void setTxl(List<tongxunlu> txl) {
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
	public ZxpUserVO(List<tongxunlu> txl, zxpp user) {
		super();
		this.txl = txl;
		this.user = user;
	}
	@Override
	public String toString() {
		return "ZxpUserVO [txl=" + txl + ", user=" + user + "]";
	}
	
	
}
