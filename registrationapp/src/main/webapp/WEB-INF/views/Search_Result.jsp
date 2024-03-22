<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.ResultSet" %>
    <%@ include file="Menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SEARCH RESULT</title>
</head>
<body>
	<h2>SEARCH RESULT</h2>
	<table>
	<table border="1">
	<tr>
	<th> NAME </th>
	<th> CITY </th>
	<th> EMAIL </th>
	<th> MOBILE </th>
	<th> Delete </th>
	<th> Update </th>
	</tr>
	<%
	ResultSet set=(ResultSet)request.getAttribute("result");
	while(set.next())
	{
	%>	
	<tr>
	<td><%=set.getString(1) %></td>
	<td><%=set.getString(2) %></td>
	<td><%=set.getString(3) %></td>
	<td><%=set.getString(4) %></td>
	<td><a href="delete?emailId=<%=set.getString(3) %>">delete</td>
	<td><a href="update?emailId=<%=set.getString(3) %>&mobile=<%=set.getString(4) %>">update</td>
	</tr>
	
	<%} %>
	</table>	
</body>
</html>