<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<title>后台管理</title>
<link rel="stylesheet" href="css/bootstrap.css"/> 
</head>
<body>
<div class="container-fluid">

	


<jsp:include page="header.jsp"></jsp:include>

	<br><br>
	<%  
	    out.println("Admin index.jsp = " + LocalDateTime.now()+ " == " + request.getContextPath() + "/r/n");
	%>
	<div class="alert alert-success" role="alert">恭喜你! 登录成功了</div>
	
</div>	
</body>
</html>