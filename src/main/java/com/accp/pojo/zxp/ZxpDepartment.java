package com.accp.pojo.zxp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("department")
public class ZxpDepartment {
	@TableId(value = "depid",type = IdType.AUTO)
	private Integer depid;
	private String depname;
	public Integer getDepid() {
		return depid;
	}
	public void setDepid(Integer depid) {
		this.depid = depid;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public ZxpDepartment(Integer depid, String depname) {
		super();
		this.depid = depid;
		this.depname = depname;
	}
	public ZxpDepartment() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ZxpDepartment [depid=" + depid + ", depname=" + depname + "]";
	}
	
}
