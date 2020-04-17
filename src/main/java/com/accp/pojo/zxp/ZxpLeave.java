package com.accp.pojo.zxp;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
@TableName("lz")
public class ZxpLeave {
	@TableId(value = "lid",type = IdType.AUTO)
	private Integer lid;
	private Integer uid;
	@JSONField(format = "yyyy-MM-dd")
	private Date leavedate;
	private String content;
	@TableField(exist=false)
	private String username;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getLid() {
		return lid;
	}
	public void setLid(Integer lid) {
		this.lid = lid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Date getLeavedate() {
		return leavedate;
	}
	public void setLeavedate(Date leavedate) {
		this.leavedate = leavedate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ZxpLeave() {
		// TODO Auto-generated constructor stub
	}
	public ZxpLeave(Integer lid, Integer uid, Date leavedate, String content) {
		super();
		this.lid = lid;
		this.uid = uid;
		this.leavedate = leavedate;
		this.content = content;
	}
	@Override
	public String toString() {
		return "Zxpleave [lid=" + lid + ", uid=" + uid + ", leavedate=" + leavedate + ", content=" + content + "]";
	}
}
