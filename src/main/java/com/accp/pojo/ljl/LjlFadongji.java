package com.accp.pojo.ljl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 发动机品牌表
 * @author ASUS
 *
 */
@TableName("fadongji")
public class LjlFadongji {
	/**
	 * 发动机编号
	 */
	@TableId(value = "fadongjiid",type = IdType.AUTO)
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
	public LjlFadongji(int fadongjiid, String fadongjiname, String fadongjipp, String scdate) {
		super();
		this.fadongjiid = fadongjiid;
		this.fadongjiname = fadongjiname;
		this.fadongjipp = fadongjipp;
		this.scdate = scdate;
	}
	public LjlFadongji() {
		super();
	}
	@Override
	public String toString() {
		return "LjlFadongji [fadongjiid=" + fadongjiid + ", fadongjiname=" + fadongjiname + ", fadongjipp=" + fadongjipp
				+ ", scdate=" + scdate + "]";
	}
	
}
