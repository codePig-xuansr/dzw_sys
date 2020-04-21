package com.accp.util;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;

public class Alipay {
	public static void main(String[] args) {
		//实例化客户端
		AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do","2016102200736457","MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCEShNL+Kv0zkx1MFD6MPj5KyD3LMjjp1bPnKXf0OlEafn1TluJGjTXi/Y5fyro1x0iBBQzxs4x67oglX+5sx1npLcyMsrBWKDyGXkkwGN0IR5rzmshdqrhXUgG3E8085Gzhsh/AaLng2dAbeyiUEBe3urGF/SUwN0LLhE97UF8xTvs93mETYfcXuD8VAxXrqAT/ZtpcicOYIkFWhALm5p93ZXhtvz0AYuAyCJPoxEE+UK2cmolpm5dSnErT1/fa2JY0S85IXwItUEFAdJbvUQW2Tcdvv1DQA2pZD4O0kkmoYLFiIYWZQk5gTz3SF6R+zxxYFXEPqYgT1R4NfFsXlVrAgMBAAECggEAGXhRoszr/qRBoEZ/MMyBAyhEnpJm0z4CvtJANYl5gAyPbaV6hjkfd2ihLYzIbDAOkeALK7TZOk9SdLeT8eMEhFH4W5ff5b30rugspODNxSwjOUpy4eyBFgbpuThtn5pNsS0AKUPdY4mvNX50kwO0gQ+WUDGIi6Nea6qg8zVc6HKh2y+CR62h2Zaa4sp6iafWWsB4mkj0RchfBv0eVDK5yqC1itYLtOVoKNyarRY2mZ5Ak57eHhcrBgEm298lIXwo0weW5sMO3DvQCM0lx1evnfSBIeBdN2mwC9v+gkOrZjAujxbc5t5s+vTv6c8H7cxbGoKeFb5GoSQ7L8nQEOmmcQKBgQDKO9g+TjNzDg8+tBrKnuz9qiQGwsaSfVsuRdluN7CSzU8F5FJ5DZREjVGvI88tQCE7P+MUsJfxMg8IIAcP6Q8KA1wJy+ma2O0ioR3KxhqEWHqd2eaa5x1Yc8vj38/oJFYibPRiqCQX1Y9SySd17fvMnf2Q0+Ji3024WnARtBQC/wKBgQCndcVS1/cSq8+5ydbfCSwbr6AjBS7V4WQLbt+D0JHCzZmOLE7WDKC1Ekkigq9WE97Xlbv5SZz4/GcYHOSNyfF/6a1D+VTRlDIucjsi9smu87nLKr0DX7AhJzrlZd2fgBdsNZKOWzyasKMYv1WVPPeWUNCZWhi8L2Dgu0W8HoJplQKBgBBLAgEDC+IZH+FNYVsxsqY9Lunch2MF9nKj7gCTPAaXw+YVnw9hqLBdMleJ6wcaQ5MicokYMSWdgtiEvAzsGeoUmzWu2ANBttkzYdMUYs6G0lolVA7mz9Zwfdy+C2IIi2f6nzXTlhTVf9aLnkJCCidSEzu31mVg2EIiByVl/LbBAoGAFqOZVaXUxTVtE9Txs51t1SBdKd7dghTCjbkjhpJ/4jIhfFMJJW73mwMp1/yK77wn+EVJ8F2/Vvnohh4B2BlhCMXyoqnmiZ7bWeQfko6CnaBdkdXpT7dz/Edtcu3elF2gzQRBF/XFr7QJmKLlUxO29R9f1BuWFHrjQf6PYutM/jECgYEAky2CKxA0YNhC8UprE1r2b/+srEAFwXMjSmKQThVotAuw7RYPidT0NRa0QnR8OVbvxD4kM3YJ/xCxgtd29KVnerv4PNVOSrQGTI4U6KJAz+1o5ycyr2d7xl6BW2PKnKMx+Ha9DX0kPV51qQf3Pvpwv2Hlth4ZX8ikya2fODYDXq4=","json","utf-8","MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEApLbG0ZhbjT6a+5Di+/NDM/QRJJJ8HIF6n+ZWAWdFGcNUuo9xJ4o+kFTMtbNeEy9N90xPOT372V6aEuotVRrltoLmYgV9Jzruijcemk3igor21MMp4A2Bl/pnIMgJAvX+WNPRPli96jkecUSe56w/v2LxWu9C3e30Y8UoXL4P8M+5tGT2ZnXcjMJZZHaVLLwZeON0ilgai/Jo5pEU07NGjWSvSIep6f1xzsGFPOJLZaCp0sly4xrlsBMHTH9gTdqdqZkCehrwzO8pwSkIG2RjxarX+9VXwnUPBEIA4/ABKXlBfseOcNDhA46cxeaYiPI25lI5/bD2KcgJylxtWH6+SQIDAQAB","RSA2");
		//实例化具体API对应的request类,类名称和接口名称对应,当前调用接口名称：alipay.trade.app.pay
		AlipayTradeAppPayRequest request = new AlipayTradeAppPayRequest();
		//SDK已经封装掉了公共参数，这里只需要传入业务参数。以下方法为sdk的model入参方式(model和biz_content同时存在的情况下取biz_content)。
		AlipayTradeAppPayModel model = new AlipayTradeAppPayModel();
		model.setBody("我是测试数据");
		model.setSubject("App支付测试Java");
		model.setOutTradeNo("123");
		model.setTimeoutExpress("30m");
		model.setTotalAmount("0.01");
		model.setProductCode("QUICK_MSECURITY_PAY");
		request.setBizModel(model);
		request.setNotifyUrl("商户外网可以访问的异步地址");
		try {
		        //这里和普通的接口调用不同，使用的是sdkExecute
		        AlipayTradeAppPayResponse response = alipayClient.sdkExecute(request);
		        System.out.println(response.getBody());//就是orderString 可以直接给客户端请求，无需再做处理。
		    } catch (AlipayApiException e) {
		        e.printStackTrace();
		}
	}
	
	
}
