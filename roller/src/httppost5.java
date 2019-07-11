import org.apache.commons.httpclient.Cookie;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.cookie.CookiePolicy;
import org.apache.commons.httpclient.methods.ByteArrayRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;

public class httppost5 {
    public static void main(String [] args ) throws Exception{
//        String demo2="location=西安&output=json&ak=YGtqUyHOKe5xtaDzi2pmMZVEMdDNlG8F";
//        String demo2="{\"location\":\"西安\"，\"output\":\"json\",\"ak\":,\"YGtqUyHOKe5xtaDzi2pmMZVEMdDNlG8F\"}";
//        post("http://api.map.baidu.com/telematics/v3/weather",demo2);
        post("http://www.baidu.com","");
    }
    public  static String post (String url,String params) throws Exception{
        try {
            HttpClient httpClient = new HttpClient();

            PostMethod method = new PostMethod(url);
            RequestEntity requestEntity = new ByteArrayRequestEntity(params.getBytes("UTF-8"));
            method.setRequestEntity(requestEntity);

            httpClient.getParams().setCookiePolicy(CookiePolicy.BROWSER_COMPATIBILITY);
//            httpClient.getParams().setCookiePolicy(CookiePolicy.DEFAULT);
            Cookie[] cookies = httpClient.getState().getCookies();
            StringBuffer tmpcookies = new StringBuffer();
            for (Cookie c : cookies) {
                tmpcookies.append(c.toString() + ";");
            }
            method.setRequestHeader("cookie",tmpcookies.toString());


            httpClient.executeMethod(method);
            String body = method.getResponseBodyAsString();
            System.out.println(body);

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
