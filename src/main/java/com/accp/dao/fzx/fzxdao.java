package com.accp.dao.fzx;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.fzx.FzxBanzu;
import com.accp.pojo.fzx.FzxCarinfo;
import com.accp.pojo.fzx.FzxJgrecord;
import com.accp.pojo.fzx.FzxKache;
import com.accp.pojo.fzx.FzxWeixiuadd;
import com.accp.pojo.fzx.FzxWeixiufuwu;
import com.accp.pojo.fzx.Fzxxiangmutype;
import com.accp.vo.fzx.FzxCtcar;
import com.accp.vo.fzx.FzxWeixiu;

public interface fzxdao {
	/**
	 * 查询车牌号
	 * @return
	 */
	List<FzxCarinfo> selectBy(@Param("carno") String carno);
	/**
	 * 根据车牌号查询信息
	 * @return
	 */
	List<FzxCtcar> selectAll(@Param("carno") String carno);
	/**
	 * 按车牌号查询维修记录
	 * @return
	 */
	List<FzxWeixiu> selectWeixiuAll(@Param("carno") String carno);
	
	/**
	 * 按车牌号查询今日维修记录
	 * @return
	 */
	List<FzxWeixiu> selectWeixiuAllorder(@Param("carno") String carno);
	
	/**
	 * 查询维修服务消息
	 * @return
	 */
	List<FzxWeixiufuwu> selectFw();
	

	
	/**
	 * 查询班组
	 * @return
	 */
	List<FzxBanzu> selectBz();
	
	/**
	 * 查询班组
	 * @return
	 */
	List<FzxBanzu> selectBzz();
	
	/**
	 * 查询服务类别班组
	 * @return
	 */
	List<Fzxxiangmutype> selectFwlb();
	
	/**
	 * 主详新增
	 * @param fzxweixiuadd
	 * @return
	 */
	int insertweixiu(@Param("fzxweixiuadd") FzxWeixiuadd fzxweixiuadd);
	
	/**
	 * 查询卡车
	 * @return
	 */
	List<FzxKache> selectKache();
	
	/**
	 * 查询竣工
	 * @return
	 */
	List<FzxWeixiuadd> selectFwAll(@Param("recorddate") String recorddate,@Param("status")String status,
			@Param("recordid") String recordid);
	
	/**
	 * 修改竣工状态
	 * @param status
	 * @param recordid
	 * @return
	 */
	int updatejg(@Param("status") int status,@Param("recordid") String recordid);
	
	/**
	 * 查询竣工记录
	 * @return
	 */
	List<FzxJgrecord> selectJgAll();
	
	/**
	 * 新增竣工记录
	 * @param fzxjgrecord
	 * @return
	 */
	int addjg(@Param("fzxjgrecord") FzxJgrecord fzxjgrecord);
	
	/**
	 * 查询返工次数
	 * @param recordid
	 * @return
	 */
	FzxJgrecord selectJgcs(@Param("recordid") String recordid);
}
