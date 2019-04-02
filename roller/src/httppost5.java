import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URLDecoder;

public class httppost5 {
    public static String PostMethodTest() throws Exception{
        System.out.println("开始");
        String URI = "http://api.map.baidu.com/telematics/v3/weather";

        HttpClient client = new HttpClient();
        PostMethod method = new PostMethod(URI);
        try{

            method.addRequestHeader(new Header("Content-Type", "application/json;charset=utf-8") );

            //          method.addRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");

            method.addParameter(new NameValuePair("location", "西安"));
            method.addParameter(new NameValuePair("output", "json"));
            method.addParameter(new NameValuePair("ak", "YGtqUyHOKe5xtaDzi2pmMZVEMdDNlG8F"));

            int result = client.executeMethod(method);
            if (result == HttpStatus.SC_OK) {
                InputStream in = method.getResponseBodyAsStream();
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len = 0;
                while ((len = in.read(buffer)) != -1) {
                    baos.write(buffer, 0, len);
                }
                return URLDecoder.decode(baos.toString(), "UTF-8");
            } else {
                throw new Exception("HTTP ERROR Status: " + method.getStatusCode() + ":" + method.getStatusText());
            }
        }finally {
            method.releaseConnection();
        }

    }

    public static void main (String [] args) throws Exception{
        PostMethodTest();
    }

}
