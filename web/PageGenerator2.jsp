<%-- 
    Document   : PageGenerator2
    Created on : Jan 27, 2016, 10:09:59 AM
    Author     : mcendrowski
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table, th, td {
                border: 1px solid blue;

            }
            th, td {
                padding: 5px;
            }
        </style>
    </head>
    <body>

        <table style="width:50%">
            <tr>
                <th>City</th>
                <th>Country</th>		
                <th>Continent</th>
            </tr>
            <tr>
                <td>Warsaw</td>
                <td>Poland</td>		
                <td>Europe</td>
            </tr>
            <tr>
                <td>New York</td>
                <td>United States</td>		
                <td>North America</td>
            </tr>
            <tr>
                <td>Beijing</td>
                <td>China</td>		
                <td>Asia</td>
            </tr>
        </table>
    </body>
</html>
