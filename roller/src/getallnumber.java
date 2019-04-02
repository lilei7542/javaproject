package com.lilei;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.Integer;

//import com.mysql.jdbc.Driver;


public class getallnumber {
    public static int geta(){

        List<Integer> f1=new ArrayList<Integer>();
//        int f2 = (f1.size());
//        Random f3=new Random();
//        int f4=f3.nextInt(f2);

        try{
            Connection a1=DriverManager.getConnection("jdbc:mysql://10.211.55.4:3306/account", "root", "1");
            Statement b1=a1.createStatement();
            String c1="select number from employee";
            ResultSet d1=b1.executeQuery(c1);

            while(d1.next()){
                System.out.println("this is work");
                f1.add(d1.getInt(1));
            }
//            System.out.println(f1);
            int f2 = (f1.size());
            Random f3=new Random();
            int f4=f3.nextInt(f2);
//            System.out.println(f4);
//            System.out.println(f1.get(f4));
//            System.out.println((f1.get(f4)).getClass().getName());
//            System.out.println(f5.getClass().getName());
//            return (f1.get(f4));
            int f5=f1.get(f4);
//            System.out.print(f5);
            return f5;
        }
        catch (SQLException e1)    {
            e1.printStackTrace();
        }
        return 0;
    }

    public static void main(String [] args){
        geta();
    }
}
