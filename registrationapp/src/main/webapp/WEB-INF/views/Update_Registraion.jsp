<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATED_RESULTS</title>
</head>
<body>
<form action  ="update" method ="post">
	email<input type="email" name = "email" value= "<%= request.getAttribute("email")%>"/>
	mobile<input type="mobile" name = "mobile" value= "<%= request.getAttribute("mobile")%>"/>
	<input type="submit" value= "Update"/>

</form>
</body>
</html>