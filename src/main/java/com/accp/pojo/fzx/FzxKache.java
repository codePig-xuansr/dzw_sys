package com.accp.pojo.fzx;

public class FzxKache {
	private int kaid;
	private String kacode;
	private int kastatus;
	private int kazaizhong;
	private int kaprice;
	public FzxKache(int kaid, String kacode, int kastatus, int kazaizhong, int kaprice) {
		super();
		this.kaid = kaid;
		this.kacode = kacode;
		this.kastatus = kastatus;
		this.kazaizhong = kazaizhong;
		this.kaprice = kaprice;
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
	
}
