import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import java.util.ArrayList;
import java.util.List;

public class httpget3 {
    public static void main(String [] args) throws Exception{
//        httpget2.zoomquery("q");
        zoomquerypro("port:445",2);

    }
    public static void zoomquerypro (String query,int p) throws Exception{

        HttpClient httpClient = new HttpClient();
        String r = "a";

        for(int i=1;i < p+1;i++) {

            String queryUrl = "https://www.zoomeye.org/search?q=" + query + "&p=" + p;
            GetMethod getMethod = new GetMethod(queryUrl);
            getMethod.setRequestHeader("User-Agent","Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36");
            httpClient.executeMethod(getMethod);
            String r1 = getMethod.getResponseBodyAsString();
            r= r + r1;
            Thread.sleep(2000);

        }

//        System.out.print(r);

        JSONObject r2 = JSONObject.fromObject(r);
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
