package com.accp.pojo.zxp;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("tongxunlu")
public class tongxunlu {
	
	@TableId(value = "tid",type = IdType.AUTO)
	private Integer tid;
	private Integer uid;
	private String phone;
	private String email;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public tongxunlu() {
		// TODO Auto-generated constructor stub
	}
	public tongxunlu(Integer tid, Integer uid, String phone, String email) {
		super();
		this.tid = tid;
		this.uid = uid;
		this.phone = phone;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "tongxunlu [tid=" + tid + ", uid=" + uid + ", phone=" + phone + ", email=" + email + "]";
	}
}
