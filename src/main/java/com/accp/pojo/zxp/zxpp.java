package com.accp.pojo.zxp;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user")
public class zxpp {
	@TableId(value = "uid")
	private Integer uid;
	private String user;
	private String pwd;
	private String username;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date comedate;
	private String address;
	private String sex;
	private Integer depid;
	private Integer rid;
	private Integer tid;
	@TableField(exist=false)
	private String email;
	@TableField(exist=false)
	private String phone;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "zxpp [uid=" + uid + ", user=" + user + ", pwd=" + pwd + ", username=" + username + ", comedate=" + comedate + ", address=" + address + ", sex=" + sex + ", depid=" + depid + ", rid=" + rid + ", tid=" + tid + ", phone=" + phone + ", email=" + email + "]";
	}
	public zxpp() {
		// TODO Auto-generated constructor stub
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getComedate() {
		return comedate;
	}
	public void setComedate(Date comedate) {
		this.comedate = comedate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getDepid() {
		return depid;
	}
	public void setDepid(Integer depid) {
		this.depid = depid;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public zxpp(Integer uid, String user, String pwd, String username, Date comedate, String address, String sex,
			Integer depid, Integer rid, Integer tid) {
		super();
		this.uid = uid;
		this.user = user;
		this.pwd = pwd;
		this.username = username;
		this.comedate = comedate;
		this.address = address;
		this.sex = sex;
		this.depid = depid;
		this.rid = rid;
		this.tid = tid;
	}
	
	
}
