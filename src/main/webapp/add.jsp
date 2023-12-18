<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: dsi
  Date: 12/18/23
  Time: 5:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP file</title>
</head>
<body bgcolor="aqua">
    <%
        String Name = request.getParameter("FirstName")+ request.getParameter("SecondName");
    %>
<%=
    Name
%>
</body>
</html>
