package com.accp.dao.zkx;

import java.util.List;

import com.accp.pojo.zkx.ZkxUser;
import com.accp.vo.zkx.ZkxTongXunVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface ZkxUserDao extends BaseMapper<ZkxUser>{

	public List<ZkxTongXunVO> queryUserList();
}
