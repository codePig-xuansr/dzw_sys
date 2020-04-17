package com.accp.vo.zzy;

public class ZzyKacheVo {
	private int kaid;
	private String kano;
	private String katype;
	private String kapp;
	private int bzid;
	private int kastatus;
	private String bzname;
	private int kalc;
	private int status;
	
	
	public ZzyKacheVo(int kaid, int kastatus) {
		super();
		this.kaid = kaid;
		this.kastatus = kastatus;
	}


	public ZzyKacheVo(int kaid, String kano, String katype, String kapp, int bzid, int kastatus, String bzname,
			int kalc, int status) {
		super();
		this.kaid = kaid;
		this.kano = kano;
		this.katype = katype;
		this.kapp = kapp;
		this.bzid = bzid;
		this.kastatus = kastatus;
		this.bzname = bzname;
		this.kalc = kalc;
		this.status = status;
	}


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


	public int getKastatus() {
		return kastatus;
	}


	public void setKastatus(int kastatus) {
		this.kastatus = kastatus;
	}


	public String getBzname() {
		return bzname;
	}


	public void setBzname(String bzname) {
		this.bzname = bzname;
	}


	public int getKalc() {
		return kalc;
	}


	public void setKalc(int kalc) {
		this.kalc = kalc;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public ZzyKacheVo() {
		super();
	}


	@Override
	public String toString() {
		return "ZzyKacheVo [kaid=" + kaid + ", kano=" + kano + ", katype=" + katype + ", kapp=" + kapp + ", bzid="
				+ bzid + ", kastatus=" + kastatus + ", bzname=" + bzname + ", kalc=" + kalc + ", status=" + status
				+ "]";
	}
	
}
