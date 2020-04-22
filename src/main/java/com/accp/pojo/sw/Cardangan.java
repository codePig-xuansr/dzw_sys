package com.accp.pojo.sw;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Cardangan {
	@TableId(value = "danganid", type = IdType.AUTO)
	private Integer danganid;
	private String carid;
	private String carname;
	private Integer fadongjiid;
	private Integer cankaoprice;
	private String carniankuan;
	private Integer gonglv;
	private String jinkouguochan;

	public Integer getDanganid() {
		return danganid;
	}

	public void setDanganid(Integer danganid) {
		this.danganid = danganid;
	}

	public String getCarid() {
		return carid;
	}

	public void setCarid(String carid) {
		this.carid = carid;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public Integer getFadongjiid() {
		return fadongjiid;
	}

	public void setFadongjiid(Integer fadongjiid) {
		this.fadongjiid = fadongjiid;
	}

	public Integer getCankaoprice() {
		return cankaoprice;
	}

	public void setCankaoprice(Integer cankaoprice) {
		this.cankaoprice = cankaoprice;
	}

	public String getCarniankuan() {
		return carniankuan;
	}

	public void setCarniankuan(String carniankuan) {
		this.carniankuan = carniankuan;
	}

	public Integer getGonglv() {
		return gonglv;
	}

	public void setGonglv(Integer gonglv) {
		this.gonglv = gonglv;
	}

	public String getJinkouguochan() {
		return jinkouguochan;
	}

	public void setJinkouguochan(String jinkouguochan) {
		this.jinkouguochan = jinkouguochan;
	}

}
