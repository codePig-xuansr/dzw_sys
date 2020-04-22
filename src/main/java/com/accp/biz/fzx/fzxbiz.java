package com.accp.biz.fzx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.fzx.FzxWeixiuaddDao;
import com.accp.dao.fzx.fzxdao;
import com.accp.pojo.fzx.FzxBanzu;
import com.accp.pojo.fzx.FzxCarinfo;
import com.accp.pojo.fzx.FzxJgrecord;
import com.accp.pojo.fzx.FzxKache;
import com.accp.pojo.fzx.FzxProduct;
import com.accp.pojo.fzx.FzxUser;
import com.accp.pojo.fzx.FzxWeixiuadd;
import com.accp.pojo.fzx.FzxWeixiucl;
import com.accp.pojo.fzx.FzxWeixiufuwu;
import com.accp.pojo.fzx.Fzxxiangmutype;
import com.accp.vo.fzx.FzxBz;
import com.accp.vo.fzx.FzxCtcar;
import com.accp.vo.fzx.FzxWeixiu;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class fzxbiz {
	@Autowired
	private fzxdao dao;
	@Autowired
	private FzxWeixiuaddDao weixiuadddao;
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
	public List<FzxWeixiufuwu> selectFw(int xid){
		return dao.selectFw(xid);
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
	public PageInfo<FzxBz> selectBzz(Integer num, Integer size){
		PageHelper.startPage(num,size);
		return  new PageInfo<FzxBz>(dao.selectBzz());
	}
	
	/**
	 * 查询服务类别班组
	 * @return
	 */
	public PageInfo<Fzxxiangmutype> selectFwlb(Integer num, Integer size){
		PageHelper.startPage(num,size);
		return new PageInfo<Fzxxiangmutype>(dao.selectFwlb());
	}
	
	/**
	 * 新增
	 * @return
	 */
	public int insertweixiu(FzxWeixiuadd fzxweixiuadd){
		return dao.insertweixiu(fzxweixiuadd);
	}
	
	/**
	 * 查询卡车
	 * @return
	 */
	public PageInfo<FzxKache> selectKache(Integer num, Integer size){
		PageHelper.startPage(num,size);
		return new PageInfo<FzxKache>(dao.selectKache());
	}
	
	/**
	 * 查询竣工
	 * @return
	 */
	public PageInfo<FzxWeixiuadd> selectFwAll(Integer num, Integer size,String recorddate,String status,String recordid){
		PageHelper.startPage(num, size);
		return new PageInfo<FzxWeixiuadd>(dao.selectFwAll(recorddate, status, recordid));
	}
	
	/**
	 * 修改竣工状态
	 * @param weixiurecord
	 * @return
	 */
	public int updatejg(int status,int bztime,String recordid) {
		return dao.updatejg(status,bztime, recordid);
	}
	
	/**
	 * 查询竣工记录
	 * @return
	 */
	public PageInfo<FzxJgrecord> selectJgAll(Integer n, Integer s){
		PageHelper.startPage(n, s);
		return new PageInfo<FzxJgrecord>(dao.selectJgAll());
	}
	
	/**
	 * 新增竣工记录
	 * @param fzxjgrecord
	 * @return
	 */
	public int addjg(FzxJgrecord fzxjgrecord) {
		return dao.addjg(fzxjgrecord);
	}
	
	/**
	 * 查询返工次数
	 * @param recordid
	 * @return
	 */
	public FzxJgrecord selectJgcs(String recordid){
		return dao.selectJgcs(recordid);
	}
	/**
	 * 查询服务顾问
	 * @return
	 */
	public List<FzxUser> selectgw(){
		return dao.selectgw();
	}
	
	/**
	 * 修改卡车状态1
	 * @param kano
	 * @return
	 */
	public int updatekc(String kano) {
		return dao.updatekc(kano);
	}
	
	/**
	 * 查询该车是否正在维修中
	 * @param carno
	 * @return
	 */
	public Integer selectwx(String carno){
		QueryWrapper<FzxWeixiuadd> qw=Wrappers.query();
		qw.eq("carno", carno).eq("status", 0).eq("jsstatus", 0);
		return weixiuadddao.selectCount(qw);
	}
	
	/**
	 * 查询材料
	 * @return
	 */
	public List<FzxProduct> selectcl(){
		return dao.selectcl();
	}
	
}
