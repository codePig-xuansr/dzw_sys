package com.accp.cfg;

public class AlipayConfig {
	 // 作为身份标识的应用ID
    public static String app_id = "2016102200736457";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key  ="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCEShNL+Kv0zkx1MFD6MPj5KyD3LMjjp1bPnKXf0OlEafn1TluJGjTXi/Y5fyro1x0iBBQzxs4x67oglX+5sx1npLcyMsrBWKDyGXkkwGN0IR5rzmshdqrhXUgG3E8085Gzhsh/AaLng2dAbeyiUEBe3urGF/SUwN0LLhE97UF8xTvs93mETYfcXuD8VAxXrqAT/ZtpcicOYIkFWhALm5p93ZXhtvz0AYuAyCJPoxEE+UK2cmolpm5dSnErT1/fa2JY0S85IXwItUEFAdJbvUQW2Tcdvv1DQA2pZD4O0kkmoYLFiIYWZQk5gTz3SF6R+zxxYFXEPqYgT1R4NfFsXlVrAgMBAAECggEAGXhRoszr/qRBoEZ/MMyBAyhEnpJm0z4CvtJANYl5gAyPbaV6hjkfd2ihLYzIbDAOkeALK7TZOk9SdLeT8eMEhFH4W5ff5b30rugspODNxSwjOUpy4eyBFgbpuThtn5pNsS0AKUPdY4mvNX50kwO0gQ+WUDGIi6Nea6qg8zVc6HKh2y+CR62h2Zaa4sp6iafWWsB4mkj0RchfBv0eVDK5yqC1itYLtOVoKNyarRY2mZ5Ak57eHhcrBgEm298lIXwo0weW5sMO3DvQCM0lx1evnfSBIeBdN2mwC9v+gkOrZjAujxbc5t5s+vTv6c8H7cxbGoKeFb5GoSQ7L8nQEOmmcQKBgQDKO9g+TjNzDg8+tBrKnuz9qiQGwsaSfVsuRdluN7CSzU8F5FJ5DZREjVGvI88tQCE7P+MUsJfxMg8IIAcP6Q8KA1wJy+ma2O0ioR3KxhqEWHqd2eaa5x1Yc8vj38/oJFYibPRiqCQX1Y9SySd17fvMnf2Q0+Ji3024WnARtBQC/wKBgQCndcVS1/cSq8+5ydbfCSwbr6AjBS7V4WQLbt+D0JHCzZmOLE7WDKC1Ekkigq9WE97Xlbv5SZz4/GcYHOSNyfF/6a1D+VTRlDIucjsi9smu87nLKr0DX7AhJzrlZd2fgBdsNZKOWzyasKMYv1WVPPeWUNCZWhi8L2Dgu0W8HoJplQKBgBBLAgEDC+IZH+FNYVsxsqY9Lunch2MF9nKj7gCTPAaXw+YVnw9hqLBdMleJ6wcaQ5MicokYMSWdgtiEvAzsGeoUmzWu2ANBttkzYdMUYs6G0lolVA7mz9Zwfdy+C2IIi2f6nzXTlhTVf9aLnkJCCidSEzu31mVg2EIiByVl/LbBAoGAFqOZVaXUxTVtE9Txs51t1SBdKd7dghTCjbkjhpJ/4jIhfFMJJW73mwMp1/yK77wn+EVJ8F2/Vvnohh4B2BlhCMXyoqnmiZ7bWeQfko6CnaBdkdXpT7dz/Edtcu3elF2gzQRBF/XFr7QJmKLlUxO29R9f1BuWFHrjQf6PYutM/jECgYEAky2CKxA0YNhC8UprE1r2b/+srEAFwXMjSmKQThVotAuw7RYPidT0NRa0QnR8OVbvxD4kM3YJ/xCxgtd29KVnerv4PNVOSrQGTI4U6KJAz+1o5ycyr2d7xl6BW2PKnKMx+Ha9DX0kPV51qQf3Pvpwv2Hlth4ZX8ikya2fODYDXq4=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key ="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAqWT0EsmZyIznGkek/wh+Dyo0D9RFbEXEvwEmasKUGrlChPJFIfVbXPq9T9qkARN9CEu4k8IdLgblNUlyFKTRphTGR1hUWb6EsHCWtVATRwB1kWHGkYnHXd1bTHs2NwkGTR4yEAjuMdoBs93U6K2kUBTpP7TktNSICYJpZYQN6JkP+V2XqYBeGWEmVpAhg2270Bu4o6fYRUZhrUIb+AmsZdHII0QMHNcYBjX+EdsHZX5q5p0RsB8fUdh1uJi14K0AvdeOR9myAWA1uNJbpXr708OzmaJ28h7WJ5p9nyGG53NxWHshLHOKwFwzwmij4+vjgIF8Xwm6/FdWlolKmITT3QIDAQAB";
    		// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://127.0.0.1:8020/index.html";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://127.0.0.1:8020/index.html";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
}
/**java
<a name="K2alt"></a>
### 三.开发Controller及接口调用代码

1. 使用Restful定义调用接口，通过postman或浏览器输入[http://localhost:8080/payment/pay](http://localhost:8080/payment/pay)直接调用支付接口
```java
*/
