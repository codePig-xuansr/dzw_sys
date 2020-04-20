package com.accp.action.ljl;

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
	
	@GetMapping("All/weixiuxiangmuMaxId")
	public int selectxiangmuId() {
		return biz.selectxiangmuId();
	}
	
	@GetMapping("All/weixiuleibie/name/{n}/{s}")
	public PageInfo<LjlXiangmuLeibie> selectTypeName(@PathVariable Integer n, @PathVariable Integer s) {
		/*
		 * biz.selectLeibie().forEach(r->{ System.out.println(r); });
		 */
		return biz.selectLeibie(n, s);
	}
	@PostMapping("/All/addweixiuxiangmu")
	public Map<Object, Object> addWeixiu(@RequestBody LjlWeixiuFuwu wei){
		Map<Object, Object> map = new HashMap<Object, Object>();
		//System.out.println(wei);
		int sum = biz.addweixiufuwu(wei);
		if (sum>0) {
			map.put("msg", "新增成功");
		}else {
			map.put("msg", "新增失败");
		}
		return map;
	}
	@GetMapping("All/xiugai/{coding}")
	public LjlWeixiuFuwu selectfuwubyid(@PathVariable int coding) {
		return biz.selectFuwuById(coding);
	}
	
	@PutMapping("All/weixiuxiangmu/update")
	public Map<Object, Object> updateWeixiu(@RequestBody LjlWeixiuFuwu wei){
		Map<Object, Object> map = new HashMap<Object, Object>();
		//System.out.println(wei);
		int sum = biz.updateweixiufuwu(wei);
		if (sum>0) {
			map.put("msg", "修改成功");
		}else {
			map.put("msg", "修改失败");
		}
		return map;
	}
	
	@PostMapping("All/delete/{coding}")
	public Map<Object, Object> deleteWeixiu(@PathVariable int coding){
		Map<Object, Object> map = new HashMap<Object, Object>();
		//System.out.println(wei);
		int sum = biz.deleteweixiufuwu(coding);
		if (sum>0) {
			map.put("msg", "删除成功");
		}else {
			map.put("msg", "删除失败");
		}
		return map;
	}
	
	@PostMapping("All/addweixiutypeF")
	public Map<Object, Object> addweixiutypeF(@RequestBody LjlXiangmuLeibie type){
		Map<Object, Object> map = new HashMap<Object, Object>();
		//System.out.println(type);
		int sum = biz.addweixiutypeF(type);
		if (sum>0) {
			map.put("msg", "添加成功");
		}else {
			map.put("msg", "添加失败");
		}
		return map;
	}
	
	@GetMapping("All/selecttype/typefu")
	public List<LjlXiangmuLeibie> selectTypeFuji() {
		return biz.selectTypeFuji();
	}
	
}
