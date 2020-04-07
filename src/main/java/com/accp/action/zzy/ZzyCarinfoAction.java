package com.accp.action.zzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zzy.ZzyCarinfoBiz;
import com.accp.vo.zzy.ZzyCarinfoVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zzy/api/carinfos")
public class ZzyCarinfoAction {

	@Autowired
	private ZzyCarinfoBiz biz;
	
	@GetMapping("queryCarinfo/{pageNum}/{pageSize}")
	public PageInfo<ZzyCarinfoVo> queryCarinfo(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		return biz.queryCarinfo(pageNum, pageSize);
	}
}
