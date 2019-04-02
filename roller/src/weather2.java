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
import net.sf.json.*;


public class weather2 {
    public static void main(String [] args){
        getWeather("西安");
    }

    public static String getWeather(String cityName){

        try{
        String url="http://api.map.baidu.com/telematics/v3/weather?location=" +cityName+ "&output=json&ak=YGtqUyHOKe5xtaDzi2pmMZVEMdDNlG8F";
        URL u = new URL(url);
        URLConnection c1 = u.openConnection();
        BufferedReader r1 = new BufferedReader(new InputStreamReader(c1.getInputStream(),"UTF-8"));
//            System.out.println(r1.readLine());

//            String t1 = "["+r1.readLine()+"]";
//            JSONArray j1 = JSONArray.fromObject(t1);            //jsonarray与jsonobject的区别

            String t1 = r1.readLine();
            JSONObject j1 = JSONObject.fromObject(t1);
            JSONArray j2 = JSONArray.fromObject(j1.get("results"));
            JSONObject j3 = j2.getJSONObject(0);

            Object j4 = j3.get("weather_data");
            JSONArray j5 = JSONArray.fromObject(j4);
            JSONObject j6 =j5.getJSONObject(1);

            Object r7 =j6.get("weather");
            Object r8 =j6.get("wind");
            Object r9 =j6.get("temperature");

            Object r2 = j3.get("currentCity");
            Object r3 = j1.get("date");

            System.out.println(r2);
            System.out.println(r3);
            System.out.println(r7);
            System.out.println(r8);
            System.out.println(r9);

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return cityName;
    }


}
