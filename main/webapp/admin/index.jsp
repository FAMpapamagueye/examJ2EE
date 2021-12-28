<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fam"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil Admin</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>

	<a href='<fam:url value="deconnexion"></fam:url>'>Deconnexion</a>
<br>
	<table style="text-align: center;" class="table table-black">
		<thead>
			<th>Nom</th>
			<th>Email</th>
			<th>Nom d'utilisateur</th>
			<th>profil</th>
			<th>Action</th>

		</thead>
		<tbody>
			<fam:forEach items="${utilisateurMap }" var="per">
				<tr>
					<td><fam:out value="${per.value.nom }"></fam:out></td>
					<td>${per.value.email}</td>
					<td>${per.value.login}</td>
					<td>${per.value.profil}</td>
					<td><a href="<fam:url value="update">"><fam:param
								name="id" value="${per.key}" />
							</fam:url>"> editer</a> &nbsp; <a href="<fam:url value="supprimer">"><fam:param
								name="id" value="${per.key}" />
							</fam:url>"> Supprimer</a></td>
				</tr>
			</fam:forEach>
		</tbody>
</body>
</html>