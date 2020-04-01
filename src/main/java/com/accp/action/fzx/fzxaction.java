package com.accp.action.fzx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.fzx.fzxbiz;
import com.accp.pojo.fzx.FzxBanzu;
import com.accp.pojo.fzx.FzxCarinfo;
import com.accp.pojo.fzx.FzxWeixiufuwu;
import com.accp.vo.fzx.FzxCtcar;
import com.accp.vo.fzx.FzxWeixiu;
import com.alibaba.fastjson.JSON;

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
		 * 查询维修服务消息
		 * @return
		 */
	  	@GetMapping("/selectFw")
		public List<FzxWeixiufuwu> selectFw(){
			return biz.selectFw();
		}
	  	
	  	/**
		 * 查询班组
		 * @return
		 */
	  	@GetMapping("/selectBz")
		public List<FzxBanzu> selectBz(){
			return biz.selectBz();
		}
	 
}
