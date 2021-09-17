<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<%!
String makeItLower(String data){
	return data.toLowerCase();
}

%>
Lower case "Hello World" :<%= makeItLower("Hello World")%>

</body>
</html>