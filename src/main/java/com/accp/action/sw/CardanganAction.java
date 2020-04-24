package com.accp.action.sw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sw.CardanganBiz;
import com.accp.pojo.sw.Cardangan;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/dangan")
public class CardanganAction {
	@Autowired
	private CardanganBiz biz;

	/**
	 * 查询所有车型
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/{pageNum}/{pageSize}/{pid}")
	public PageInfo<Cardangan> queryPage(@PathVariable Integer pageNum,@PathVariable Integer pageSize,@PathVariable Integer pid) {
		return biz.findPage(pid,pageNum, pageSize);
	}
}
