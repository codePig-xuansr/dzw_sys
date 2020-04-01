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
	 * 按类别查询所有相关维修项目
	 * @param xid
	 * @return
	 */
	public List<LjlWeixiuXiangmuVo> selectWeixiu(@Param("xid")Integer xid);
	/**
	 * 根据父id查询父级类别名称
	 * @param xfid
	 * @return
	 */
	public LjlXiangmuLeibie selectTypeF(@Param("xfid")Integer xfid, @Param("xid")Integer xid);
}
