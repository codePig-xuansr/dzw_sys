package com.accp.vo.fzx;

public class FzxCtcar {
	private String carno;//车牌号
	private int kid;//客户id
	private String driver;//驾驶员
	private String kname;//客户
	private String kaddress;//地址
	private String kphone;//电话
	private String carpp;//品牌
	private String carxinghao;//车型
	private int fadongjiid;//发动机号
	private String fadongjipp;//发动机品牌
	public FzxCtcar(String carno, int kid, String driver, String kname, String kaddress, String kphone, String carpp,
			String carxinghao, int fadongjiid, String fadongjipp) {
		super();
		this.carno = carno;
		this.kid = kid;
		this.driver = driver;
		this.kname = kname;
		this.kaddress = kaddress;
		this.kphone = kphone;
		this.carpp = carpp;
		this.carxinghao = carxinghao;
		this.fadongjiid = fadongjiid;
		this.fadongjipp = fadongjipp;
	}
	public FzxCtcar() {
		super();
	}
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
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
	public String getCarpp() {
		return carpp;
	}
	public void setCarpp(String carpp) {
		this.carpp = carpp;
	}
	public String getCarxinghao() {
		return carxinghao;
	}
	public void setCarxinghao(String carxinghao) {
		this.carxinghao = carxinghao;
	}
	public int getFadongjiid() {
		return fadongjiid;
	}
	public void setFadongjiid(int fadongjiid) {
		this.fadongjiid = fadongjiid;
	}
	public String getFadongjipp() {
		return fadongjipp;
	}
	public void setFadongjipp(String fadongjipp) {
		this.fadongjipp = fadongjipp;
	}
	
}
