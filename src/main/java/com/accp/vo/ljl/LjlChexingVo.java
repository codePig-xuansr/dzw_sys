package com.accp.vo.ljl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
/**
 * 車型檔案VO
 * @author ASUS
 *
 */
public class LjlChexingVo {
	/**
	 * 车型档案编号 自增
	 */
	private int danganid;
	/**
	 * 车型ID
	 */
	private String carid;
	/**
	 * 车型名称
	 */
	private String carname;
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
	/**
	 * 发动机编号
	 */
	private int fadongjiid;
	/**
	 * 发动机型号名称
	 */
	private String fadongjiname;
	/**
	 * 发动机品牌
	 */
	private String fadongjipp;
	/**
	 * 生产日期
	 */
	private String scdate;
	/**
	 * 品牌编号
	 */
	private int pid;
	/**
	 * 品牌名称
	 */
	private String pname;
	/**
	 * 开头字母
	 */
	private String pzimu;
	/**
	 * 创建时间
	 */
	private String pdate;
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
	public int getFadongjiid() {
		return fadongjiid;
	}
	public void setFadongjiid(int fadongjiid) {
		this.fadongjiid = fadongjiid;
	}
	public String getFadongjiname() {
		return fadongjiname;
	}
	public void setFadongjiname(String fadongjiname) {
		this.fadongjiname = fadongjiname;
	}
	public String getFadongjipp() {
		return fadongjipp;
	}
	public void setFadongjipp(String fadongjipp) {
		this.fadongjipp = fadongjipp;
	}
	public String getScdate() {
		return scdate;
	}
	public void setScdate(String scdate) {
		this.scdate = scdate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPzimu() {
		return pzimu;
	}
	public void setPzimu(String pzimu) {
		this.pzimu = pzimu;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	public LjlChexingVo(int danganid, String carid, String carname, int cankaoprice, String carniankuan, float gonglv,
			String jinkouguochan, int fadongjiid, String fadongjiname, String fadongjipp, String scdate, int pid,
			String pname, String pzimu, String pdate) {
		super();
		this.danganid = danganid;
		this.carid = carid;
		this.carname = carname;
		this.cankaoprice = cankaoprice;
		this.carniankuan = carniankuan;
		this.gonglv = gonglv;
		this.jinkouguochan = jinkouguochan;
		this.fadongjiid = fadongjiid;
		this.fadongjiname = fadongjiname;
		this.fadongjipp = fadongjipp;
		this.scdate = scdate;
		this.pid = pid;
		this.pname = pname;
		this.pzimu = pzimu;
		this.pdate = pdate;
	}
	public LjlChexingVo() {
		super();
	}
	@Override
	public String toString() {
		return "LjlChexingVo [danganid=" + danganid + ", carid=" + carid + ", carname=" + carname + ", cankaoprice="
				+ cankaoprice + ", carniankuan=" + carniankuan + ", gonglv=" + gonglv + ", jinkouguochan="
				+ jinkouguochan + ", fadongjiid=" + fadongjiid + ", fadongjiname=" + fadongjiname + ", fadongjipp="
				+ fadongjipp + ", scdate=" + scdate + ", pid=" + pid + ", pname=" + pname + ", pzimu=" + pzimu
				+ ", pdate=" + pdate + "]";
	}
}
