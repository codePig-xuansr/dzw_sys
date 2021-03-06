package com.accp.biz.ljl;

import java.util.*;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.accp.dao.ljl.*;
import com.accp.pojo.ljl.*;
import com.accp.vo.ljl.LjlChexingVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class LjlChexingBiz {
	
	@Autowired
	private LjlChexingDanganIDao dao;

	public PageInfo<LjlPingpaiChexing> selectPingpai(Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<LjlPingpaiChexing>(dao.selectPingpai());
	}
	
	public PageInfo<LjlPingpaiChexing> selectPingpai2(Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<LjlPingpaiChexing>(dao.selectPingpai());
	}
	public LjlPingpaiChexing selectPingpaiByid(int pid){
		return dao.selectPingpaiByid(pid);
	}
	
	public PageInfo<LjlChexingVo> selectAllDang(Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<LjlChexingVo>(dao.selectAllDang());
	}
	
	public int selectDidMax() {
		return dao.selectDidMax();
	}
	
	public int selectPidMax() {
		return dao.selectPidMax();
	}
	
	public int pingpaiadd(LjlPingpaiChexing ping) {
		return dao.pingpaiadd(ping);
	}
	
	public int pingpaidel(int pid) {
		return dao.Pingpaidelete(pid);
	}
	
	public int pingpaiupdate(LjlPingpaiChexing ping) {
		return dao.Pingpaiupdate(ping);
	}
	
	public PageInfo<LjlPingpaiChexing> selectPingpaiByname(String pname, Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<LjlPingpaiChexing>(dao.selectPingpaiByname(pname));
	}
	/**
	 * 测试1
	 * @param n
	 * @param s
	 * @return
	 */
	public PageInfo<LjlFadongji> selectfadongji(Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<LjlFadongji>(dao.selectfadongji());
	}
	
	public int danganadd(@Param("d")LjlChexingDangan dang) {
		return dao.danganadd(dang);
	}
	
	public LjlChexingVo selectdanganByid(int danganid) {
		return dao.selectdanganByid(danganid);
	}
	
	public int updatechexingdangan(LjlChexingDangan dang){
		return dao.updatechexingdangan(dang);
	}
	
	public int deletechexingdangan(int danganid) {
		return dao.deletechexingdangan(danganid);
	}
	
	public PageInfo<LjlChexingVo> selectChexingByname(String carname, Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<LjlChexingVo>(dao.selectChexingByname(carname));
	}
	
	public PageInfo<LjlChexingVo> selectChexingBypid(int pid, Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<LjlChexingVo>(dao.selectChexingBypid(pid));
	}
}
