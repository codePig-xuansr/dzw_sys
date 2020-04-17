package com.accp.action.zxp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zxp.*;
import com.accp.pojo.ljl.LjlFadongji;
import com.accp.pojo.zxp.*;
import com.accp.vo.zxp.ZxpUserVO;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zxp/api/txl")
public class ZxpTongxunluAction {
	@Autowired
	private ZxpTongxunluBiz biz;
	@Autowired
	private ZxpUserBiz ubiz;
	
	@GetMapping("queryTxlAll/{n}/{s}/{name}")
	public PageInfo<ZxpUserVO> queryTxlAll(@PathVariable Integer n,@PathVariable Integer s,@PathVariable String name) {		
		return ubiz.finds(n, s,"null".equals(name)?"":name);
	}
}
