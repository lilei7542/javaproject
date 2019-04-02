<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title> User Login </title>
    <style type="text/css">
        .copyright{
            font-size: 3px;
            position: absolute;
            top: 95%;
            left: 39%;s
        }
        .company{
            font-size: 43px;
            font-weight: 800;
            color:black;
            position: absolute;
            top: 5%;
            left: 22%;
        }
        .button{
            font-size: 53px;
            position: absolute;
            top: 40%;
            left:45%;
            border-radius: 15px;
        }
    </style>
</head>
<body>

<p class="company">ROCK & ROLL 2019 Annual Meeting</p>

<!--设置图片背景填充-->
<div style="position:fixed; z-index: -1; width: 100%; height: 100%; left: 0px; top:0px;">
    <img src="p7.jpeg" width="100%" height="100%" />
</div>
<div class="button">
    <button style="width: 160px; height: 40px; background: orangered;border-color: orangered;font-size: medium;border-radius: 15px " onclick="window.location.href='result.jsp'">开始抽奖</button>
</div>

</body>
<p class="copyright">Copyright ©2019 LILEI Persional, All Rights Reserved</p>

</html>