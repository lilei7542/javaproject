<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title> User Login </title>
    <style type="text/css">
        *{
            margin: 0;
            padding: 0;
            #background-color: #EAEAEA;
            #background-color: rgb(246,246,246);
            #background-image: url('p3.jpg');
        }
        div{
            width: 230px;
            height: 100px;
            #background-color: #1E90FF;
            #background-image: url('p3.jpg');
        }
        .center-in-center{
            position: absolute;
            top: 20%;
            left: 41%;
        }
        .title{
            position: absolute;
            top: 12%;
            left: 41%;
            font-size:10px;
        }
        .copyright{
            font-size: 3px;
            position: absolute;
            top: 95%;
            left: 39%;
        }
        .login{
            position: absolute;
            top: 65%;
            left:8%;
        }
        .register{
            position: absolute;
            top: 65%;
            left: 72%;
        }
    </style>
</head>
<body>

<form action="new-dologin.jsp" method="get" >

<!--设置图片背景填充-->
<div style="position:fixed; z-index: -1; width: 100%; height: 100%; left: 0px; top:0px;">
    <img src="p6.jpeg" width="100%" height="100%" />
</div>

<div class="title">
    <h1 align="center">Say Hi !</h1>
</div>
<div class="center-in-center">
<table style="margin: 0px auto">
    <tr>
        <td>Username：</td>
        <td><input type="text" name="username" style="border-color:lightgrey;background-color:transparent" /></td>
        <!--设置输入框透明-->
    </tr>
    <tr>
        <td>Password：</td>
        <td><input type="password" name="password" style="border-color:lightgrey;background-color:transparent" /></td>
    </tr>

    <input class="login" type="submit" value="&nbsp&nbsp&nbsp Login&nbsp&nbsp&nbsp" />
    <input class="register" type="button" value="Register" />
    <!--<input type="reset" value="Reset">-->
</table>
</div>

</body>
<p class="copyright">Copyright ©2019 LILEI Persional, All Rights Reserved</p>

</html>