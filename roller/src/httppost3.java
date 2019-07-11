import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;

public class httppost3 {
    public static void main (String [] args ) throws Exception {
//        String url="http://api.map.baidu.com/telematics/v3/weather";
        String url="http://www.baidu.com";
//        String requestStr="{\"location\":\"西安\"，\"output\":\"json\",\"ak\":,\"YGtqUyHOKe5xtaDzi2pmMZVEMdDNlG8F\"}";
//        String requestStr="location=西安&output=json&ak=YGtqUyHOKe5xtaDzi2pmMZVEMdDNlG8F";
        String requestStr="";
        RequestEntity entity = new StringRequestEntity(requestStr,"application/json","UTF-8");
        PostMethod method = new PostMethod(url);
        method.setRequestEntity(entity);
//        method.setRequestHeader("Content-Type","application/json;charset=UTF-8");
//        new HttpClient().executeMethod(method);
        HttpClient h1 = new HttpClient();
        int a10 = h1.executeMethod(method);
        System.out.println(a10);
        System.out.println(h1.getParams());
        String str=method.getResponseBodyAsString();
        System.out.println(str);

    }
}
