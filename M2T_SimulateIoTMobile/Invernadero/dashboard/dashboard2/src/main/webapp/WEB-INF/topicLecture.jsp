<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link type="text/css" href="css/Main.css" rel="stylesheet">
</head>
<body>
     <h1>Datos publicados</h1>
     <p>Total de datos publicados : ${ldata.size()}</p>
	<ul id="datalist">
     	<c:forEach var="data" items="${ldata}">		
			<li><p>${data.getString("value")}</p></li>
		</c:forEach>
	</ul>
</body>
</html>
