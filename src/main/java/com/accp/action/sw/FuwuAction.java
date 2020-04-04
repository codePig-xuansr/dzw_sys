package com.accp.action.sw;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sw.FuwuBiz;
import com.accp.vo.sw.FuwuVo;

@RestController
@RequestMapping("/api/fuwu")
public class FuwuAction {

	@Autowired
	private FuwuBiz biz;

	@GetMapping("/{recordid}")
	public List<FuwuVo> queryByRecordid(@PathVariable String recordid) {
		return biz.findByRecordid(recordid);
	}
}
