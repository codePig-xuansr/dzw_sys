package com.accp.dao.sw;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.sw.Vipcard;
import com.accp.vo.sw.VipVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IVipDao extends BaseMapper<Vipcard> {
	public List<VipVo> queryList();

	public VipVo queryById(@Param("kid") Integer kid);
}
