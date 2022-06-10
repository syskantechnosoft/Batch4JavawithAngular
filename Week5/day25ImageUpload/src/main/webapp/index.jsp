<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Image Upload</title>
</head>
<body>

	<form method="post" action="Serv" enctype="multipart/form-data">
		<div>
			<label>First Name:</label> <input type="text" name="firstName"
				size="50" />
		</div>
		<div>
			<label>Last Name:</label> <input type="text" name="lastName"
				size="50" />
		</div>
		<div>
			<label>Profile Photo: </label> <input type="file" name="photo"
				size="50" />
		</div>
		<input type="submit" value="Save">
	</form>
</body>
</html>
