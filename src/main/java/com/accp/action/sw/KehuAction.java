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

import com.accp.biz.sw.KehuBiz;
import com.accp.pojo.sw.Kehu;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/kehu")
public class KehuAction {
	@Autowired
	private KehuBiz biz;

	/**
	 * 客户分页查询
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Kehu> queryPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		return biz.findPage(pageNum, pageSize);
	}

	/**
	 * 根据客户id查询
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public Kehu queryById(@PathVariable Integer id) {
		return biz.findById(id);
	}

	/**
	 * 查询最新的客户id
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping
	public Kehu queryMaxId() {
		return biz.findMaxId();
	}

	/**
	 * 新增客户
	 * 
	 * @param kehu
	 * @return
	 */
	@PostMapping
	public Map<String, Object> insert(@RequestBody Kehu kehu) {
		int i = biz.addKehu(kehu);
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
	 * 修改客户
	 * 
	 * @param kehu
	 * @return
	 */
	@PutMapping
	public Map<String, Object> update(@RequestBody Kehu kehu) {
		int i = biz.modifyKehu(kehu);
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
	 * 根据id删除客户
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	public Map<String, Object> delById(@PathVariable Integer id) {
		int i = biz.removeById(id);
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
