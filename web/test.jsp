<%-- 
    Document   : test
    Created on : Apr 27, 2014, 8:33:19 PM
    Author     : dev jat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="WEB-INF/../fantasycss.css" rel="stylesheet" type="text/css" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%
        String[] ar1 = request.getParameterValues("ar1");
        String[] ar2 = request.getParameterValues("ar2");
        String[] ar3 = request.getParameterValues("ar3");
        String[] ar4 = request.getParameterValues("ar4");
        
     
    %>
    <body>
        <table id="table" style="width:600px" align="center" left="300">
          <tr>
              <th>Franchise1</th>
              <th>Franchise2</th>
              <th>Franchise3</th>
              <th>Franchise4</th>
          </tr>
          <tr>
              <td>Aaron finch</td>
              <td></td>
              <td></td>
              <td>Ab De Villiers</td>
          </tr>
        </table>
    </body>
</html>
