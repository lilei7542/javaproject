import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;

public class httpget1 {
    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient(); //创建客户端
        String url ="http://news.163.com/16/0602/10/BOI4LUB400014PRF.html";
        GetMethod getMethod = new GetMethod(url);
        try {
            int statusCode = httpClient.executeMethod(getMethod);
            if (statusCode != HttpStatus.SC_OK) {  //执行成功的标示状态
                System.err.println("Method failed: "
                        + getMethod.getStatusLine());
            }
            // 读取内容
            byte[] responseBody = getMethod.getResponseBody();
            // String res = getMethod.getResponseBodyAsString();
	          /*
                    //Post
                    PostMethod postMethod = new PostMethod(url);
	           httpClient.executeMethod(postMethod);
	           System.out.println(postMethod.getResponseBodyAsString());*/

            String html = new String(responseBody);
            System.out.println(html);
        } catch (Exception e) {
            System.err.println("页面无法访问");
        }finally{  //无论成功与否都要释放连接
            getMethod.releaseConnection();
        }

    }

}
