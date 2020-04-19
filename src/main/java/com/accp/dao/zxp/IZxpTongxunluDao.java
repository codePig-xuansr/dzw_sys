package com.accp.dao.zxp;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.ljl.LjlFadongji;
import com.accp.pojo.zxp.ZxpTongxunlu;
import com.accp.pojo.zxp.tongxunlu;
import com.accp.pojo.zxp.zxpp;
import com.accp.vo.zxp.ZxpTXL;
import com.accp.vo.zxp.ZxpUTVO;
import com.accp.vo.zxp.ZxpUV;
import com.accp.vo.zxp.ZxpUserVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IZxpTongxunluDao extends BaseMapper<tongxunlu>{
	public tongxunlu findT();
	public int updateT(@Param("txl")tongxunlu txl);
	public List<ZxpUserVO> findUser();
	public List<ZxpUTVO> findUVO(@Param("name") String name,@Param("id") Integer id);
	public List<ZxpTXL> selectUSER(@Param("name") String name);
}
