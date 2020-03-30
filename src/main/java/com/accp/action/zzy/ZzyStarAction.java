package com.accp.action.zzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zzy.ZzyStarBiz;
import com.accp.pojo.zzy.ZzyStar;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/class1")
public class ZzyStarAction {
	
	@Autowired
	private ZzyStarBiz biz;
	 /**
	  * 查询状态信息
	  * @param n
	  * @param s
	  * @return
	  */
	@GetMapping("queryStarAll/{n}/{s}")
	public PageInfo<ZzyStar> queryStarAll(@PathVariable Integer n,@PathVariable Integer s) {
		
		return biz.queryStarAll(n,s);
	}

}
