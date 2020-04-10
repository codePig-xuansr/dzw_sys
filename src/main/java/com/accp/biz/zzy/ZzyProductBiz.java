package com.accp.biz.zzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zzy.IZzyProductDao;
import com.accp.pojo.zzy.ZzyProduct;
import com.accp.vo.zzy.ZzyProductVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZzyProductBiz {
	@Autowired
	private IZzyProductDao dao;
	
	/**
	 * 分页查询商品资料信息
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<ZzyProductVo> queryProduct(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<>(dao.queryProduct());
	}
	/**
	 * 根据id查看商品资料
	 * @param proid
	 * @return
	 */
	public ZzyProductVo queryProduct(int proid) {
		return dao.queryProductById(proid);
	}
	/**
	 * 新增商品资料信息
	 * @param product 商品资料对象
	 * @return
	 */
	public int addProduct(ZzyProduct product) {
		return dao.insert(product);
	}
	/**
	 * 修改商品资料
	 * @param product
	 * @return
	 */
	public int modifyProduct(ZzyProduct product) {
		return dao.updateById(product);
	}
}
