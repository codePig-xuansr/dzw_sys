package com.accp.dao.ljl;

import java.util.*;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ljl.*;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
/**
 * 发动机Dao层
 * @author ASUS
 *
 */
public interface ILjlFadongjiDao extends BaseMapper<LjlFadongji>{
	/**
	 * 查询全部
	 * @return
	 */
	public List<LjlFadongji> selectAll();
	/**
	 * 查询数据库最大值的ID
	 */
	public int selectId();
	/**
	 * 添加发动机品牌
	 * @return
	 */
	public int addFadongji(@Param("fdj")LjlFadongji fdj);
	/**
	 * 修改发动机信息
	 * @param fdj
	 * @return
	 */
	public int updateFadongji(@Param("fdj")LjlFadongji fdj);
	
	public int deletefadongji(@Param("fadongjiid")Integer fadongjiid);

}
