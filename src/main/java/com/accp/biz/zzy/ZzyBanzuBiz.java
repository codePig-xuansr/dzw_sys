package com.accp.biz.zzy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zzy.IZzyBanzuDao;
import com.accp.pojo.zzy.ZzyBanzu;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZzyBanzuBiz {
	@Autowired
	private IZzyBanzuDao dao;
	/**
	 * 分页查询班组信息
	 * @param n
	 * @param s
	 * @return
	 */
	public PageInfo<ZzyBanzu> queryStarAll(Integer n,Integer s){
		PageHelper.startPage(n,s);
		List<ZzyBanzu> list = dao.selectList(null);
		PageInfo<ZzyBanzu> pageInfo=new PageInfo<ZzyBanzu>(list);
		//System.out.println(pageInfo);
		return pageInfo;
	}
	
	/**
	 * 新增班组表信息
	 * @param banzu
	 * @return
	 */
	public int addStar(ZzyBanzu banzu) {
		return dao.insert(banzu);
	}
	
	/**
	 * 根据id查看班组信息
	 * @param bzid班组编码
	 * @return
	 */
	public ZzyBanzu queryStarBySid(int bzid) {
		QueryWrapper<ZzyBanzu> qw=Wrappers.query();
		qw.eq("bzid", bzid);
		return dao.selectOne(qw);
	}
	
	/**
	 * 修改班组信息
	 * @param banzu
	 * @return
	 */
	public int modifStar(ZzyBanzu banzu) {
		return dao.updateById(banzu);
	}
	/**
	 * 根据编号删除班组信息
	 * @param bid班组id
	 * @return
	 */
	public int deleteStar(int bzid) {
		return dao.deleteById(bzid);
	}
}
