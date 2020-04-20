package com.accp.biz.zzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.zzy.IZzyDepartmentDao;
import com.accp.pojo.zzy.ZzyDepartment;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ZzySelectBiz {
	@Autowired
	private IZzyDepartmentDao depdao;//部门
	
	public PageInfo<ZzyDepartment> findDepartment(Integer n,Integer s) {
		PageHelper.startPage(n,s);
		return new PageInfo <ZzyDepartment> (depdao.selectList(null));
	}
}
