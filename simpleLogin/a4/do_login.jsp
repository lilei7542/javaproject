<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Server Page Depend !</title>
</head>
<body>
<h3>Which Pae will be depend by the user's message!</h3>

<%
 String name=request.getParameter("name");//获取name的参数值
 String password=request.getParameter("password");//获取password的参数值
%>


<%
 Class.forName("com.mysql.jdbc.Driver");//加载mysql驱动
 Connection conn=DriverManager.getConnection("jdbc:mysql://10.211.55.4:3306/account", "root", "1");//localhost是本机地址，3306是端口号，最后是用户名和密码
 Statement stmt=conn.createStatement();//实例化Statement对象
 String queryNumberSQL="SELECT * from admin_table where username='"+name+"' and password='"+password+"'";
 ResultSet rs=stmt.executeQuery(queryNumberSQL);//执行数据库查询操作并获取结果集
 boolean flag=false;//初始化flag
 if(rs.next()){//判断结果
 flag=true;
 session.setAttribute("UserName", name);//将name的内容赋值给UserName
 }else{
 flag=false;
 }

%>
<%
 if(flag){
%>
<jsp:forward page="login_success.jsp"></jsp:forward>//跳转页面
<%
}else{

%>
<jsp:forward page="login_failed.jsp"></jsp:forward>//跳转页面
<%
 }
//关闭上面的几个对象，注意关闭顺序，最后使用的先关闭
 rs.close();
 stmt.close();
 conn.close();

%>

</body>
</html>
