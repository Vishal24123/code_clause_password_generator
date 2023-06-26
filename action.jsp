<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Password Generated</title>
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
}
</style>
</head>
<body>
<div> Congratulations,Password Generated Successfully </div><br>
<!-- Here the generated passwords are displayed -->
<ol type="I">
<%String[] str =(String[])request.getAttribute("passwords");
	for(int i=0;i<str.length;i++){%>
		<li><h4><%=str[i]%></h4></li>
<%	}%>
</ol>
</body>
</html>