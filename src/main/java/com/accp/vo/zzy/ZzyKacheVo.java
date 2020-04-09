package com.accp.vo.zzy;

public class ZzyKacheVo {
	private int kaid;
	private String kano;
	private String katype;
	private String kapp;
	private int bzid;
	private String bzname;
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
	public ZzyKacheVo(int kaid,String kano, String katype, String kapp, int bzid, String bzname, int kalc) {
		super();
		this.kaid=kaid;
		this.kano = kano;
		this.katype = katype;
		this.kapp = kapp;
		this.bzid = bzid;
		this.bzname = bzname;
		this.kalc = kalc;
	}
	public ZzyKacheVo() {
		super();
	}
	@Override
	public String toString() {
		return "ZzyKacheVo [kaid=" + kaid + ", kano=" + kano + ", katype=" + katype + ", kapp=" + kapp + ", bzid="
				+ bzid + ", bzname=" + bzname + ", kalc=" + kalc + "]";
	}
	
}
