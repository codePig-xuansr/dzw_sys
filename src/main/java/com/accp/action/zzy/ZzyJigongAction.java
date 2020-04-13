package com.accp.action.zzy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zzy.ZzyJigongBiz;
import com.accp.pojo.zzy.ZzyJigong;
import com.accp.vo.zzy.ZzyJigongVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zzy/api/jigong")
public class ZzyJigongAction {
	@Autowired
	private ZzyJigongBiz biz;
	/**
	 * 分页查询技工信息
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("queryJigong/{pageNum}/{pageSize}")
	public PageInfo<ZzyJigongVo> queryJigong(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
		//System.out.println(biz.queryKache(pageNum, pageSize));
		return biz.queryJigong(pageNum, pageSize);	
	}
	/**
	 * 根据id查看技工信息
	 * @param kaid
	 * @return
	 */
	@GetMapping("queryJigongById/{jid}")
	public ZzyJigongVo queryJigongById(@PathVariable int jid) {
		return biz.queryJigongById(jid);
	}
	/**
	 * 新增技工信息
	 * @param jigong
	 * @return
	 */
	@PostMapping("addjigong")
	public Map<String, Object> addJigong(@RequestBody ZzyJigong jigong) {
		int count=biz.addJigong(jigong);
		System.out.println(jigong);
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
}
