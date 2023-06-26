<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pasword Generator</title>
<style>
div {
	background-color:lavender; 
    color:purple;
    font-size: 30px;
 	height: 50px;
 	width: 100%;
 	text-align:center;
}
body{
	 background-color: lavenderblush;
     color:purple;
     font-size:15px;
     text-align:justify;
}
</style>
</head>
<body>
	<div> Welcome,You can generate the password according to your use </div><br>
	<!-- Here this form contains number of passwords,length of ythe passwords anda button which is used to generate the random passwords -->
	<form method="post" action="generate" >
		<b>How many random passwords do you want to generate: <input type="text" name="numpass" id="numpass" placeholder="Enter the number of passwords"/></b><br>
		<b>How long do you want your random passwords to be: <input type="text" name="lenpass" id="lenpass" placeholder="Enter the length of passwords"/></b><br>
		<input type="submit" value="Submit" name="submit"/>
	</form>
</body>
</html>