<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style type="text/css">
  .name
  {
  width: 380px;
  }
  .email
  {
  width: 500px;
  }
  .fbid
  {
  width: 480px;
  }
  </style>
<script type="text/javascript">
var x = document.getElementsByClassName("name");
var y=document.getElementsByClassName("user");
var text="";
var str="";
function myFunc()
{
var search=document.getElementById("searchid").value;
for(i=0;i<x.length;i++)
{
var text=x[i].innerHTML;
var n=text.search("/"+search+"/i")
if(n==-1)
{
y[i].style.display="none";
}
else
	{
	y[i].style.display="block";
	}
}
x.style.width="20px";
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
Enter the name to Search<input id="searchid" onkeyup="myFunc()">
<br>
<br>
<table class="table">
<tr>
 <th style="width:380px">Name</th>
 <th style="width:500px">Email</th>
 <th style="width:480px">Id</th>
 </tr>
</table>
<c:if test="${!empty userslist}">
 <table class="table table-stripped">
 <c:forEach items="${userslist}" var="user">
 <tr class="user">
 <td class="name">${user.name}</td>
 <td class="email">${user.email}</td>
 <td class="fbid">${user.fbid}</td>
 </tr>
 </c:forEach>
 </table>
</c:if>
</body>
</html>