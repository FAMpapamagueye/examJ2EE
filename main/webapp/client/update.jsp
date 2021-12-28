<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modification Publication</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
	<fieldset>

		<legend>Nouvelle publication</legend>

		<form method="post" action="modifier">
			<table>
				<thead>Vous pouvez poster un nouvelle publication via ce
					Formulaire
				</thead>
				<tbody>
					
					<tr>
						
						<td><input type="hidden" name="titre"
							value="${publication.titre }"></td>
						
					</tr>
					<tr>
						<td>date Publication</td>
						<td><input type="text" name="date"
							value="${publication.date }"></td>
						<td><span class="obligatoire">${form.erreurs['date'] }</</span></td>
					</tr>
					<tr>
						<td>auteur</td>
						<td><input type="text" name="auteur"
							value="${publication.auteur }"></td>
						<td><span class="obligatoire">${form.erreurs['auteur'] }</</span></td>
					</tr>

					<tr>
						<td>contenu</td>
						<td><input type="text" name="contenu"
							value="${publication.contenu }"></td>
						<td><span class="obligatoire">${form.erreurs['contenu']}</span></td>
					</tr>
					<tr>
						<td><input type="reset" value="annuler"></td>
						<td><input type="submit" value="Poster"></td>
					</tr>

				</tbody>
			</table>

		</form>
	</fieldset>
</body>
</html>