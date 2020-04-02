package com.accp.pojo.sw;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

public class Vipcard {
	private Integer vipid;
	@TableId(value = "vipcode")
	private Integer vipcode;
	private String vippwd;
	private Float vipdiscount;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date startdate;
	private Integer jifen;

	public Vipcard() {
		// TODO Auto-generated constructor stub
	}

	public Vipcard(Integer vipid, Integer vipcode, String vippwd, Float vipdiscount, Date startdate, Integer jifen) {
		super();
		this.vipid = vipid;
		this.vipcode = vipcode;
		this.vippwd = vippwd;
		this.vipdiscount = vipdiscount;
		this.startdate = startdate;
		this.jifen = jifen;
	}

	public Integer getVipid() {
		return vipid;
	}

	public void setVipid(Integer vipid) {
		this.vipid = vipid;
	}

	public Integer getVipcode() {
		return vipcode;
	}

	public void setVipcode(Integer vipcode) {
		this.vipcode = vipcode;
	}

	public String getVippwd() {
		return vippwd;
	}

	public void setVippwd(String vippwd) {
		this.vippwd = vippwd;
	}

	public Float getVipdiscount() {
		return vipdiscount;
	}

	public void setVipdiscount(Float vipdiscount) {
		this.vipdiscount = vipdiscount;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Integer getJifen() {
		return jifen;
	}

	public void setJifen(Integer jifen) {
		this.jifen = jifen;
	}
	
}
