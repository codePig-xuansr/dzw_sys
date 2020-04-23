package com.accp.dao.zxp;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.zxp.ZxpLeave;
import com.accp.pojo.zxp.zxpp;
import com.accp.vo.zxp.ZxpLVO;
import com.accp.vo.zxp.ZxpLeaveVO;
import com.accp.vo.zxp.ZxpUV;
import com.accp.vo.zxp.ZxpUserVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IZxpLeaveDao extends BaseMapper<ZxpLeave>{
	public int updateLeave(@Param("use")zxpp use);
	public int deletea(@Param("id")Integer id);
	public List<ZxpLeaveVO> findLeave(@Param("name") String name);
	public List<ZxpLVO> findUVO(@Param("name") String name);
	public List<ZxpLVO> findX();
}
