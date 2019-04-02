<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.mysql.cj.jdbc.Driver" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.Random" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="java.lang.Integer" %>
<%@ page import="com.lilei.getallnumber" %>



<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <style type="text/css">
        *{
            #background-image: url("p7.jpeg");
        }
        .xu{
            font-size: 23px;
            position: absolute;
            top: 35%;
            left: 45%;
        }
        .num{
            font-size: 33px;
            position: absolute;
            top: 45%;
            left: 45%;
            width:130px; height:40px; solid #000; text-align:center;
        }
    </style>
</head>
<body>
<div style="position:fixed; z-index: -1; width: 100%; height: 100%; left: 0px; top:0px;">
    <img src="p8.jpeg" width="100%" height="100%" />

<div class="xu">
<%out.print("congratulate");%>
<%out.print("<br>");%>
<%out.print("&nbsp&nbsp&nbsp&nbsp特等奖  ");%>
<%out.print("<br>");%>
</div>
<%--
<%
    class getallnumber {
        public  int geta(){

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
    }
%>
--%>





<%
getallnumber m=new getallnumber();
int y1=m.geta();
%>

<div class="num">
<%=y1%>
</div>

</div>
</body>
</html>
