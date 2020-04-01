package com.accp.pojo.fzx;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FzxWeixiuadd {
	private String recordid;//维修单号 格式20200325001
	private String carno;//车牌号
	private String yewutype;//业务类型
	private String danjutype;//单据类型 分为金融单据、商业单据
	private Date recorddate;//开单时间
	private int bzid;//维修班组编号
	private Date yujidate;//预计完工时间
	private int status;//竣工状态 0：未竣工 1：已竣工
	private int jsstatus;//结算状态 0：未结算 1：已结算
	private String beizhu;//备注说明
	private int licheng;//接车里程数
	private String guzhanginfo;//故障描述
	private String guzhangyuanyin;//故障原因
	private String fuwugw;//服务顾问
	private String shigongbc;//施工班次
	private List<FzxWeixiufuwu> fzxweixiufuwu=new ArrayList<FzxWeixiufuwu>(0);
	public FzxWeixiuadd(String recordid, String carno, String yewutype, String danjutype, Date recorddate, int bzid,
			Date yujidate, int status, int jsstatus, String beizhu, int licheng, String guzhanginfo,
			String guzhangyuanyin, String fuwugw, String shigongbc, List<FzxWeixiufuwu> fzxweixiufuwu) {
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
		this.fzxweixiufuwu = fzxweixiufuwu;
	}
	public FzxWeixiuadd() {
		super();
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
	public int getBzid() {
		return bzid;
	}
	public void setBzid(int bzid) {
		this.bzid = bzid;
	}
	public Date getYujidate() {
		return yujidate;
	}
	public void setYujidate(Date yujidate) {
		this.yujidate = yujidate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getJsstatus() {
		return jsstatus;
	}
	public void setJsstatus(int jsstatus) {
		this.jsstatus = jsstatus;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	public int getLicheng() {
		return licheng;
	}
	public void setLicheng(int licheng) {
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
	public List<FzxWeixiufuwu> getFzxweixiufuwu() {
		return fzxweixiufuwu;
	}
	public void setFzxweixiufuwu(List<FzxWeixiufuwu> fzxweixiufuwu) {
		this.fzxweixiufuwu = fzxweixiufuwu;
	}
	
	
}