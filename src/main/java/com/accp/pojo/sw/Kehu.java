package com.accp.pojo.sw;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Kehu {
	@TableId(value = "kid", type = IdType.AUTO)
	private Integer kid;
	private String kname;
	private String kaddress;
	private String kphone;
	private Integer vipcode;
	@JSONField(format = "yyyy-MM-dd")
	private Date borndate;

	public Kehu() {
		// TODO Auto-generated constructor stub
	}

	public Kehu(Integer kid, String kname, String kaddress, String kphone, Integer vipcode, Date borndate) {
		super();
		this.kid = kid;
		this.kname = kname;
		this.kaddress = kaddress;
		this.kphone = kphone;
		this.vipcode = vipcode;
		this.borndate = borndate;
	}

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

	public Integer getVipcode() {
		return vipcode;
	}

	public void setVipcode(Integer vipcode) {
		this.vipcode = vipcode;
	}

	public Date getBorndate() {
		return borndate;
	}

	public void setBorndate(Date borndate) {
		this.borndate = borndate;
	}

}
