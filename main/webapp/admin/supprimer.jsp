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
<span>${utilisateur.nom }</span><br>
<span>${utilisateur.email }</span><br>
<span>${utilisateur.profil }</span><br>
<span>${utilisateur.login }</span><br>
<a href="<fam:url value="confirmer">
<fam:param name="id" value="${utilisateur.email}" />
</fam:url>">Confirmer</a>
</body>
</html>