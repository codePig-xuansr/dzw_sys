package com.accp.pojo.zzy;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("gonghuo")
public class ZzyGonghuo {
	private int ghid;
	private	String ghname;
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
	public ZzyGonghuo(int ghid, String ghname) {
		super();
		this.ghid = ghid;
		this.ghname = ghname;
	}
	public ZzyGonghuo() {
		super();
	}
	
	
	
}
