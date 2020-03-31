package com.accp.dao.sw;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.sw.Carinfo;
import com.accp.vo.sw.CarVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ICarinfoDao extends BaseMapper<Carinfo> {
  public List<CarVo> queryListById(@Param("id") Integer id);
}
