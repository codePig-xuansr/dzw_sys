package com.accp.pojo.zxp;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("role")
public class ZxpRole {
	@TableId(value = "rid",type = IdType.AUTO)
	private Integer rid;
	private String rcode;
	private String rname;
	private String createby;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date createdate;
	
	@Override
	public String toString() {
		return "ZxpRole [rid=" + rid + ", rcode=" + rcode + ", rname=" + rname + ", createby=" + createby + ", createdate=" + createdate + "]";
	}
	public ZxpRole() {
		// TODO Auto-generated constructor stub
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRcode() {
		return rcode;
	}
	public void setRcode(String rcode) {
		this.rcode = rcode;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public ZxpRole(Integer rid, String rcode, String rname, String createby, Date createdate) {
		super();
		this.rid = rid;
		this.rcode = rcode;
		this.rname = rname;
		this.createby = createby;
		this.createdate = createdate;
	}
	
}
