package com.accp.vo.sw;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class KehuVo {
	private Integer kid;
	private String kname;
	private String kaddress;
	private String kphone;
	private Integer vip;
	@JSONField(format = "yyyy-MM-dd")
	private Date borndate;
	private Integer vipcode;
	private Date startdate;

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

	public String getKaddress() {
		return kaddress;
	}

	public void setKaddress(String kaddress) {
		this.kaddress = kaddress;
	}

	public String getKphone() {
		return kphone;
	}

	public void setKphone(String kphone) {
		this.kphone = kphone;
	}

	public Integer getVip() {
		return vip;
	}

	public void setVip(Integer vip) {
		this.vip = vip;
	}

	public Date getBorndate() {
		return borndate;
	}

	public void setBorndate(Date borndate) {
		this.borndate = borndate;
	}

	public Integer getVipcode() {
		return vipcode;
	}

	public void setVipcode(Integer vipcode) {
		this.vipcode = vipcode;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
}
