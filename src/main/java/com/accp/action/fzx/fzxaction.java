package com.accp.action.fzx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.fzx.fzxbiz;
import com.accp.pojo.fzx.FzxCarinfo;
import com.accp.vo.fzx.FzxCtcar;
import com.accp.vo.fzx.FzxWeixiu;

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
		 * 查询维修记录
		 * @return
		 */
	  	@GetMapping("/selectWeixiuAll/{carno}")
		public List<FzxWeixiu> selectWeixiuAll(@PathVariable String carno){
			return biz.selectWeixiuAll(carno);
		}
	 
}
