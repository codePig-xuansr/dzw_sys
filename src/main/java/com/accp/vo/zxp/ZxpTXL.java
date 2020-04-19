package com.accp.vo.zxp;

import java.util.List;

import com.accp.pojo.zxp.tongxunlu;

public class ZxpTXL {
	private List<tongxunlu> txl;
	private ZxpUTVO stvo;
	public List<tongxunlu> getTxl() {
		return txl;
	}
	public void setTxl(List<tongxunlu> txl) {
		this.txl = txl;
	}
	public ZxpUTVO getStvo() {
		return stvo;
	}
	public void setStvo(ZxpUTVO stvo) {
		this.stvo = stvo;
	}
	public ZxpTXL() {
		// TODO Auto-generated constructor stub
	}
	public ZxpTXL(List<tongxunlu> txl, ZxpUTVO stvo) {
		super();
		this.txl = txl;
		this.stvo = stvo;
	}
	@Override
	public String toString() {
		return "ZxpTXL [txl=" + txl + ", stvo=" + stvo + "]";
	}
	
}
