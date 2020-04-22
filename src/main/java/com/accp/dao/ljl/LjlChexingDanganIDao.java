package com.accp.dao.ljl;

import java.util.*;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.accp.pojo.ljl.*;
import com.accp.vo.ljl.LjlChexingVo;
import com.github.pagehelper.PageInfo;

public interface LjlChexingDanganIDao {
	/**
	 * 查询所有品牌
	 * @return
	 */
	public List<LjlPingpaiChexing> selectPingpai();
	
	public LjlPingpaiChexing selectPingpaiByid(@Param("pid")int pid);
	/**
	 * 查询所有型号车辆
	 */
	public List<LjlChexingVo> selectAllDang();
	
	public int selectDidMax();
	
	public int selectPidMax();
	
	public int pingpaiadd(@Param("p")LjlPingpaiChexing ping);

	public int danganadd(@Param("d")LjlChexingDangan dang);
	
	public int Pingpaiadd();
	
	public int Pingpaiupdate(@Param("p")LjlPingpaiChexing ping);
	
	public int Pingpaidelete(@Param("pid")int pid);
	
	public List<LjlPingpaiChexing> selectPingpaiByname(@Param("pname")String pname);
	
	public List<LjlFadongji> selectfadongji();
	
	public LjlChexingVo selectdanganByid(@Param("danganid")int danganid);
	
	public int updatechexingdangan(@Param("d")LjlChexingDangan dang);
	
	public int deletechexingdangan(int danganid);
	
	public List<LjlChexingVo> selectChexingByname(@Param("carname")String carname);

	public List<LjlChexingVo> selectChexingBypid(@Param("pid")int pid);
	
}
