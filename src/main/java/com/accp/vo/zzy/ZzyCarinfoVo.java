package com.accp.vo.zzy;

public class ZzyCarinfoVo {
	private String carno;
	private String carxinghao;
	private String carpp;
	private int bzid;
	private String bzname;
	private int licheng;
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public String getCarxinghao() {
		return carxinghao;
	}
	public void setCarxinghao(String carxinghao) {
		this.carxinghao = carxinghao;
	}
	public String getCarpp() {
		return carpp;
	}
	public void setCarpp(String carpp) {
		this.carpp = carpp;
	}
	public int getBid() {
		return bzid;
	}
	public void setBid(int bid) {
		this.bzid = bid;
	}
	public String getBzname() {
		return bzname;
	}
	public void setBzname(String bzname) {
		this.bzname = bzname;
	}
	public int getLicheng() {
		return licheng;
	}
	public void setLicheng(int licheng) {
		this.licheng = licheng;
	}
	public ZzyCarinfoVo(String carno, String carxinghao, String carpp, int bzid, String bzname, int licheng) {
		super();
		this.carno = carno;
		this.carxinghao = carxinghao;
		this.carpp = carpp;
		this.bzid = bzid;
		this.bzname = bzname;
		this.licheng = licheng;
	}
	public ZzyCarinfoVo() {
		super();
	}

	
}
