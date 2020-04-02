package com.accp.biz.fzx;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.fzx.fzxdao;
import com.accp.pojo.fzx.FzxBanzu;
import com.accp.pojo.fzx.FzxCarinfo;
import com.accp.pojo.fzx.FzxWeixiuadd;
import com.accp.pojo.fzx.FzxWeixiufuwu;
import com.accp.pojo.fzx.Fzxxiangmutype;
import com.accp.vo.fzx.FzxCtcar;
import com.accp.vo.fzx.FzxWeixiu;

@Service
public class fzxbiz {
	@Autowired
	private fzxdao dao;
	
	/**
	 * 查询车牌号
	 * @return
	 */
	public List<FzxCarinfo> selectBy(String carno) {
		return dao.selectBy(carno);
		
	}
	
	/**
	 * 根据车牌号查询信息
	 * @return
	 */
	public List<FzxCtcar> selectAll(String carno) {
		return dao.selectAll(carno);
		
	}
	/**
	 * 按车牌号查询维修记录
	 * @return
	 */
	public List<FzxWeixiu> selectWeixiuAll(String carno){
		return dao.selectWeixiuAll(carno);
	}
	
	/**
	 * 按车牌号查询今日维修记录
	 * @return
	 */
	public List<FzxWeixiu> selectWeixiuAllorder(String carno){
		return dao.selectWeixiuAllorder(carno);
	}
	
	/**
	 * 查询维修服务消息
	 * @return
	 */
	public List<FzxWeixiufuwu> selectFw(){
		return dao.selectFw();
	}
	

	
	
	/**
	 * 查询班组
	 * @return
	 */
	public List<FzxBanzu> selectBz(){
		return dao.selectBz();
	}
	/**
	 * 查询班组
	 * @return
	 */
	public List<FzxBanzu> selectBzz(){
		return dao.selectBzz();
	}
	
	/**
	 * 查询班组
	 * @return
	 */
	public int insertweixiu(FzxWeixiuadd fzxweixiuadd){
		return dao.insertweixiu(fzxweixiuadd);
	}
}
