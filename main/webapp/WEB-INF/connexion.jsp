<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title></title>
</head>
<body >
 <fieldset>
 	<legend>Inscription</legend>
 	<form method="post" action="login">
 	<table style="text-align: center;">
 		<thead>Vous pouvez vous connecter via ce Formulaire</thead>
 		<br>
 		<br>
 		<tbody>
 		
 			<tr>
 				<td>Email</td>
 				<td><input type="email" name="email"></td>
 			</tr>
 			
 			<tr>
 				<td>Mot de Passe</td>
 				<td><input type="password" name="password"></td>
 			</tr>
 			
 			<tr>
 				<td><input type="reset" value="Annuler" ></td>
 				<td><input type="submit"value="Connexion" ></td>
 			</tr>
             
 			<tr>
 				<td></td>
 				<td><a href="register">S'inscrire</a></td>
 			</tr>
 		</tbody>
 	</table>
 </fieldset>
 </form>
</body>
</html>