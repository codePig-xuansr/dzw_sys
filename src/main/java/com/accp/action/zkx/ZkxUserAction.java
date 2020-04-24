package com.accp.action.zkx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zkx.ZkxUserBiz;
import com.accp.pojo.zkx.ZkxUser;
import com.accp.vo.zkx.ZkxTongXunVO;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zkx/api/user")
public class ZkxUserAction {

	@Autowired
	private ZkxUserBiz biz;
	
	@GetMapping("login/{user}/{pwd}")
	public Map<String, String> loginUser(@PathVariable String user,@PathVariable String pwd) {
		Map<String, String> map=new HashMap<String, String>();
		if(biz.queryUser(user, pwd)!=null) {
			if(biz.queryUser(user, pwd).getUstatus()==0) {
				map.put("code", "200");
				map.put("msg", JSON.toJSONString(biz.queryUser(user, pwd)));
			}else {
				map.put("code", "403");
				map.put("msg", "离职人员拒绝访问");
			}
		}else {
			map.put("code", "300");
			map.put("msg", "用户不存在");
		}
		
		return map;
	}
	
	@GetMapping("byRid/{pageNum}/{pageSize}/{rid}")
	public PageInfo<ZkxTongXunVO> queryUserVo(@PathVariable Integer pageNum, @PathVariable Integer pageSize,@PathVariable Integer rid){
		return biz.queryUserVo(pageNum, pageSize, rid);
	}
	
	@PutMapping("u")
	public Integer updatePwd(@RequestBody ZkxUser user) {
		return biz.updatePwd(user);
	}
}
