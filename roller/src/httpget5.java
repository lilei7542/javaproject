import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

import java.io.FileOutputStream;
import java.io.InputStream;

public class httpget5 {
    public static void main(String [] args) throws Exception{
        getfind();
    }

    public static void getfind() throws Exception{
        String url = "http://startupboard.sudoboot.com/contacts?page=";
        FileOutputStream fileOutputStream = new FileOutputStream("/mtmp/demo1.txt");
        HttpClient httpClient = new HttpClient();
        for(int i=1;i<75;i++){
            String URL = url + String.valueOf(i);
            GetMethod getMethod = new GetMethod(URL);
            httpClient.executeMethod(getMethod);

    //        String r1 = getMethod.getResponseBodyAsString();
    //        System.out.println(r1);
    //        File file = new File("/mtmp/demo2.txt");

            InputStream r1 = getMethod.getResponseBodyAsStream();

            byte[] b = new byte[1024];
            int len =1;
            while ((len= r1.read(b))!=-1){
                fileOutputStream.write(b,0,len);
            }

        }

        fileOutputStream.close();

    }

}
