package com.accp.action.sw;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sw.CarinfoBiz;
import com.accp.pojo.sw.Carinfo;
import com.accp.vo.sw.CarVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/car")
public class CarinfoAction {
	@Autowired
	private CarinfoBiz biz;

	/**
	 * 根据客户id查询车辆并分页
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param id
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}/{id}")
	public PageInfo<CarVo> queryPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize,
			@PathVariable Integer id) {
		return biz.findPage(pageNum, pageSize, id);
	}

	/**
	 * 新增车辆
	 * 
	 * @param car
	 * @return
	 */
	@PostMapping
	public Map<String, Object> insert(@RequestBody Carinfo car) {
		int i = biz.addCar(car);
		Map<String, Object> message = new HashMap<String, Object>();
		if (i > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		} else {
			message.put("code", "400");
			message.put("msg", "no");
		}
		return message;
	}

}
