package com.accp.biz.zkx;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.accp.cfg.AlipayConfig;
import com.accp.dao.zkx.ZkxAlipayService;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;

public class ZkxAlipayServiceImpl implements ZkxAlipayService {

	@Override
	public String aliPay(String order_number, String total_amount)
			throws IOException {
		// response.setContentType("text/html;charset=utf-8");

		// PrintWriter out = response.getWriter();
		// 获得初始化的AlipayClient
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
				AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key,
				AlipayConfig.sign_type);
		// 设置请求参数
		AlipayTradePagePayRequest aliPayRequest = new AlipayTradePagePayRequest();
		aliPayRequest.setReturnUrl(AlipayConfig.return_url);
		aliPayRequest.setNotifyUrl(AlipayConfig.notify_url);

		// 商户订单号，后台可以写一个工具类生成一个订单号，必填//StringUtils.getStr()

		//String order_number = "";
		// 付款金额，从前台获取，必填
		//String total_amount = "";

		String subject = "德召文汽修系统订单结算";

		// 订单名称，必填

		aliPayRequest.setBizContent("{\"out_trade_no\":\"" + order_number + "\"," + "\"total_amount\":\"" + total_amount
				+ "\"," + "\"subject\":\"" + subject + "\"," + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		// 请求
		String result = null;
		try {
			result = alipayClient.pageExecute(aliPayRequest).getBody();
		} catch (AlipayApiException e) {
			e.printStackTrace();
		}
		// out.print("shab");
		// 输出
		// System.out.println(result);
		// out.println(result);
		return result;
		// log.info("返回结果={}",result);
	}

}
