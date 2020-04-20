package com.accp.action.zzy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zzy.ZzyGonghuoBiz;
import com.accp.pojo.zzy.ZzyGonghuo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zzy/api/gonghuo")
public class ZzyGonghuoAction {
	@Autowired
	private ZzyGonghuoBiz biz;
	
	/**
	 * 查看供货商信息
	 * @return
	 */
	@GetMapping("queryGonghuoList/{n}/{s}")
	public PageInfo<ZzyGonghuo> queryGonghuoList(@PathVariable Integer n,@PathVariable Integer s) {		
		return biz.queryGonghuo(n,s);
	}
}
