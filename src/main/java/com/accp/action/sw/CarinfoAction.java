package com.accp.action.sw;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	 * 根据车牌查询车辆
	 * 
	 * @param carno
	 * @return
	 */
	@GetMapping("/{carno}")
	public Carinfo queryById(@PathVariable String carno) {
		return biz.findById(carno);
	}

	/**
	 * 查询车辆并分页
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param id
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<CarVo> queryPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		return biz.findPageById(pageNum, pageSize, null);
	}

	/**
	 * 根据客户id查询车辆并分页
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @param id
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}/{id}")
	public PageInfo<CarVo> queryPageById(@PathVariable Integer pageNum, @PathVariable Integer pageSize,
			@PathVariable Integer id) {
		return biz.findPageById(pageNum, pageSize, id);
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

	/**
	 * 修改车辆
	 * 
	 * @param car
	 * @return
	 */
	@PutMapping
	public Map<String, Object> update(@RequestBody Carinfo car) {
		int i = biz.modifyCar(car);
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

	/**
	 * 根据车牌删除车辆
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{carno}")
	public Map<String, Object> delById(@PathVariable String carno) {
		int i = biz.removeById(carno);
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
