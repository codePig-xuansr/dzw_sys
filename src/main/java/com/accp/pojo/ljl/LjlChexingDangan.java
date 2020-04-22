package com.accp.pojo.ljl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * 车型档案表
 * @author ASUS
 *
 */
@TableName("cardangan")
public class LjlChexingDangan {
	/**
	 * 车型档案编号 自增
	 */
	@TableId(value = "danganid",type = IdType.AUTO)
	private int danganid;
	/**
	 * 车型ID
	 */
	private String carid;
	/**
	 * 品牌編號
	 */
	private int pid;
	/**
	 * 车型名称
	 */
	private String carname;
	/**
	 * 关联的发动机编号
	 */
	private int fadongjiid;
	/**
	 * 参考价格
	 */
	private int cankaoprice;
	/**
	 * 车辆年款
	 */
	private String carniankuan;
	/**
	 * 功率
	 */
	private float gonglv;
	/**
	 * 进口国产
	 */
	private String jinkouguochan;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getDanganid() {
		return danganid;
	}
	public void setDanganid(int danganid) {
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
	public int getFadongjiid() {
		return fadongjiid;
	}
	public void setFadongjiid(int fadongjiid) {
		this.fadongjiid = fadongjiid;
	}
	public int getCankaoprice() {
		return cankaoprice;
	}
	public void setCankaoprice(int cankaoprice) {
		this.cankaoprice = cankaoprice;
	}
	public String getCarniankuan() {
		return carniankuan;
	}
	public void setCarniankuan(String carniankuan) {
		this.carniankuan = carniankuan;
	}
	public float getGonglv() {
		return gonglv;
	}
	public void setGonglv(float gonglv) {
		this.gonglv = gonglv;
	}
	public String getJinkouguochan() {
		return jinkouguochan;
	}
	public void setJinkouguochan(String jinkouguochan) {
		this.jinkouguochan = jinkouguochan;
	}
	public LjlChexingDangan(int danganid, String carid, int pid, String carname, int fadongjiid, int cankaoprice,
			String carniankuan, float gonglv, String jinkouguochan) {
		super();
		this.danganid = danganid;
		this.carid = carid;
		this.pid = pid;
		this.carname = carname;
		this.fadongjiid = fadongjiid;
		this.cankaoprice = cankaoprice;
		this.carniankuan = carniankuan;
		this.gonglv = gonglv;
		this.jinkouguochan = jinkouguochan;
	}
	public LjlChexingDangan() {
		super();
	}
	@Override
	public String toString() {
		return "LjlChexingDangan [danganid=" + danganid + ", carid=" + carid + ", pid=" + pid + ", carname=" + carname
				+ ", fadongjiid=" + fadongjiid + ", cankaoprice=" + cankaoprice + ", carniankuan=" + carniankuan
				+ ", gonglv=" + gonglv + ", jinkouguochan=" + jinkouguochan + "]";
	}
}
