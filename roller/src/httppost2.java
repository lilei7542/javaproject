import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class httppost2 {

    public static String post(String url, Map< String, String > paramsMap) {
        CloseableHttpClient client = HttpClients.createDefault();
        String responseText = "";
        CloseableHttpResponse response = null;
        try {
            HttpPost method = new HttpPost(url);
            if (paramsMap != null) {
                List<NameValuePair> paramList = new ArrayList<NameValuePair>();
                for (Map.Entry<String, String> param : paramsMap.entrySet()) {
                    NameValuePair pair = new BasicNameValuePair(param.getKey(), param.getValue());
                    paramList.add(pair);
                }
                method.setEntity(new UrlEncodedFormEntity(paramList, "UTF-8"));
            }
            response = client.execute(method);
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                responseText = EntityUtils.toString(entity, "UTF-8");

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                response.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
//        System.out.print(responseText);
        return responseText;
    }

    public static void main (String [] args){

        Map < String, String > params = new HashMap< String, String >();
        params.put("location","西安");
        params.put("output","json");
        params.put("ak","YGtqUyHOKe5xtaDzi2pmMZVEMdDNlG8F");
//        JSONObject jsonObject = JSONObject.parseObject(post("http://api.map.baidu.com/telematics/v3/weather?", params));  //转json对象
        String a1 = post("http://api.map.baidu.com/telematics/v3/weather?", params);  //转json对象
        JSONObject a2 = JSONObject.fromObject(a1);
        System.out.print(a2);
    }

}
