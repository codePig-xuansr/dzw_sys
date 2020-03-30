package com.accp.vo.fzx;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class FzxWeixiu {
	private String carno;//车牌号
	private String recordid;//维修单号
	private int jsstatus;//结算状态
	private String yewutype;//业务类型
	private String danjutype;//单据类型
	@JSONField(format = "yyyy-MM-dd")
	private Date recorddate;//开单时间
	@JSONField(format = "yyyy-MM-dd")
	private Date yujidate;//预计完工
	@JSONField(format = "yyyy-MM-dd")
	private Date shijidate;//完工时间
	@JSONField(format = "yyyy-MM-dd")
	private Date jsdate;//结算时间
	private int kid;//客户id
	private String kname;//客户
	private String kphone;//电话
	public FzxWeixiu(String carno, String recordid, int jsstatus, String yewutype, String danjutype, Date recorddate,
			Date yujidate, Date shijidate, Date jsdate, int kid, String kname, String kphone) {
		super();
		this.carno = carno;
		this.recordid = recordid;
		this.jsstatus = jsstatus;
		this.yewutype = yewutype;
		this.danjutype = danjutype;
		this.recorddate = recorddate;
		this.yujidate = yujidate;
		this.shijidate = shijidate;
		this.jsdate = jsdate;
		this.kid = kid;
		this.kname = kname;
		this.kphone = kphone;
	}
	public FzxWeixiu() {
		super();
	}
	public String getCarno() {
		return carno;
	}
	public void setCarno(String carno) {
		this.carno = carno;
	}
	public String getRecordid() {
		return recordid;
	}
	public void setRecordid(String recordid) {
		this.recordid = recordid;
	}
	public int getJsstatus() {
		return jsstatus;
	}
	public void setJsstatus(int jsstatus) {
		this.jsstatus = jsstatus;
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
	public Date getYujidate() {
		return yujidate;
	}
	public void setYujidate(Date yujidate) {
		this.yujidate = yujidate;
	}
	public Date getShijidate() {
		return shijidate;
	}
	public void setShijidate(Date shijidate) {
		this.shijidate = shijidate;
	}
	public Date getJsdate() {
		return jsdate;
	}
	public void setJsdate(Date jsdate) {
		this.jsdate = jsdate;
	}
	public int getKid() {
		return kid;
	}
	public void setKid(int kid) {
		this.kid = kid;
	}
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getKphone() {
		return kphone;
	}
	public void setKphone(String kphone) {
		this.kphone = kphone;
	}
	
	
}
