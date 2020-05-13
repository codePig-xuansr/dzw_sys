package com.accp.dao.zzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.zzy.ZzyBanzu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IZzyBanzuDao extends BaseMapper<ZzyBanzu>{
	/**
	 * 查询班组信息
	 * @return
	 */
	public List<ZzyBanzu> queryBanzu(@Param("bzname") String bzname);
}
