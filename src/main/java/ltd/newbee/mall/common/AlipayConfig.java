package ltd.newbee.mall.common;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {

//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016102300744208";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCH49llzskECH85haGLZ9o5Yjt/6lv6pGXzOnUOCEhyxXAorhQN2hIw9myK9sHCXXcCp1dpzwKY5lSFXBk5BiCX5FTnXNrSbqUIV8ttR70AhVmgXcl5g5Y+O2H+K9IKfpcd40G0Nf2PjVZK69AwNEs2fCR7NvXwDUuMPwGr0RT/DMXTzV1L24D/f+iFknUk/bVSjNY67kSVzCOfrHvKSeNEvm+Hy7gcddZdpm0AQeTb4xBaMf/eYChdE6oT0yK3PgoicpENwClK7K1UqbEHftUKv5eAPtK2Oe92IWn8+cEztbQFUD8PI2PPRL5kgRJAERrH6DyTmhlnapxqLPg3KiArAgMBAAECggEASySjwrhmT+Si9Zv/iKcU9UZswH9H/YGLHsTkla3e4hhrvRMF4+MCzDB4NR/eZSxp8v22SLxAI2y6sEQNbosE2vlYOdgO6O5mNAbYZsWUrgUPWq6CCr/JBQCxX2u76jG2PsC8RHrWi9sMLMHZjc5dCPP8+GWb+fJgJF1y/x/PDHmfKT/TyNpW74OHNdnRBo5n6CFAorB+1X1Hcop5kC4SM/GpD4XZWpHTM+LYrf/TaNmjpITikzk4j4X6arwolZP7mD2TjHMb5fwjEt1IdS2qDtn+4+GOzQdFyOyCKpeUmNnn8RPM1yfCNHmJ7nMPCdD6EnyEI1j0KtNLm7K75GDSAQKBgQDuVdyurvLoJWi7vYvCKyrxHPa6CfYMQEQfLY6HkKM3aLvhX78LO4ztt+PLO2u3jplmKp0sVB2ZT/hreKRgybl79cMpHd4em3NMWnfK9IpcTbtbyvXi8fALNoyl6erdlqRaIfbw5DGBqR1wgR3aY6gn8LHEUWh7QfNBXLA0NUUZuwKBgQCR9jSEga7X2ZCD+EfApjB5dEAJZsLcoQ8aX64zVJwkqwsNo7SuAX6ugz7Bv7DBh0pBMwZdmTV6TlTuA8vza5BqJX/3Llafs0Kcb2YJNQuIswqxCtdUB37EX8bez6B4WbdD4j+p3bd/Kpdvg1aTxZQ1nRJeQ5IWYKNjwz37yok0UQKBgQDUP+r0NiFk1EvdRgQ8uyzW5TBkpZJVfrYr/eo8mHaCVedb4mTEoBf1bBqVVymqonfCIJkwbQifDDTzoNDi0UM6Pbe72jmBkHaxvK+KMxU09pSwPqOTpFpd4gqHhzX+eLWM/0pnZREho3XwR0xKvQ135EarysP9YNI9l0nkdLxBGQKBgDTgmrn+ORcdTEti4KucCSeWw7QkNCe1eUE2tGcIGeD2zfRNACGhjQEvrsaF6UTS/EWOdJnn7QW35vCrE3HF3/V0TF2BvgPw7wq5GJ/xRZJqOk9U/BkG9heyEtuZICs5ZTkEd8fT+KvrBB1z2SODimO52XOoyv2sWMTFcGkNQJNhAoGBALSRQS39RXysB4n2xiTurjuDYaIvfX+SDRNWKqFafP7UF6KU8s4MOUrGMFyH9ITnhKAu6Mcb9YbwaYHVvdKoWWp2H159l6OvGPJUQV4Wu4so0VkznXFeUsMnhppMsLUdUS1VoeppY1P1sXZJHSVKL2lqMn7F1zMl3v3IR51YVukZ";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoA73jeTAjoJ6cb2HusK4gYyvMJHmYmFkjEXcZ5D1dFw8GujGOrQm14j/kkV5HbZlZF7FXerbAZSeQqFTGEv6OjJAS0MxdjZWmWkwsBdyXUAOfSX78mAnIoqPPOayH8lI+2Nqwc++CqRpKkMJSuGXluICzMP4qfOz2VCbd/S05LjYoUyVRL6vc2w32UtMbQgrf56O3DinVdbpXk5G80w0uND/9NCeAwruGgQ0ojPgXtBLByfkOrw9e9zlMqbVCebGUauLFQPNiJqgg3USBObn76agdeD7e5OlxzNGReRF7HgIpdhDQnIVgTXHuOdAUJPx3riTRG6oIlcnBki3tI/uXQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:28089/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:28089/paySuccess";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
