package com.accp.pojo.fzx;

import com.baomidou.mybatisplus.annotation.TableName;

@TableName("weixiucl")
public class FzxWeixiucl {
	private int cid;
	private String recordid;
	private int proid;
	private int num;
	public FzxWeixiucl(int cid, String recordid, int proid, int num) {
		super();
		this.cid = cid;
		this.recordid = recordid;
		this.proid = proid;
		this.num = num;
	}
	public FzxWeixiucl() {
		super();
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getRecordid() {
		return recordid;
	}
	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}
	public int getProid() {
		return proid;
	}
	public void setProid(int proid) {
		this.proid = proid;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}
