package com.accp.dao.zzy;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.zzy.ZzyJigong;
import com.accp.vo.zzy.ZzyJigongVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IZzyJigongDao extends BaseMapper<ZzyJigong>{
	/**
	 * 查看技工信息
	 * @return
	 */
	public List<ZzyJigongVo> queryJigong(@Param("bzid") Integer bzid);
	
	/**
	 * 根据id查看技工信息
	 * @param jid
	 * @return
	 */
	public ZzyJigongVo queryJigongById(int jid);
}
