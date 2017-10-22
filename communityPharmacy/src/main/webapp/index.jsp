<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
<body>
<%
    String path = request.getContextPath();
    response.sendRedirect(path+"/user/login");
%>
</body>
</html>
