package com.accp.dao.sw;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.vo.sw.ProductVo;

public interface IProductDao {
	public List<ProductVo> queryListByRecordid(@Param("recordid") String recordid);
}
