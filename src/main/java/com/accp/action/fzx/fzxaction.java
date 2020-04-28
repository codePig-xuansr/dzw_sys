package com.accp.action.fzx;

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

import com.accp.biz.fzx.fzxbiz;
import com.accp.pojo.fzx.FzxBanzu;
import com.accp.pojo.fzx.FzxCarinfo;
import com.accp.pojo.fzx.FzxJgrecord;
import com.accp.pojo.fzx.FzxKache;
import com.accp.pojo.fzx.FzxProduct;
import com.accp.pojo.fzx.FzxUser;
import com.accp.pojo.fzx.FzxWeixiuadd;
import com.accp.pojo.fzx.FzxWeixiucl;
import com.accp.pojo.fzx.FzxWeixiufuwu;
import com.accp.pojo.fzx.FzxWeixiuxm;
import com.accp.pojo.fzx.Fzxxiangmutype;
import com.accp.vo.fzx.FzxBz;
import com.accp.vo.fzx.FzxCtcar;
import com.accp.vo.fzx.FzxWeixiu;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/fzx") // 命名空间
public class fzxaction {
	@Autowired
	private fzxbiz biz;
	/**
	 * 查询车牌号
	 * @return
	 */
	  @GetMapping("/selectBy/{carno}")
	  public List<FzxCarinfo> selectBy(@PathVariable String carno) {
		  return biz.selectBy(carno);
	  }
	  /**
		 * 根据车牌号查询信息
		 * @return
		 */
	  @GetMapping("/selectAll/{carno}")
	  public List<FzxCtcar> selectAll(@PathVariable String carno) {
			return biz.selectAll(carno);
		}
	  
	  /**
		 * 按车牌号查询维修记录
		 * @return
		 */
	  	@GetMapping("/selectWeixiuAll/{carno}")
		public List<FzxWeixiu> selectWeixiuAll(@PathVariable String carno){
			return biz.selectWeixiuAll(carno);
		}
	  	
	  	/**
		 * 按车牌号查询今日维修记录
		 * @return
		 */
	  	@GetMapping("/selectWeixiuAllorder/{carno}")
		public List<FzxWeixiu> selectWeixiuAllorder(String carno){
			return biz.selectWeixiuAllorder(carno);
		}
	  	
	  	
	  	/**
		 * 查询维修服务消息
		 * @return
		 */
	  	@GetMapping("/selectFw/{xid}")
		public List<FzxWeixiufuwu> selectFw(@PathVariable int xid){
			return biz.selectFw(xid);
		}
	  	/**
		 * 查询维修服务消息
		 * @return
		 */
	  	@GetMapping("/selectFww")
		public List<FzxWeixiufuwu> selectFww(){
			return biz.selectFww();
		}

	  	
	  	/**
		 * 查询班组信息
		 * @return
		 */
	  	@GetMapping("/selectBz")
		public List<FzxBanzu> selectBz(){
			return biz.selectBz();
		}
	  	/**
		 * 查询班组信息
		 * @return
		 */
	  	@GetMapping("/selectBzz/{num}/{size}")
		public PageInfo<FzxBz> selectBzz(@PathVariable Integer num,@PathVariable Integer size){
			return biz.selectBzz(num, size);
		}
	  	
	  	/**
		 * 查询服务类别班组
		 * @return
		 */
	  	@GetMapping("/selectFwlb/{num}/{size}")
		public PageInfo<Fzxxiangmutype> selectFwlb(@PathVariable Integer num,@PathVariable Integer size){
			return biz.selectFwlb(num, size);
		}
	  	
	  	/**
	  	 * 主详新增
	  	 * @param fzxweixiuadd
	  	 * @return
	  	 */
	  	@PostMapping("/insertweixiu")
		public Map<String, String> insertweixiu(@RequestBody FzxWeixiuadd fzxweixiuadd) {
			Map<String, String> message = new HashMap<String, String>();
			if (biz.insertweixiu(fzxweixiuadd)>0) {
				message.put("code", "200");
				message.put("msg", "ok");
			}
			return message;
		}
	  	
	  	/**
		 * 查询卡车
		 * @return
		 */
	  	@GetMapping("/selectKache/{num}/{size}")
		public PageInfo<FzxKache> selectKache(@PathVariable Integer num,@PathVariable Integer size){
			return biz.selectKache(num, size);
		}
	  	
	  	/**
		 * 查询竣工
		 * @return
		 */
	  	@GetMapping("/selectFwAll/{num}/{size}/{recorddate}/{status}/{recordid}")
		public PageInfo<FzxWeixiuadd> selectFwAll(@PathVariable Integer num,@PathVariable Integer size,
				@PathVariable String recorddate,@PathVariable String status,@PathVariable String recordid){
			return biz.selectFwAll(num, size, recorddate, status, recordid);
		}
	  	
	  	/**
		 * 修改竣工状态
		 * @param weixiurecord
		 * @return
		 */
	  	@PutMapping("/updatejg/{status}/{bztime}/{recordid}")
		public Map<String, String> updatejg(@PathVariable int status,@PathVariable int bztime,@PathVariable String recordid) {
	  		Map<String, String> message = new HashMap<String, String>();
			if (biz.updatejg(status,bztime, recordid)>0) {
				message.put("code", "200");
				message.put("msg", "ok");
			}
			return message;
		}
	  	
	  	/**
		 * 查询竣工记录
		 * @return
		 */
	  	@GetMapping("/selectJgAll/{n}/{s}")
		public PageInfo<FzxJgrecord> selectJgAll(@PathVariable Integer n,@PathVariable Integer s){
			return biz.selectJgAll(n, s);
		}
	  	
	  	/**
		 * 新增竣工记录
		 * @param fzxjgrecord
		 * @return
		 */
	  	@PostMapping("/addjg")
		public Map<String, String> addjg(@RequestBody FzxJgrecord fzxjgrecord) {
			Map<String, String> message = new HashMap<String, String>();
			if (biz.addjg(fzxjgrecord)>0) {
				message.put("code", "200");
				message.put("msg", "ok");
			}
			return message;
		}
	  	
	  	/**
		 * 查询返工次数
		 * @param recordid
		 * @return
		 */
	  	@GetMapping("/selectJgcs/{recordid}")
		public FzxJgrecord selectJgcs(@PathVariable String recordid){
			return biz.selectJgcs(recordid);
		}
	  	
	  	/**
		 * 查询服务顾问
		 * @return
		 */
	  	@GetMapping("/selectgw")
		public List<FzxUser> selectgw(){
			return biz.selectgw();
		}
	  	
	  	/**
		 * 修改卡车状态1
		 * @param kano
		 * @return
		 */
	  	@PutMapping("/updatekc/{kano}")
		public Map<String, String> updatekc(@PathVariable String kano) {
	  		Map<String, String> message = new HashMap<String, String>();
			if (biz.updatekc(kano)>0) {
				message.put("code", "200");
				message.put("msg", "ok");
			}
			return message;
		}
	  	
	  	/**
		 * 查询该车是否正在维修中
		 * @param carno
		 * @return
		 */
	  	@GetMapping("/selectwx/{carno}")
		public Map<String, String> selectwx(@PathVariable String carno){
	  		Map<String, String> message = new HashMap<String, String>();
	  		if (biz.selectwx(carno)>0) {
				message.put("code", "300");
				message.put("msg", "ok");
			}else {
				message.put("code", "200");
				message.put("msg", "ok");
			}
	  		return message;
		}
	  	
	  	/**
		 * 查询全部材料
		 * @return
		 */
	  	@GetMapping("/selectcl")
		public List<FzxProduct> selectcl(){
			return biz.selectcl();
		}
	  	
	  	/**
		 * 新增项目
		 * @param fzxweixiuxm
		 * @return
		 */
	  	@PostMapping("/addxm")
		public Map<String, String> addxm(@RequestBody List<FzxWeixiuxm> fzxweixiuxm){
			Map<String, String> message = new HashMap<String, String>();
			if (biz.addxm(fzxweixiuxm)>0) {
				message.put("code", "200");
				message.put("msg", "ok");
			}
			return message;
		}
		
		/**
		 * 新增材料
		 * @param fzxweixiucl
		 * @return
		 */
	  	@PostMapping("/addcl")
		public Map<String, String> addcl(@RequestBody List<FzxWeixiucl> fzxweixiucl){
	  		Map<String, String> message = new HashMap<String, String>();
			if (biz.addcl(fzxweixiucl)>0) {
				message.put("code", "200");
				message.put("msg", "ok");
			}
			return message;
		}
	  	
	  	/**
		 * 查询总价
		 * @return
		 */
	  	@GetMapping("/selectzj/{recordid}")
		public List<FzxBz> selectzj(@PathVariable String recordid){
			return biz.selectzj(recordid);
		}
	 
}
