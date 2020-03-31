package com.accp.action.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sw.FadongjiBiz;
import com.accp.pojo.sw.Fadongji;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/fadongji")
public class FadongjiAction {
	@Autowired
	private FadongjiBiz biz;

	/**
	 * 发动机分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Fadongji> queryPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		return biz.findPage(pageNum, pageSize);
	}
}
