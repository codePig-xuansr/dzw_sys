package com.accp.pojo.sw;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Carpingpai {
	@TableId(value = "pid", type = IdType.AUTO)
	private Integer pid;
	private String pname;
	private String pzimu;
	private Date pdate;

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
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

	public Date getPdate() {
		return pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

}
