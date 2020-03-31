package com.accp.action.zzy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zzy.ZzyStarBiz;
import com.accp.pojo.zzy.ZzyStar;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zzy/api/class1")
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
	
	/**
	 * 新增状态表信息
	 * @param star 状态表对象
	 * @return
	 */
	@PostMapping("addStar/{star}")
	public Map<String, Object> zhuce(@RequestBody ZzyStar star) {
		int count=biz.addStar(star);
		Map<String, Object> message = new HashMap<String, Object>();
		if(count!=0) {
			message.put("code", "200");
			message.put("msg", "新增成功！");
		}else {
			message.put("code", "300");
			message.put("msg", "新增失败！");
		}
		return message;
	}
	
	/**
	 * 新增状态表信息
	 * @param sname等级名称
	 * @param ticheng提成权重
	 * @param worktime时长
	 * @return
	 */
	/*
	 * @PostMapping("addStar/{sname}/{ticheng}/{worktime}") public String
	 * addStar(@PathVariable String sname,@PathVariable Float ticheng,@PathVariable
	 * int worktime) { ZzyStar star=new ZzyStar(sname,ticheng,worktime);
	 * if(biz.addStar(star)!=0) { return
	 * "redirect:/zzy/api/class1/queryStarAll/{1}/{3}"; } return ""; }
	 */
}
