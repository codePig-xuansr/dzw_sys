package com.accp.dao.ljl;

import java.util.*;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ljl.*;
import com.accp.vo.ljl.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IWeixiuxiangmuDao extends BaseMapper<LjlWeixiuXiangmuVo>{
	/**
	 * 查询所有类别
	 * @return
	 */
	public List<LjlXiangmuLeibie> selectLeibie();
	/**
	 * 测试
	 * @return
	 */
	public List<LjlXiangmuLeibie> selectLeibie2();
	/**
	 * 按类别查询所有相关维修项目
	 * @param xid
	 * @return
	 */
	public List<LjlWeixiuXiangmuVo> selectWeixiu(@Param("xid")Integer xid);
	
	//测试
	/**
	 * 结果：按多个id查询集合
	 * @param xid
	 * @return
	 */
	
	public List<LjlWeixiuXiangmuVo> ceshiselectWeixiu(@Param("list")int[] xid);
	/**
	 * 根据父id查询父级类别名称
	 * @param xfid
	 * @return
	 */
	public LjlXiangmuLeibie selectTypeF(@Param("xfid")Integer xfid);
	/**
	 * 按名称模糊查询
	 * @return
	 */
	public List<LjlWeixiuXiangmuVo> selectLikeName(@Param("xname")String xname);
	/**
	 * 查询当前类别表最大id值
	 * @return
	 */
	public int selectId();
	/**
	 * 查询当前项目表最大id值
	 * @return
	 */
	public int selectxiangmuId();
	/**
	 * 新增维修项目
	 * @param wei
	 * @return
	 */
	public int addweixiufuwu(@Param("w")LjlWeixiuFuwu wei);
	/**
	 * 修改维修项目
	 * @param wei
	 * @return
	 */
	public int updateweixiufuwu(@Param("w")LjlWeixiuFuwu wei);
	/**
	 * 删除维修项目
	 * @param fwcod
	 * @return
	 */
	public int deleteweixiufuwu(@Param("fwcod") int fwcod);
	/**
	 * 按照id查询要修改的维修项目
	 */
	public LjlWeixiuFuwu selectFuwuById(@Param("fwcod") int fwcod);
	
	public int addweixiutypeF(@Param("t")LjlXiangmuLeibie type);
	
	public List<LjlXiangmuLeibie> selectTypeFuji();
}
