package com.accp.vo.sw;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class VipVo {
	private Integer kid;
	private String kname;
	private Integer vipid;
	private Integer vipcode;
	private String vippwd;
	private Float vipdiscount;
	@JSONField(format = "yyyy-MM-dd HH:mm:ss")
	private Date startdate;
	private Integer jifen;

	public Integer getKid() {
		return kid;
	}

	public void setKid(Integer kid) {
		this.kid = kid;
	}

	public String getKname() {
		return kname;
	}

	public void setKname(String kname) {
		this.kname = kname;
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
