<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<h3> JSP Built-In objects</h3>
Request user agent:<%=request.getHeader("user.Agent") %>
<br/><br/>
Request language:<%= request.getLocale() %>
</body>
</html>