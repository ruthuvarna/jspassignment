<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*,java.util.Locale" %>
<%@ page import="javax.servlet.*,javax.servlet.http.* "%>
<%@ page import="java.text.NumberFormat,java.util.Date" %>
<%@ page import="java.text.DateFormat,java.util.Date" %>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
   Locale locale = request.getLocale();
   String language = locale.getLanguage();
   String country = locale.getCountry();

   String title = "Locale Specific Dates";

   String date = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT, locale).format(new Date( ));
  
   NumberFormat nft = NumberFormat.getCurrencyInstance(locale);
   String formattedCurr = nft.format(500);
%>
<html>
    <head>
        <title>Detecting Locale</title>
    </head>
    <body>
        <form>
            <fieldset style="width:20%; background-color:#e6ffe6;">
                <center>
                    <h1>Detecting Locale</h1>
                </center>
                <p align="center">
                <%
                    out.println("Language : " + language  + "<br />");
                    out.println("Country  : " + country   + "<br />");
                %>
                </p>
                <div align="center">
                    <h1><% out.print(title); %></h1>
                    <p>Local Date: <%  out.print(date); %></p>
                    <p>Formatted Currency: <%  out.print(formattedCurr); %></p>
                </div>
            </fieldset>
        </form>
</body>
</html>