package com.accp.pojo.fzx;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FzxCarinfo {
	private String carpp;
	private String carxinghao;
	private String carno;
	private String driver;
	private String driverphone;
	private String carguishu;
	private int fadongjiid;
	@JSONField(format = "yyyy-MM-dd")
	private Date jszlostdate;
	private String ranyouttype;
	private int kid;
	public FzxCarinfo(String carpp, String carxinghao, String carno, String driver, String driverphone,
			String carguishu, int fadongjiid, Date jszlostdate, String ranyouttype, int kid) {
		super();
		this.carpp = carpp;
		this.carxinghao = carxinghao;
		this.carno = carno;
		this.driver = driver;
		this.driverphone = driverphone;
		this.carguishu = carguishu;
		this.fadongjiid = fadongjiid;
		this.jszlostdate = jszlostdate;
		this.ranyouttype = ranyouttype;
		this.kid = kid;
	}
	public FzxCarinfo() {
		super();
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
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public String getDriverphone() {
		return driverphone;
	}
	public void setDriverphone(String driverphone) {
		this.driverphone = driverphone;
	}
	public String getCarguishu() {
		return carguishu;
	}
	public void setCarguishu(String carguishu) {
		this.carguishu = carguishu;
	}
	public int getFadongjiid() {
		return fadongjiid;
	}
	public void setFadongjiid(int fadongjiid) {
		this.fadongjiid = fadongjiid;
	}
	public Date getJszlostdate() {
		return jszlostdate;
	}
	public void setJszlostdate(Date jszlostdate) {
		this.jszlostdate = jszlostdate;
	}
	public String getRanyouttype() {
		return ranyouttype;
	}
	public void setRanyouttype(String ranyouttype) {
		this.ranyouttype = ranyouttype;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	
}
