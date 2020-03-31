package com.accp.pojo.zkx;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("function")
public class ZkxFunction {
	@TableId(type = IdType.AUTO,value = "fid")
    private Integer fid;

    private String fcode;

    private String fname;

    private Integer fpid;

    public Integer getFid() {
        return fid;
    }

    @Override
	public String toString() {
		return "ZkxFunction [fid=" + fid + ", fcode=" + fcode + ", fname=" + fname + ", fpid=" + fpid + "]";
	}

	public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getFcode() {
        return fcode;
    }

    public void setFcode(String fcode) {
        this.fcode = fcode == null ? null : fcode.trim();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname == null ? null : fname.trim();
    }

    public Integer getFpid() {
        return fpid;
    }

    public void setFpid(Integer fpid) {
        this.fpid = fpid;
    }
}