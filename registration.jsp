<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<title>REGISTRATION FORM</title>
<style>
div {
	background-color: rgba(179, 14, 36, 0.693);
	color: aliceblue;
	padding: 10px;
	margin: 20px 450px;
	width: 600px;
}

.A {
	color: white;
}

#T {
	height: 50px;
}
</style>
</head>
<body>
	<h1 align="center">${Title}</h1>
	<h1 align="center">${SubTitle}</h1>
	<div>
		<form action="submitForm" method="post">
			<fieldset>
				<table align="center" height="500px">
					<tr>
						<td><label class="A"> Name: </label></td>
						<td><input type="text" placeholder="your name" name="name"></td>
					</tr>
					<tr>
						<td><label class="A"> Email: </label></td>
						<td><input type="email" placeholder="your email" name="email"></td>
					</tr>
					<tr>
						<td><label class="A"> Password: </label></td>
						<td><input type="password" name="password"></td>
					</tr>
					<tr>
						<td><label class="A"> Phone Number: </label></td>
						<td><input type="text" name="mobile"></td>
					</tr>
					<tr>
						<td><label class="A"> Gender: </label></td>
						<td><label class="B"> Male </label> <input type="radio"
							name="comm" value="Male"><label> Female </label> <input
							type="radio" name="comm" value="Female"><label>
								Other </label> <input type="radio" name="comm" value="Other"></td>
					</tr>
					<tr>
						<td><label class="A">Language: </label></td>
						<td><select name="lang">
								<option>Select Language</option>
								<option>English</option>
								<option>Hindi</option>
								<option>Kannada</option>
								<option>Bengali</option>
								<option>Tamil</option>
							        <option>Telegu</option>
						</select></td>
					</tr>
					<tr>
						<td><label class="A">Pin Code: </label></td>
						<td><input type="text" name="pinCode"></td>
					</tr>
					<tr>
						<td><label class="A">About: </label></td>
						<td><textarea id="T" cols="22" rows="3"
								placeholder="Write about yourself..." name="about"></textarea></td>
					</tr>
					<tr>
						<td colspan="2" align="center"><input type="submit">
						</td>
					</tr>
				</table>
			</fieldset>
		</form>
	</div>
</body>
</html>
