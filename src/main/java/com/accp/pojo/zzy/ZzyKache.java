package com.accp.pojo.zzy;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("kache")
public class ZzyKache {
	@TableId(value = "kaid")
	private int kaid;
	private String kano;
	private String katype;
	private String kapp;
	private int bzid;
	private int kalc;
	public int getKaid() {
		return kaid;
	}
	public void setKaid(int kaid) {
		this.kaid = kaid;
	}
	public String getKano() {
		return kano;
	}
	public void setKano(String kano) {
		this.kano = kano;
	}
	public String getKatype() {
		return katype;
	}
	public void setKatype(String katype) {
		this.katype = katype;
	}
	public String getKapp() {
		return kapp;
	}
	public void setKapp(String kapp) {
		this.kapp = kapp;
	}
	public int getBzid() {
		return bzid;
	}
	public void setBzid(int bzid) {
		this.bzid = bzid;
	}
	public int getKalc() {
		return kalc;
	}
	public void setKalc(int kalc) {
		this.kalc = kalc;
	}
	public ZzyKache(int kaid, String kano, String katype, String kapp, int bzid, int kalc) {
		super();
		this.kaid = kaid;
		this.kano = kano;
		this.katype = katype;
		this.kapp = kapp;
		this.bzid = bzid;
		this.kalc = kalc;
	}
	public ZzyKache() {
		super();
	}

	
}
