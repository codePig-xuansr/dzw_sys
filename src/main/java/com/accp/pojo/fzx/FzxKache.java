package com.accp.pojo.fzx;

public class FzxKache {
	private int kaid;
	private String kacode;
	private int kastatus;
	private int kazaizhong;
	private int kaprice;
	private String kano;
	private String kapp;
	private int kalc;
	private int bzid;
	public FzxKache(int kaid, String kacode, int kastatus, int kazaizhong, int kaprice, String kano, String kapp,
			int kalc, int bzid) {
		super();
		this.kaid = kaid;
		this.kacode = kacode;
		this.kastatus = kastatus;
		this.kazaizhong = kazaizhong;
		this.kaprice = kaprice;
		this.kano = kano;
		this.kapp = kapp;
		this.kalc = kalc;
		this.bzid = bzid;
	}
	public FzxKache() {
		super();
	}
	public int getKaid() {
		return kaid;
	}
	public void setKaid(int kaid) {
		this.kaid = kaid;
	}
	public String getKacode() {
		return kacode;
	}
	public void setKacode(String kacode) {
		this.kacode = kacode;
	}
	public int getKastatus() {
		return kastatus;
	}
	public void setKastatus(int kastatus) {
		this.kastatus = kastatus;
	}
	public int getKazaizhong() {
		return kazaizhong;
	}
	public void setKazaizhong(int kazaizhong) {
		this.kazaizhong = kazaizhong;
	}
	public int getKaprice() {
		return kaprice;
	}
	public void setKaprice(int kaprice) {
		this.kaprice = kaprice;
	}
	public String getKano() {
		return kano;
	}
	public void setKano(String kano) {
		this.kano = kano;
	}
	public String getKapp() {
		return kapp;
	}
	public void setKapp(String kapp) {
		this.kapp = kapp;
	}
	public int getKalc() {
		return kalc;
	}
	public void setKalc(int kalc) {
		this.kalc = kalc;
	}
	public int getBzid() {
		return bzid;
	}
	public void setBzid(int bzid) {
		this.bzid = bzid;
	}
	
	
}
