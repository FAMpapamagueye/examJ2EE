<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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

	<nav>
		<a href="publication">new post</a>

		<table class="table table-hover " style="border: 1px solid">


			<thead>
				<th>titre</th>
				<th>Contenu</th>
				<th>date</th>
				<th>auteur</th>
				

				<th>Action</th>
			</thead>
			<tbody>
				<fam:forEach items="${publicationMap}" var="pos">
					<tr>
						<td><fam:out value="${pos.value.titre }"></fam:out></td>
						<td><fam:out value="${pos.value.contenu }"></fam:out></td>
						<td><fam:out value="${pos.value.date }"></fam:out></td>
						<td><fam:out value="${pos.value.auteur}"></fam:out></td>
					
						<td><a href="<fam:url value="modifier">"><fam:param
									name="id" value="${pos.key}" />
								</fam:url>"> editer</a> &nbsp; <a href="<fam:url value="delet">"><fam:param
									name="id" value="${pos.key}" />
								</fam:url>"> Supprimer</a></td>
					</tr>
				</fam:forEach>
			</tbody>
		</table>


	</nav>
</body>
</html>