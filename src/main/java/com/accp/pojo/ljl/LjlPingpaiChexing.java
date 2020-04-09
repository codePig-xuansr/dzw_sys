package com.accp.pojo.ljl;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 
 * @author ASUS
 *
 */
@TableName("carpingpai")
public class LjlPingpaiChexing {
	/**
	 * 品牌编号
	 */
	@TableId(value = "pid",type = IdType.AUTO)
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
	public LjlPingpaiChexing(int pid, String pname, String pzimu, String pdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pzimu = pzimu;
		this.pdate = pdate;
	}
	public LjlPingpaiChexing() {
		super();
	}
	@Override
	public String toString() {
		return "LjlPingpaiChexing [pid=" + pid + ", pname=" + pname + ", pzimu=" + pzimu + ", pdate=" + pdate + "]";
	}
}
