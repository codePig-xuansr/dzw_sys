package com.accp.pojo.sw;

import java.util.Date;

public class Jsrecord {
	private Integer jsid;
	private String recordid;
	private Integer jstype;
	private Date jsdate;
	private Float jsmoney;

	public Jsrecord() {
		// TODO Auto-generated constructor stub
	}

	public Jsrecord(Integer jsid, String recordid, Integer jstype, Date jsdate, Float jsmoney) {
		super();
		this.jsid = jsid;
		this.recordid = recordid;
		this.jstype = jstype;
		this.jsdate = jsdate;
		this.jsmoney = jsmoney;
	}

	public Integer getJsid() {
		return jsid;
	}

	public void setJsid(Integer jsid) {
		this.jsid = jsid;
	}

	public String getRecordid() {
		return recordid;
	}

	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}

	public Integer getJstype() {
		return jstype;
	}

	public void setJstype(Integer jstype) {
		this.jstype = jstype;
	}

	public Date getJsdate() {
		return jsdate;
	}

	public void setJsdate(Date jsdate) {
		this.jsdate = jsdate;
	}

	public Float getJsmoney() {
		return jsmoney;
	}

	public void setJsmoney(Float jsmoney) {
		this.jsmoney = jsmoney;
	}

}
