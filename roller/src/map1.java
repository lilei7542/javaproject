import java.util.*;

public class map1 {

    static int h1 = 0;

    public static void main(String [] args) {
        time();
    }

    public static void time(){

        int size =10;
        String [] key = new String[ size ];

        Map<String , String > m1 = new HashMap<String, String>();
        long r1 = System.currentTimeMillis();
        for (int i=0;i<size;i++){
            key[i]= (new Random()).toString();
            m1.put(key[i],String.valueOf(i));
        }
        long r2 = System.currentTimeMillis();
        h1 += (r2-r1);
        System.out.println(h1);

        for (String t1 : m1.keySet()) {
            System.out.println(t1 + " ：" + m1.get(t1));
        }

        System.out.println(m1.keySet());

    }
}
