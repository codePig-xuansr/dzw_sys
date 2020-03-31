package com.accp.pojo.sw;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class Fadongji {
	@TableId(value = "fadongjiid", type = IdType.AUTO)
	private Integer fadongjiid;
	private String fadongjiname;
	private String fadongjipp;
	@JSONField(format = "yyyy-MM-dd")
	private Date scdate;

	public Integer getFadongjiid() {
		return fadongjiid;
	}

	public void setFadongjiid(Integer fadongjiid) {
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

	public Date getScdate() {
		return scdate;
	}

	public void setScdate(Date scdate) {
		this.scdate = scdate;
	}

}
