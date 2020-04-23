package com.accp.action.sw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sw.ProductBiz;
import com.accp.vo.sw.ProductVo;

@RestController
@RequestMapping("/api/product")
public class ProductAction {
	@Autowired
	private ProductBiz biz;

	/**
	 * 根据维修单号查询消费商品
	 * 
	 * @param recordid
	 * @return
	 */
	@GetMapping("/{recordid}")
	public List<ProductVo> queryByRecordid(@PathVariable String recordid) {
		return biz.findListByRecordid(recordid);
	}
}
