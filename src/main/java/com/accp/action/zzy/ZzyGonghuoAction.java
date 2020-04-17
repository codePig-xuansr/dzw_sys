package com.accp.action.zzy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zzy.ZzyGonghuoBiz;
import com.accp.pojo.zzy.ZzyGonghuo;

@RestController
@RequestMapping("/zzy/api/gonghuo")
public class ZzyGonghuoAction {
	@Autowired
	private ZzyGonghuoBiz biz;
	
	/**
	 * 查看状态信息
	 * @return
	 */
	@GetMapping("queryGonghuoList")
	public List<ZzyGonghuo> queryGonghuoList(){
		return biz.queryGonghuo();
	}
}
