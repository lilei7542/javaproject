import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;



public class weather1 {
    public static void main(String [] args){
        getWeather("西安");
    }

    public static String getWeather(String cityName){

        StringBuffer strBuf = new StringBuffer();

        try{
            String url="http://api.map.baidu.com/telematics/v3/weather?location=" +cityName+ "&output=json&ak=YGtqUyHOKe5xtaDzi2pmMZVEMdDNlG8F";
            URL u = new URL(url);
            URLConnection c1 = u.openConnection();
            BufferedReader r1 = new BufferedReader(new InputStreamReader(c1.getInputStream()));
            String line = null;
            while ((line = r1.readLine()) != null)
                strBuf.append(line + " ");
            r1.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(strBuf.toString());
        return strBuf.toString();
    }


}
