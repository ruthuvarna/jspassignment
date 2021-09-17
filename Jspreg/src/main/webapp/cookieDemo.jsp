<%@ page import="cookies.CookieUtils" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cookie Demo</title>
</head>
<body>

 <%
   CookieUtils.demoUserCookie(request,response, out);
 %>

 <a href ="">Try again!!</a>


</body>
</html>