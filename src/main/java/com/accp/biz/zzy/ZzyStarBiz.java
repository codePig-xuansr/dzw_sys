package com.accp.biz.zzy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zzy.IZzyStarDao;
import com.accp.pojo.zzy.ZzyStar;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZzyStarBiz {
	@Autowired
	private IZzyStarDao dao;
	
	/**
	 * 分页查询状态信息
	 * @param n
	 * @param s
	 * @return
	 */
	public PageInfo<ZzyStar> queryStarAll(Integer n,Integer s){
		PageHelper.startPage(n,s);
		List<ZzyStar> list = dao.selectList(null);
		PageInfo<ZzyStar> pageInfo=new PageInfo<ZzyStar>(list);
		System.out.println(pageInfo);
		return pageInfo;
	}
	
	/**
	 * 新增状态表信息
	 * @param star
	 * @return
	 */
	public int addStar(ZzyStar star) {
		return dao.insert(star);
	}
	
	/**
	 * 根据id查看状态信息
	 * @param sid状态编码
	 * @return
	 */
	public ZzyStar queryStarBySid(int sid) {
		QueryWrapper<ZzyStar> qw=Wrappers.query();
		qw.eq("sid", sid);
		return dao.selectOne(qw);
	}
	
	/**
	 * 修改状态信息
	 * @param star
	 * @return
	 */
	public int modifStar(ZzyStar star) {
		return dao.updateById(star);
	}
	/**
	 * 根据编号删除状态信息
	 * @param sid
	 * @return
	 */
	public int deleteStar(int sid) {
		return dao.deleteById(sid);
	}
}
