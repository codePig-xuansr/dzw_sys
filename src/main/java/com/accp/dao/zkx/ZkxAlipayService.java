package com.accp.dao.zkx;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ZkxAlipayService {
	String  aliPay(String order_number, String total_amount) throws IOException;
}
