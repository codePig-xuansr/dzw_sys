package com.accp.action.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sw.WeixiuBiz;
import com.accp.vo.sw.WeixiuVo;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/weixiu")
public class WeixiuAction {
	@Autowired
	private WeixiuBiz biz;

	/**
	 * 根据维修单号查询
	 * 
	 * @param recordid
	 * @return
	 */
	@GetMapping("/{recordid}")
	public PageInfo<WeixiuVo> queyPageByRecordid(@PathVariable String recordid) {
		return biz.findPageByRecordid(recordid);
	}

	/**
	 * 根据结算状态查询维修分页并查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param carno
	 * @return
	 */
	@GetMapping("/status/{pageNum}/{pageSize}/{status}")
	public PageInfo<WeixiuVo> queryPageCarno(@PathVariable Integer pageNum, @PathVariable Integer pageSize,
			@PathVariable Integer status) {
		return biz.findPageByStatus(pageNum, pageSize, status);
	}

	/**
	 * 根据客户id查询消费分页并查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param id
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}/{id}")
	public PageInfo<WeixiuVo> queryPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize,
			@PathVariable Integer id) {
		return biz.findPage(pageNum, pageSize, id, null);
	}

	/**
	 * 根据车牌查询消费分页并查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param carno
	 * @return
	 */
	@GetMapping("/car/{pageNum}/{pageSize}/{carno}")
	public PageInfo<WeixiuVo> queryPageCarno(@PathVariable Integer pageNum, @PathVariable Integer pageSize,
			@PathVariable String carno) {
		return biz.findPage(pageNum, pageSize, null, carno);
	}
}
