<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fam" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouvelle Publication</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
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
	<fieldset>

		<legend>Nouvelle publication</legend>

		<form method="post" action="publication">
			<table>
				<thead>
				Vous pouvez poster un nouvelle publication via ce Formulaire
				</thead>
				<tbody>
					<tr>
						<td>titre</td>
						<td><input type="text" name="titre" value="${publication.titre }"></td>
						<td><span class="obligatoire">${form.erreurs['titre'] }</</span></td>
					</tr>
					<tr>
						<td>date Publication</td>
						<td><input type="text" name="date" value="${publication.date }"></td>
						<td><span  class="obligatoire">${form.erreurs['date'] }</</span></td>
					</tr>
					<tr>
						<td>auteur</td>
						<td><input type="text" name="auteur" value="${publication.auteur }" ></td>
						<td><span  class="obligatoire">${form.erreurs['auteur'] }</</span></td>
					</tr>
					
					<tr>
						<td>contenu</td>
						<td><input type="text" name="contenu" value="${publication.contenu }" ></td>
						<td><span  class="obligatoire">${form.erreurs['contenu']}</span></td>
					</tr>
					<tr>
						<td><button class="btn btn-outline-brown" type="submit" name="retour"  >Retour</button></td>
						<td><input type="submit" value="Poster"></td>
					</tr>

				</tbody>
			</table>

		</form>
	</fieldset>
</body>
</html>