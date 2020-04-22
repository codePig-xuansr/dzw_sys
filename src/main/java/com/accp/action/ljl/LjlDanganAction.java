package com.accp.action.ljl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.ljl.*;
import com.accp.pojo.ljl.*;
import com.accp.vo.ljl.LjlChexingVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/ljl/dangan")
public class LjlDanganAction {

	@Autowired
	private LjlChexingBiz biz;
	
	@GetMapping("All/Pingpai")
	public List<LjlPingpaiChexing> selectPingpai(){
		return biz.selectPingpai();
	}
	
	@GetMapping("All/pingpai/byname/{pname}")
	public List<LjlPingpaiChexing> selectPingpaiByname(@PathVariable String pname){
		/*
		 * if (pname==null) { System.out.println(1); }else if (pname.equals("")) {
		 * System.out.println(2); }else { System.out.println(3); }
		 */
		return biz.selectPingpaiByname(pname);
	}
	
	@GetMapping("All/Pingpai/Byid/{pid}")
	public LjlPingpaiChexing selectPingpaiByid(@PathVariable int pid){
		return biz.selectPingpaiByid(pid);
	}
	
	@GetMapping("All/Dang/{n}/{s}")
	public PageInfo<LjlChexingVo> selectAllDangan(@PathVariable Integer n, @PathVariable Integer s){
		return biz.selectAllDang(n, s);
	}
	
	@GetMapping("pingpaiadd/IdMax")
	public int selectPIdMax() {
		return biz.selectPidMax();
	}
	
	@PostMapping("pingpai/add")
	public Map<Object, Object> pingpaiadd(@RequestBody LjlPingpaiChexing ping){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.pingpaiadd(ping);
		if (sum>0) {
			map.put("msg", "添加成功");
		}else {
			map.put("msg", "添加失败");
		}
		return map;
	}
	
	@PostMapping("All/pingpai/{pid}")
	public Map<Object, Object> pingpaidelete(@PathVariable int pid){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.pingpaidel(pid);
		if (sum>0) {
			map.put("msg", "删除成功");
		}else {
			map.put("msg", "删除失败");
		}
		return map;
	}
	
	@PutMapping("pingpai/update")
	public Map<Object, Object> pingpaiupdate(@RequestBody LjlPingpaiChexing ping){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.pingpaiupdate(ping);
		if (sum>0) {
			map.put("msg", "修改成功");
		}else {
			map.put("msg", "修改失败");
		}
		return map;
	}
	
	@GetMapping("danganadd/IdMax")
	public int selectDIdMax() {
		int sum = biz.selectDidMax();
		/*
		 * if (sum==0) { return 0; }else { return 1; }
		 */
		return sum;
	}
	
	@GetMapping("selectdangan/fadongji/{n}/{s}")
	public Map<Object, Object> selectfadongji(@PathVariable Integer n, @PathVariable Integer s){
		Map<Object, Object> map = new HashMap<Object, Object>();
		PageInfo<LjlFadongji> list = biz.selectfadongji(n, s);
		map.put("list", list);
		return map;
	}
	
	@GetMapping("selectdangan/danganpingpai/{n}/{s}")
	public Map<Object, Object> selectdanganpingpai(@PathVariable Integer n, @PathVariable Integer s){
		Map<Object, Object> map = new HashMap<Object, Object>();
		PageInfo<LjlPingpaiChexing> list = biz.selectPingpai2(n, s);
		map.put("list", list);
		return map;
	}
	
	@PostMapping("chexingdangan/add")
	public Map<Object, Object> adddangan(@RequestBody LjlChexingDangan cardangan){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.danganadd(cardangan);
		if (sum>0) {
			map.put("msg", "添加成功");
		}else {
			map.put("msg", "添加失败");
		}
		return map;
	}
	
	@GetMapping("All/Dangan/Byid/{danganid}")
	public LjlChexingVo selectdanganByid(@PathVariable int danganid){
		Map<Object, Object> map = new HashMap<Object, Object>();
		LjlChexingVo dang = biz.selectdanganByid(danganid);
		System.out.println(dang);
		return dang;
	}
	
	@PutMapping("chexing/update")
	public Map<Object, Object> updatechexingdangan(@RequestBody LjlChexingDangan cardangan){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.updatechexingdangan(cardangan);
		if (sum>0) {
			map.put("msg", "修改成功");
		}else {
			map.put("msg", "修改失败");
		}
		return map;
	}
	
	@DeleteMapping("chexingdel/{danganid}")
	public Map<Object, Object> deletechexingdangan(@PathVariable int danganid){
		Map<Object, Object> map = new HashMap<Object, Object>();
		int sum = biz.deletechexingdangan(danganid);
		if (sum>0) {
			map.put("msg", "删除成功");
		}else {
			map.put("msg", "删除失败");
		}
		return map;
	}
	
	@GetMapping("All/chexing/byname/{carname}/{n}/{s}")
	public PageInfo<LjlChexingVo> selectChexingByname(@PathVariable String carname ,@PathVariable int n, @PathVariable int s){
		return biz.selectChexingByname(carname, n, s);
	}
	
	@GetMapping("chexing/danganchaxun/bypid/{pid}/{n}/{s}")
	public PageInfo<LjlChexingVo> selectChexingBypid(@PathVariable int pid ,@PathVariable int n, @PathVariable int s){
		return biz.selectChexingBypid(pid, n, s);
	}
}
