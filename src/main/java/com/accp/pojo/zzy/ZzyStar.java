package com.accp.pojo.zzy;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("star")
public class ZzyStar {
	@TableId(value = "sid",type = IdType.AUTO)
	private int sid;
	private String sname;
	private Float ticheng;
	//private int worktime;
	@Override
	public String toString() {
		return "ZzyStar [sid=" + sid + ", sname=" + sname + ", ticheng=" + ticheng + "]";
	}
	public ZzyStar() {
		super();
	}
	public ZzyStar(int sid, String sname, Float ticheng) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.ticheng = ticheng;
		//this.worktime = worktime;
	}
	
	
	public ZzyStar(String sname, Float ticheng) {
		super();
		this.sname = sname;
		this.ticheng = ticheng;
		//this.worktime = worktime;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Float getTicheng() {
		return ticheng;
	}
	public void setTicheng(Float ticheng) {
		this.ticheng = ticheng;
	}
//	public int getWorktime() {
//		return worktime;
//	}
//	public void setWorktime(int worktime) {
//		this.worktime = worktime;
//	}
}
