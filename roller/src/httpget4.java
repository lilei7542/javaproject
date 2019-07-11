import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.*;

public class httpget4 {
    public static void main(String [] args) throws Exception{
        getfind();
    }

    public static void getfind() throws Exception{
        String url = "http://startupboard.sudoboot.com/contacts?page=2";
        HttpClient httpClient = new HttpClient();
        GetMethod getMethod = new GetMethod(url);
        httpClient.executeMethod(getMethod);

//        String r1 = getMethod.getResponseBodyAsString();
//        System.out.println(r1);
//        File file = new File("/mtmp/demo2.txt");

        InputStream r1 = getMethod.getResponseBodyAsStream();
        FileOutputStream fileOutputStream = new FileOutputStream("/mtmp/demo1.txt");

        byte[] b = new byte[1024];
        int len =1;
        while ((len= r1.read(b))!=-1){
            fileOutputStream.write(b,0,len);
        }

        fileOutputStream.close();

    }

}
