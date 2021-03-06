package com.accp.action.zkx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zkx.ZkxFunBiz;
import com.accp.pojo.zkx.ZkxFunction;
import com.accp.vo.zkx.ZkxURoleVO;

@RestController
@RequestMapping("/zkx/api/funs")
public class ZkxFunAction {

	@Autowired
	private ZkxFunBiz biz;
	
	@GetMapping("{user}/{pwd}")
	public List<ZkxFunction> showFunByUser(@PathVariable String user,@PathVariable String pwd){
		return biz.showFunByUser(user, pwd);
	}
	
	@GetMapping("ufuns/{rid}")
	public List<ZkxFunction> showFuns(@PathVariable Integer rid){
		return biz.showUFuns(rid);
	}
	
	@GetMapping("f")
	public List<ZkxFunction> queryAllFuns(){
		return biz.queryAllFuns();
	}
}
