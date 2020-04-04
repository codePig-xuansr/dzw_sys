package com.accp.action.sw;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sw.VipBiz;
import com.accp.pojo.sw.Vipcard;
import com.accp.pojo.sw.Weixiurecord;
import com.accp.vo.sw.VipVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/vip")
public class VipAction {
	@Autowired
	private VipBiz biz;
	/**
	 * 修改vip积分状态
	 * 
	 * @param vip
	 * @return
	 */
	@PutMapping
	public Map<String, Object> update(@RequestBody Vipcard vip) {
		System.out.println(JSON.toJSON(vip));
		int i = biz.modifyById(vip);
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
	 * 取出sessionvip信息
	 * 
	 * @param session
	 * @return
	 * @throws Exception
	 */
	@GetMapping("getSessionVip")
	public Vipcard getVipInfo(HttpSession session) throws Exception {
		Vipcard vip = (Vipcard) session.getAttribute("vip");
		System.out.println(session.getId());
		return vip;
	}

	/**
	 * 会员登入
	 * 
	 * @param vipcode
	 * @param vippwd
	 * @return
	 */
	@GetMapping("/login/{vipcode}/{vippwd}")
	public Map<String, Object> findLogin(@PathVariable Integer vipcode, @PathVariable String vippwd,
			HttpSession session) {
		Map<String, Object> message = new HashMap<String, Object>();
		Vipcard vip = biz.findLogin(vipcode, vippwd);
		if (vip != null) {
			session.setAttribute("vip", vip);
			System.out.println(session.getId());
			message.put("code", "200");
			message.put("msg", "ok");
			message.put("data", vip);
		} else {
			message.put("code", "400");
			message.put("msg", "no");
		}
		return message;
	}

	/**
	 * 查询具体会员
	 * 
	 * @param kid
	 * @return
	 */
	@GetMapping("/kh/{kid}")
	public VipVo queryById(@PathVariable Integer kid) {
		return biz.findById(kid);
	}

	/**
	 * 会员分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<VipVo> queryPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
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

	/**
	 * 删除会员卡
	 * 
	 * @param vipcode
	 * @return
	 */
	@DeleteMapping("/{vipcode}")
	public Map<String, Object> del(@PathVariable Integer vipcode) {
		int i = biz.removeVip(vipcode);
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
