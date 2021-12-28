<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fam"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<span>${publication.titre }</span>
	<br>
	<span>${publication.contenu }</span>
	<br>
	<span>${publication.auteur }</span>
	<br>
	<span>${publication.date }</span>
<a href="<fam:url value="confirm">
<fam:param name="id" value="${publication.titre}" />
</fam:url>">Confirmer</a>
</body>
</html>
</body>
</html>