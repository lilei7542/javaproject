<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.mysql.cj.jdbc.Driver" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.Random" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>

<%out.print("start");%>
<%out.print("<br>");%>

<%
class lottery {
    public  int getgroup(){
        int b1[] = {1,20,35,66,207123};
        int b2 = (b1.length);
        Random b3 = new Random();
        int b4 = b3.nextInt(b2);
//        System.out.print(b1[b4]);
        return b1[b4];
    }
}
%>

<%
lottery t =new lottery();
int z1 = t.getgroup();
%>

<%=z1%>

</body>
</html>