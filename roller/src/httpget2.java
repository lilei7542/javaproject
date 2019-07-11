import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;


public class httpget2 {
    public static void main(String [] args) throws Exception{
        zoomquery("port:445");


    }
    public static void zoomquery (String query) throws Exception{
        String queryUrl = "https://www.zoomeye.org/search?q=" + query;
        HttpClient httpClient = new HttpClient();
        GetMethod getMethod = new GetMethod(queryUrl);
        httpClient.executeMethod(getMethod);
        String r1 = getMethod.getResponseBodyAsString();
        JSONObject r2 = JSONObject.fromObject(r1);
        JSONArray a1 = JSONArray.fromObject(r2.get("matches"));
        List<String> l1 = new ArrayList();

        for (int i=0;i<a1.size();i++){
            JSONObject r3 = a1.getJSONObject(i);
            String s1 = r3.get("ip").toString();
            l1.add(s1);

        }
        System.out.println(l1);

    }
}
