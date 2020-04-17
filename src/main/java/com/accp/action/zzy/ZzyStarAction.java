package com.accp.action.zzy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.zzy.ZzyStarBiz;
import com.accp.pojo.zzy.ZzyStar;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/zzy/api/class1")
public class ZzyStarAction {
	
	
	@Autowired
	private ZzyStarBiz biz;
	 /**
	  * 分页查询状态信息
	  * @param n
	  * @param s
	  * @return
	  */
	@GetMapping("queryStarAll/{n}/{s}")
	public PageInfo<ZzyStar> queryStarAll(@PathVariable Integer n,@PathVariable Integer s) {		
		return biz.queryStarAll(n,s);
	}
	/**
	 * 查看状态信息
	 * @return
	 */
	@GetMapping("queryStarList")
	public List<ZzyStar> queryStarList(){
		return biz.queryStarList();
	}
	/**
	 * 新增状态表信息
	 * @param star 状态表对象
	 * @return
	 */
	@PostMapping("addStar/{star}")
	public Map<String, Object> zhuce(@RequestBody ZzyStar star) {
		int count=biz.addStar(star);
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
	 * 根据状态编码查询状态信息
	 * @param sid状态编码
	 * @return
	 */
	@GetMapping("queryStarBySid/{sid}")
	public ZzyStar queryStarBySid(@PathVariable int sid) {
		return biz.queryStarBySid(sid);
	}
	
	/**
	 * 根据编号删除状态信息
	 * @param sid状态编码
	 * @return
	 */
	@DeleteMapping("deleteStar/{sid}")
	public Map<String, Object> deleteStar(@PathVariable int sid) {
		int count=biz.deleteStar(sid);
		Map<String, Object> message = new HashMap<String, Object>();
		if(count!=0) {
			message.put("code", "200");
			message.put("msg", "删除成功!");
		}else {
			message.put("code", "300");
			message.put("msg", "删除失败!");
		}
		return message;
	}
	/**
	 * 修改状态信息
	 * @param star
	 * @return
	 */
	@PutMapping("modifStar/{star}")
	public Map<String, Object> modifStar(@RequestBody ZzyStar star) {
		int count=biz.modifStar(star);
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
