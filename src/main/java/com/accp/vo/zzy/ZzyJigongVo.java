package com.accp.vo.zzy;

public class ZzyJigongVo {
	private int jid;
	private String jname;
	private int bzid;
	private int worktime;
	private String truename;
	private String jsex;
	private String jphone;
	private String jaddress;
	private String jidcard;
	private int depid;
	private int sid;
	private String bzname;
	private String sname;
	private String depname;
	
	public ZzyJigongVo(int jid, String jname, int bzid, int worktime, String truename, String jsex, String jphone,
			String jaddress, String jidcard, int depid, int sid, String bzname, String sname, String depname) {
		super();
		this.jid = jid;
		this.jname = jname;
		this.bzid = bzid;
		this.worktime = worktime;
		this.truename = truename;
		this.jsex = jsex;
		this.jphone = jphone;
		this.jaddress = jaddress;
		this.jidcard = jidcard;
		this.depid = depid;
		this.sid = sid;
		this.bzname = bzname;
		this.sname = sname;
		this.depname = depname;
	}

	public int getJid() {
		return jid;
	}

	public void setJid(int jid) {
		this.jid = jid;
	}

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public int getBzid() {
		return bzid;
	}

	public void setBzid(int bzid) {
		this.bzid = bzid;
	}

	public int getWorktime() {
		return worktime;
	}

	public void setWorktime(int worktime) {
		this.worktime = worktime;
	}

	public String getTruename() {
		return truename;
	}

	public void setTruename(String truename) {
		this.truename = truename;
	}

	public String getJsex() {
		return jsex;
	}

	public void setJsex(String jsex) {
		this.jsex = jsex;
	}

	public String getJphone() {
		return jphone;
	}

	public void setJphone(String jphone) {
		this.jphone = jphone;
	}

	public String getJaddress() {
		return jaddress;
	}

	public void setJaddress(String jaddress) {
		this.jaddress = jaddress;
	}

	public String getJidcard() {
		return jidcard;
	}

	public void setJidcard(String jidcard) {
		this.jidcard = jidcard;
	}

	public int getDepid() {
		return depid;
	}

	public void setDepid(int depid) {
		this.depid = depid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getBzname() {
		return bzname;
	}

	public void setBzname(String bzname) {
		this.bzname = bzname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDepname() {
		return depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public ZzyJigongVo() {
		super();
	}
	
}
