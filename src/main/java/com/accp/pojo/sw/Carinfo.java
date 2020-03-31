package com.accp.pojo.sw;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableId;

public class Carinfo {
	private String carpp;
	private String carxinghao;
	@TableId(value = "carno")
	private String carno;
	private String driver;
	private String driverphone;
	private String carguishu;
	private Integer fadongjiid;
	@JSONField(format = "yyyy-MM-dd")
	private Date jszlostdate;
	private String ranyoutype;
	private Integer kid;

	public Carinfo() {
		// TODO Auto-generated constructor stub
	}

	public Carinfo(String carpp, String carxinghao, String carno, String driver, String driverphone, String carguishu,
			Integer fadongjiid, Date jszlostdate, String ranyoutype, Integer kid) {
		super();
		this.carpp = carpp;
		this.carxinghao = carxinghao;
		this.carno = carno;
		this.driver = driver;
		this.driverphone = driverphone;
		this.carguishu = carguishu;
		this.fadongjiid = fadongjiid;
		this.jszlostdate = jszlostdate;
		this.ranyoutype = ranyoutype;
		this.kid = kid;
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

	public Integer getFadongjiid() {
		return fadongjiid;
	}

	public void setFadongjiid(Integer fadongjiid) {
		this.fadongjiid = fadongjiid;
	}

	public Date getJszlostdate() {
		return jszlostdate;
	}

	public void setJszlostdate(Date jszlostdate) {
		this.jszlostdate = jszlostdate;
	}

	public String getRanyoutype() {
		return ranyoutype;
	}

	public void setRanyoutype(String ranyoutype) {
		this.ranyoutype = ranyoutype;
	}

	public Integer getKid() {
		return kid;
	}

	public void setKid(Integer kid) {
		this.kid = kid;
	}
}
