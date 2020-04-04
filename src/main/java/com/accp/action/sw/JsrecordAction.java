package com.accp.action.sw;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sw.JsrecordBiz;
import com.accp.pojo.sw.Jsrecord;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/api/js")
public class JsrecordAction {
	@Autowired
	private JsrecordBiz biz;

	/**
	 * 新增结算
	 * 
	 * @param jsrecord
	 * @return
	 */
	@PostMapping
	public Map<String, Object> insert(@RequestBody Jsrecord jsrecord) {
		jsrecord.setJsdate(new Date());
		int i = biz.addJrecord(jsrecord);
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
