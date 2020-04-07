package com.accp.pojo.zzy;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("carinfo")
public class ZzyCarinfo {
	@TableId(value = "carno")
	private String carno;
	private String carxinghao;
	private String carpp;
	private int bzid;
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
	public int getbzid() {
		return bzid;
	}
	public void setbzid(int bzid) {
		this.bzid = bzid;
	}
	public int getLicheng() {
		return licheng;
	}
	public void setLicheng(int licheng) {
		this.licheng = licheng;
	}
	@Override
	public String toString() {
		return "ZzyCarinfo [carno=" + carno + ", carxinghao=" + carxinghao + ", carpp=" + carpp + ", bzid=" + bzid
				+ ", licheng=" + licheng + "]";
	}
	public ZzyCarinfo() {
		super();
	}
	public ZzyCarinfo(String carno, String carxinghao, String carpp, int bzid, int licheng) {
		super();
		this.carno = carno;
		this.carxinghao = carxinghao;
		this.carpp = carpp;
		this.bzid = bzid;
		this.licheng = licheng;
	}
}
