<%-- 
    Document   : welcomeResponse
    Created on : Jan 27, 2016, 4:47:39 PM
    Author     : mcendrowski
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Server Response</h1>
        <p><h1><b>
            <%
                Object responseObj = request.getAttribute("myMsg");
                Object errObj = request.getAttribute("errorMsg");
                
                if(responseObj !=null){
                    out.println(responseObj.toString());
                }
                if(errObj !=null){
                    out.println(errObj.toString());
                }
                %>
                <b></h1></p>
    </body>
</html>
