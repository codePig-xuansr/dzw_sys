package com.accp.action.zkx;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.sw.JsrecordBiz;
import com.accp.biz.sw.VipBiz;
import com.accp.biz.sw.WeixiuBiz;
import com.accp.pojo.sw.Jsrecord;
import com.accp.pojo.sw.Vipcard;
import com.accp.pojo.sw.Weixiurecord;
import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;

@RestController
@RequestMapping("/zkx/Pay")
public class PayController {
	
	@Autowired
	private WeixiuBiz wxbiz;
	@Autowired
	private VipBiz vipbiz;
	@Autowired
	private JsrecordBiz jsbiz;
	
	private final String APP_ID = "2016102200736457";
	private final String APP_PRIVATE_KEY = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCEShNL+Kv0zkx1MFD6MPj5KyD3LMjjp1bPnKXf0OlEafn1TluJGjTXi/Y5fyro1x0iBBQzxs4x67oglX+5sx1npLcyMsrBWKDyGXkkwGN0IR5rzmshdqrhXUgG3E8085Gzhsh/AaLng2dAbeyiUEBe3urGF/SUwN0LLhE97UF8xTvs93mETYfcXuD8VAxXrqAT/ZtpcicOYIkFWhALm5p93ZXhtvz0AYuAyCJPoxEE+UK2cmolpm5dSnErT1/fa2JY0S85IXwItUEFAdJbvUQW2Tcdvv1DQA2pZD4O0kkmoYLFiIYWZQk5gTz3SF6R+zxxYFXEPqYgT1R4NfFsXlVrAgMBAAECggEAGXhRoszr/qRBoEZ/MMyBAyhEnpJm0z4CvtJANYl5gAyPbaV6hjkfd2ihLYzIbDAOkeALK7TZOk9SdLeT8eMEhFH4W5ff5b30rugspODNxSwjOUpy4eyBFgbpuThtn5pNsS0AKUPdY4mvNX50kwO0gQ+WUDGIi6Nea6qg8zVc6HKh2y+CR62h2Zaa4sp6iafWWsB4mkj0RchfBv0eVDK5yqC1itYLtOVoKNyarRY2mZ5Ak57eHhcrBgEm298lIXwo0weW5sMO3DvQCM0lx1evnfSBIeBdN2mwC9v+gkOrZjAujxbc5t5s+vTv6c8H7cxbGoKeFb5GoSQ7L8nQEOmmcQKBgQDKO9g+TjNzDg8+tBrKnuz9qiQGwsaSfVsuRdluN7CSzU8F5FJ5DZREjVGvI88tQCE7P+MUsJfxMg8IIAcP6Q8KA1wJy+ma2O0ioR3KxhqEWHqd2eaa5x1Yc8vj38/oJFYibPRiqCQX1Y9SySd17fvMnf2Q0+Ji3024WnARtBQC/wKBgQCndcVS1/cSq8+5ydbfCSwbr6AjBS7V4WQLbt+D0JHCzZmOLE7WDKC1Ekkigq9WE97Xlbv5SZz4/GcYHOSNyfF/6a1D+VTRlDIucjsi9smu87nLKr0DX7AhJzrlZd2fgBdsNZKOWzyasKMYv1WVPPeWUNCZWhi8L2Dgu0W8HoJplQKBgBBLAgEDC+IZH+FNYVsxsqY9Lunch2MF9nKj7gCTPAaXw+YVnw9hqLBdMleJ6wcaQ5MicokYMSWdgtiEvAzsGeoUmzWu2ANBttkzYdMUYs6G0lolVA7mz9Zwfdy+C2IIi2f6nzXTlhTVf9aLnkJCCidSEzu31mVg2EIiByVl/LbBAoGAFqOZVaXUxTVtE9Txs51t1SBdKd7dghTCjbkjhpJ/4jIhfFMJJW73mwMp1/yK77wn+EVJ8F2/Vvnohh4B2BlhCMXyoqnmiZ7bWeQfko6CnaBdkdXpT7dz/Edtcu3elF2gzQRBF/XFr7QJmKLlUxO29R9f1BuWFHrjQf6PYutM/jECgYEAky2CKxA0YNhC8UprE1r2b/+srEAFwXMjSmKQThVotAuw7RYPidT0NRa0QnR8OVbvxD4kM3YJ/xCxgtd29KVnerv4PNVOSrQGTI4U6KJAz+1o5ycyr2d7xl6BW2PKnKMx+Ha9DX0kPV51qQf3Pvpwv2Hlth4ZX8ikya2fODYDXq4=";
	private final String CHARSET = "UTF-8";
	private final String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqWT0EsmZyIznGkek/wh+Dyo0D9RFbEXEvwEmasKUGrlChPJFIfVbXPq9T9qkARN9CEu4k8IdLgblNUlyFKTRphTGR1hUWb6EsHCWtVATRwB1kWHGkYnHXd1bTHs2NwkGTR4yEAjuMdoBs93U6K2kUBTpP7TktNSICYJpZYQN6JkP+V2XqYBeGWEmVpAhg2270Bu4o6fYRUZhrUIb+AmsZdHII0QMHNcYBjX+EdsHZX5q5p0RsB8fUdh1uJi14K0AvdeOR9myAWA1uNJbpXr708OzmaJ28h7WJ5p9nyGG53NxWHshLHOKwFwzwmij4+vjgIF8Xwm6/FdWlolKmITT3QIDAQABB";
	// 这是沙箱接口路径,正式路径为https://openapi.alipay.com/gateway.do
	private final String GATEWAY_URL = "https://openapi.alipaydev.com/gateway.do";
	private final String FORMAT = "JSON";
	// 签名方式
	private final String SIGN_TYPE = "RSA2";
	// 支付宝异步通知路径,付款完毕后会异步调用本项目的方法,必须为公网地址
	private final String NOTIFY_URL = "http://127.0.0.1:8020/dzw_ui/index.html";
	// 支付宝同步通知路径,也就是当付款完毕后跳转本项目的页面,可以不是公网地址
	private final String RETURN_URL = "http://127.0.0.1:8080/zkx/Pay/returnUrl";
	
	private String wxrecordid;
	private Float jsmoney;
//	@Resource
//	private UsersService usersService;

	@GetMapping("alipay/{money}/{id}")
	public void alipay(HttpServletResponse httpResponse, @PathVariable Float money, @PathVariable String id) throws IOException {
		// Random r = new Random();
		// 实例化客户端,填入所需参数
		AlipayClient alipayClient = new DefaultAlipayClient(GATEWAY_URL, APP_ID, APP_PRIVATE_KEY, FORMAT, CHARSET,
				ALIPAY_PUBLIC_KEY, SIGN_TYPE);
		AlipayTradePagePayRequest request = new AlipayTradePagePayRequest();
		// 设置请求参数

		// 在公共参数中设置回跳和通知地址
		request.setReturnUrl(RETURN_URL);
		request.setNotifyUrl(NOTIFY_URL);

		// 商户订单号，商户网站订单系统中唯一订单号，必填
		// 生成随机Id
		String out_trade_no = UUID.randomUUID().toString() + id.toString();
		// 付款金额，必填
		String total_amount = money.toString();
		String title = "德召文汽修结算订单支付宝支付:" + total_amount;
		wxrecordid=id;
		jsmoney=money;
		
		// 订单名称，必填
		String subject = title;
		// 商品描述，可空
		String body = title;
		request.setBizContent("{\"out_trade_no\":\"" + out_trade_no + "\"," + "\"total_amount\":\"" + total_amount
				+ "\"," + "\"subject\":\"" + subject + "\"," + "\"body\":\"" + body + "\","
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		String form = "";
		try {
			// System.err.println(alipayClient.pageExecute(request).getBody());
			form = alipayClient.pageExecute(request).getBody(); // 调用SDK生成表单
		} catch (AlipayApiException e) {
			e.printStackTrace();
		}

		httpResponse.setContentType("text/html;charset=" + CHARSET);
		httpResponse.getWriter().write(form);// 直接将完整的表单html输出到页面
		httpResponse.getWriter().flush();
		httpResponse.getWriter().close();
	}

	@RequestMapping(value = "/returnUrl", method = RequestMethod.GET)
	public void returnUrl(HttpSession session, HttpServletRequest request, HttpServletResponse response)
			throws IOException, AlipayApiException {
		System.out.println("=================================同步回调=====================================");

		// 获取支付宝GET过来反馈信息
		Map<String, String> params = new HashMap<String, String>();
		Map<String, String[]> requestParams = request.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
			}
			// 乱码解决，这段代码在出现乱码时使用
			valueStr = new String(valueStr.getBytes("utf-8"), "utf-8");
			params.put(name, valueStr);
		}

		System.out.println(params);// 查看参数都有哪些
		boolean signVerified = AlipaySignature.rsaCheckV1(params, ALIPAY_PUBLIC_KEY, CHARSET, SIGN_TYPE); // 调用SDK验证签名
		// 验证签名通过

		// 商户订单号
		String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "UTF-8");

		// 支付宝交易号
		String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "UTF-8");

		// 付款金额
		String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "UTF-8");

		System.out.println("商户订单号=" + out_trade_no);
		System.out.println("支付宝交易号=" + trade_no);
		System.out.println("付款金额=" + total_amount);

		// 支付成功，修改结算订单状态以及维修单的结算状态，修改会员积分信息
		if(wxbiz.modifyWxStatus(wxrecordid)>0) {
			System.out.println("维修单结算状态修改成功");
			//新增一条结算记录
			if(jsbiz.addJrecord(new Jsrecord(null, wxrecordid, 3, new Date(), this.jsmoney))>0) {
				System.out.println("结算记录添加成功");
			}
		}
		
		
		response.sendRedirect("http://127.0.0.1:8020/dzw_ui/index.html");// 跳转付款成功页面
	}

}
