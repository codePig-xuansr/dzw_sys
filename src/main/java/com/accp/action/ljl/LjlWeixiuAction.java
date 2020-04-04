package com.accp.action.ljl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljl.*;
import com.accp.pojo.ljl.*;
import com.accp.vo.ljl.LjlWeixiuXiangmuVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/ljl/weixiu")
public class LjlWeixiuAction {

	@Autowired
	private LjlWeixiuxiangmuBiz biz;
	
	@GetMapping("All/type")
	public Map<Object, Object> selectType(){
		Map<Object, Object> map = new HashMap<Object, Object>();
		List<LjlXiangmuLeibie> list = biz.selectLeibie();
		map.put("list", list);
		return map;
	}
	
	/*
	 * @GetMapping("All/weixiu/{xid}/{n}/{s}") public PageInfo<LjlWeixiuXiangmuVo>
	 * selectWeixiu(Integer xid, Integer n, Integer s){ return biz.selectWeixiu(xid,
	 * n, s); }
	 */
	
	/*
	 * @GetMapping("All/typef") public LjlXiangmuLeibie selectTypeF(Integer xfid,
	 * Integer xid) { return biz.selectTypeF(xfid, xid); }
	 */
	
	@GetMapping("All/weixiuxiangmu/{chkIds1}/{n}/{s}")
	public PageInfo<LjlWeixiuXiangmuVo> selectweixiu(@PathVariable int[] chkIds1, @PathVariable Integer n, @PathVariable Integer s){
		return biz.ceshiselectWeixiu(chkIds1, n, s);
	}
	
	@GetMapping("All/fuji/{xfid}")
	public LjlXiangmuLeibie selectfuname(@PathVariable Integer xfid){
		return biz.selectTypeF(xfid);
	}
	
	@GetMapping("All/byname/{xname}/{n}/{s}")
	public PageInfo<LjlWeixiuXiangmuVo> selectLikename(@PathVariable String xname, @PathVariable Integer n, @PathVariable Integer s){
		//System.out.println("-"+xname+"-");
		return biz.selectLikeName(xname, n, s);
	}
	
	@GetMapping("All/weixiutypeMaxId")
	public int selectId() {
		return biz.selectId();
	}
}
