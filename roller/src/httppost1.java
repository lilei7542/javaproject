import net.sf.json.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class httppost1 {
    public static void main(String [] args ){
/*        JSONObject demo2 = new JSONObject();
        demo2.put("location","西安");
        demo2.put("output","json");
        demo2.put("ak","YGtqUyHOKe5xtaDzi2pmMZVEMdDNlG8F");
        String demo1 =demo2.toString();*/

//        String demo1 = "{\"location\":\"西安\"，\"output\":\"json\",\"ak\":,\"YGtqUyHOKe5xtaDzi2pmMZVEMdDNlG8F\"}";
//        String demo1 = "location=西安&output=json&ak=YGtqUyHOKe5xtaDzi2pmMZVEMdDNlG8F";
        String a2 = "";

        try {
//            sendpost(demo1, "http://api.map.baidu.com/telematics/v3/weather");
            sendpost(a2, "http://www.baidu.com");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

/*    public static byte [] readInputSteam (InputStream instream ) throws Exception{
        ByteArrayOutputStream outstream = new ByteArrayOutputStream();
        byte [] buffer = new byte[1024];
        int len = 0;
        while ((len = instream.read(buffer)) != -1){
            outstream.write(buffer,0,len);
        }
        byte [] data = outstream.toByteArray();
        outstream.close();
        instream.close();
//        System.out.print(data);
        return data;
    }*/

    public  static String istos (InputStream in ) throws IOException{
        StringBuffer out = new StringBuffer();
        byte[] b = new byte[65535];
        for (int n; (n=in.read(b)) != -1;){
            out.append(new String(b,0,n));
        }
//        System.out.println(out.toString());

        String a10 = out.toString();
        System.out.print(a10);
        return a10;
//        return out.toString();
    }


    public static String sendpost( String parms,String requesturl ) throws IOException{
        byte [] requestbytes = parms.getBytes();
        HttpClient httpclient = new HttpClient();
        PostMethod postmethod = new PostMethod(requesturl);
        postmethod.setRequestHeader("Content-Type","application/json;charset=UTF-8");
        InputStream inputstream = new ByteArrayInputStream(requestbytes,0,requestbytes.length);
        RequestEntity requestentity = new InputStreamRequestEntity(inputstream,requestbytes.length,"application/json;charset=utf-8");
//        RequestEntity requestentity = new InputStreamRequestEntity(inputstream,requestbytes.length);
        postmethod.setRequestEntity(requestentity);
        httpclient.executeMethod(postmethod);
        InputStream soapresponsestream = postmethod.getResponseBodyAsStream();
//        byte[] a50 = postmethod.getResponseBody();
//        String a60 = new String(a50);
//        System.out.println(a60);

        try{
//            byte [] datas = null;
//            datas = istos (soapresponsestream);
//            String result = new String(datas);
//            System.out.print(datas);
//            System.out.print(result);
            String a20 = istos(soapresponsestream);
            System.out.print(a20);


        } catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }

}
