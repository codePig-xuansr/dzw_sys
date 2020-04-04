package com.accp.pojo.sw;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableId;

public class Weixiurecord {
	@TableId(value = "recordid")
	private String recordid;
	private String carno;
	private String yewutype;
	private String danjutype;
	private Date recorddate;
	private Integer bzid;
	private Date yujidate;
	private Integer status;
	private Integer jsstatus;
	private String beizhu;
	private Integer licheng;
	private String guzhanginfo;
	private String guzhangyuanyin;
	private String fuwugw;
	private String shigongbc;
	private Integer bztime;

	public Weixiurecord() {
		// TODO Auto-generated constructor stub
	}

	public Weixiurecord(String recordid, String carno, String yewutype, String danjutype, Date recorddate, Integer bzid,
			Date yujidate, Integer status, Integer jsstatus, String beizhu, Integer licheng, String guzhanginfo,
			String guzhangyuanyin, String fuwugw, String shigongbc, Integer bztime) {
		super();
		this.recordid = recordid;
		this.carno = carno;
		this.yewutype = yewutype;
		this.danjutype = danjutype;
		this.recorddate = recorddate;
		this.bzid = bzid;
		this.yujidate = yujidate;
		this.status = status;
		this.jsstatus = jsstatus;
		this.beizhu = beizhu;
		this.licheng = licheng;
		this.guzhanginfo = guzhanginfo;
		this.guzhangyuanyin = guzhangyuanyin;
		this.fuwugw = fuwugw;
		this.shigongbc = shigongbc;
		this.bztime = bztime;
	}

	public String getRecordid() {
		return recordid;
	}

	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}

	public String getCarno() {
		return carno;
	}

	public void setCarno(String carno) {
		this.carno = carno;
	}

	public String getYewutype() {
		return yewutype;
	}

	public void setYewutype(String yewutype) {
		this.yewutype = yewutype;
	}

	public String getDanjutype() {
		return danjutype;
	}

	public void setDanjutype(String danjutype) {
		this.danjutype = danjutype;
	}

	public Date getRecorddate() {
		return recorddate;
	}

	public void setRecorddate(Date recorddate) {
		this.recorddate = recorddate;
	}

	public Integer getBzid() {
		return bzid;
	}

	public void setBzid(Integer bzid) {
		this.bzid = bzid;
	}

	public Date getYujidate() {
		return yujidate;
	}

	public void setYujidate(Date yujidate) {
		this.yujidate = yujidate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getJsstatus() {
		return jsstatus;
	}

	public void setJsstatus(Integer jsstatus) {
		this.jsstatus = jsstatus;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public Integer getLicheng() {
		return licheng;
	}

	public void setLicheng(Integer licheng) {
		this.licheng = licheng;
	}

	public String getGuzhanginfo() {
		return guzhanginfo;
	}

	public void setGuzhanginfo(String guzhanginfo) {
		this.guzhanginfo = guzhanginfo;
	}

	public String getGuzhangyuanyin() {
		return guzhangyuanyin;
	}

	public void setGuzhangyuanyin(String guzhangyuanyin) {
		this.guzhangyuanyin = guzhangyuanyin;
	}

	public String getFuwugw() {
		return fuwugw;
	}

	public void setFuwugw(String fuwugw) {
		this.fuwugw = fuwugw;
	}

	public String getShigongbc() {
		return shigongbc;
	}

	public void setShigongbc(String shigongbc) {
		this.shigongbc = shigongbc;
	}

	public Integer getBztime() {
		return bztime;
	}

	public void setBztime(Integer bztime) {
		this.bztime = bztime;
	}

}
