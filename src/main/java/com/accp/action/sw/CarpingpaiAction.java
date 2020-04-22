package com.accp.action.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sw.CarpingpaiBiz;
import com.accp.pojo.sw.Carpingpai;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/pingpai")
public class CarpingpaiAction {
	@Autowired
	private CarpingpaiBiz biz;

	/**
	 * 查询所有品牌
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Carpingpai> queryPage(@PathVariable Integer pageNum,@PathVariable Integer pageSize) {
		return biz.findPage(pageNum, pageSize);
	}
}
