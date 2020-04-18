package com.accp.dao.zzy;

import java.util.List;

import com.accp.pojo.zzy.ZzyProduct;
import com.accp.vo.zzy.ZzyKacheVo;
import com.accp.vo.zzy.ZzyProductVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IZzyProductDao extends BaseMapper<ZzyProduct>{
	
	/**
	 * 查询商品资料
	 * @return
	 */
	public List<ZzyProductVo> queryProduct();
	
	/**
	 * 根据id查看商品资料
	 * @param proid
	 * @return
	 */
	public ZzyProductVo queryProductById(int proid);
	
	/**
	 * 根据商品名称进行模糊查询
	 * @param proname
	 * @return
	 */
	public List<ZzyProductVo> queryProductByName(String proname);
}
