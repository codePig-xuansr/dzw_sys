package com.accp.action.sw;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sw.VipBiz;
import com.accp.pojo.sw.Vipcard;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/vip")
public class VipAction {
	@Autowired
	private VipBiz biz;

	/**
	 * 会员分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Vipcard> queryPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		return biz.findPage(pageNum, pageSize);
	}

	/**
	 * 新增会员卡
	 * 
	 * @param kehu
	 * @return
	 */
	@PostMapping
	public Map<String, Object> insert(@RequestBody Vipcard vip) {
		vip.setJifen(0);
		vip.setStartdate(new Date());
		vip.setVipdiscount(0.95f);
		int i = biz.addVip(vip);
		Map<String, Object> message = new HashMap<String, Object>();
		if (i > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		} else {
			message.put("code", "400");
			message.put("msg", "no");
		}
		return message;
	}

	/**
	 * 查询会员卡号是否重复
	 * 
	 * @param vipcode
	 * @return
	 */
	@GetMapping("/{vipcode}")
	public Map<String, Object> queryRepetition(@PathVariable Integer vipcode) {
		int i = biz.findRepetition(vipcode);
		Map<String, Object> message = new HashMap<String, Object>();
		if (i > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		} else {
			message.put("code", "400");
			message.put("msg", "no");
		}
		return message;
	}
}
