package com.accp.action.zzy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zzy.ZzyProductBiz;
import com.accp.pojo.zzy.ZzyKache;
import com.accp.pojo.zzy.ZzyProduct;
import com.accp.vo.zzy.ZzyProductVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zzy/api/product")
public class ZzyProductAction {
	@Autowired
	private ZzyProductBiz biz;

	/**
	 * 分页查询商品资料信息
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("queryProduct/{pageNum}/{pageSize}")
	public PageInfo<ZzyProductVo> queryProduct(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		return biz.queryProduct(pageNum, pageSize);		
	}
	/**
	 * 根据id查看商品资料
	 * @param proid
	 * @return
	 */
	@GetMapping("queryProductById/{proid}")
	public ZzyProductVo queryProductById(@PathVariable Integer proid) {
		System.out.println(proid);
		return biz.queryProduct(proid);	
	}
	
	/**
	 * 新增商品资料信息
	 * @param Product
	 * @return
	 */
	@PostMapping("addProduct")
	public Map<String, Object> addProduct(@RequestBody ZzyProduct product) {
		int count=biz.addProduct(product);
		product.setProstar(0);
		System.out.println(product);
		Map<String, Object> message = new HashMap<String, Object>();
		if(count!=0) {
			message.put("code", "ok");
			message.put("msg", "新增成功!");
		}else {
			message.put("code", "300");
			message.put("msg", "新增失败！");
		}
		return message;
	}
	/**
	 * 修改商品资料
	 * @param product
	 * @return
	 */
	@PutMapping("modifyProduct")
	public Map<String, Object> modifyKache(@RequestBody ZzyProduct product) {
		//System.out.println(biz.modifyProduct(product));
		int count=biz.modifyProduct(product);
		Map<String, Object> message = new HashMap<String, Object>();
		if(count!=0) {
			message.put("code", "ok");
			message.put("msg", "修改成功!");
		}else {
			message.put("code", "300");
			message.put("msg", "修改失败！");
		}
		return message;
	}
}
