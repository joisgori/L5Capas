<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>
		<c:out value="Acá uso el tag C:OUT" />
	</h1>
	
	
	
	<table>
		<tr>
			<th>Nombre</tr>
			<th>Apellido</th>
			<th>Fecha de nacimiento</th>
			<th>Carrera</th>
			<th>Experiencia</th>
		</tr>
		
		
		<tr>
			<td>${student.name}</td>
			<td>${student.lastName}</td>
			<td>${student.bDate}</td>
			<td>${student.career}</td>
			<td>${student.experience}</td>
		</tr>
	</table>
	
	<p>
	Acá hago uso del forEach <br>
		<c:forEach var = "i" items="1,4,5,6,7,8,9">
    	Item <c:out value = "No. ${i}"/><p>
		</c:forEach> 	
	</p>
	
	<p>
		<c:choose>
		    <c:when test="true">
		        <c:out value="Es verdadero mi uso de la tag When"/>
		    </c:when>
		</c:choose>
	</p>
	
	
</body>
</html>