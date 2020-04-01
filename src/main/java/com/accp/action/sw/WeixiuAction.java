package com.accp.action.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sw.WeixiuBiz;
import com.accp.vo.sw.WeixiuVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/weixiu")
public class WeixiuAction {
	@Autowired
	private WeixiuBiz biz;

	/**
	 * 根据客户id查询消费分页并查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param id
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}/{id}")
	public PageInfo<WeixiuVo> queryPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize,
			@PathVariable Integer id) {
		return biz.findPage(pageNum, pageSize, id);
	}

}