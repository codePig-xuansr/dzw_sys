package com.accp.action.zkx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zkx.ZkxPaBiz;
import com.accp.pojo.zkx.ZkxPa;
import com.alibaba.fastjson.JSON;

@RestController
@RequestMapping("/zkx/api/pa")
public class ZkxPaAction {

	@Autowired
	private ZkxPaBiz biz;
	
	@PostMapping
	public Integer updatePa(@RequestBody List<ZkxPa> pa) {
		List<ZkxPa> pas=JSON.parseArray(JSON.toJSONString(pa), ZkxPa.class);
		System.out.println(pas);
		if(biz.removePaByRid(pas.get(0).getRid())>0) {
			return biz.addPa(pa);
		}
		return -1;
	}
}
