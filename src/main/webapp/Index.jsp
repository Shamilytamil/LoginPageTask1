<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>LoginPage</title>
<link rel='stylesheet' href='form-style.css' type='text/css' />

<style type="text/css">
.container{
display: flex;
justify-content:left;
align-items:center;
height:30px;
 width:150px;
 font-size:20px;
}
</style>
<script type="text/javascript">
function validateForm(){
	var username = document.getElementById("userName").value;
	var password = document.getElementById("password").value;
	
	if(username == ""||password == ""){
		alert("Username or Password cannot be empty.");
		return false;
	}
	return true;
}
</script>
</head>
<body>

<h1>User Login </h1>
<%
 String errorMessage = (String)request.getAttribute("errorMessage");
 if(errorMessage != null){%>
	 <div style="color:red;"><%=errorMessage %></div>
 <%}%>
	
	<form action="LoginPage" method="POST" onsubmit= "validateForm()">
	<table>
	<tr><td><div class="container">
<label for ="userName">	User Name :</label></div></td><td><input type="text" name="userName" id = "userName" pattern = "[a-z0-9@].{3,}" title ="Allowed Field a-z,0-9,@,No special character allowed"></td></tr>
	<tr><td><div class="container">
	<label for ="password">Password :</label> </div></td><td><input type="password" name="password" id = "password" ></td></tr>
	<tr><td></td><td><button type="submit" style="background-color: green;color: white;"><b>Submit</b></button>
	<button type="reset" style="background-color: green;color: white;"><b>Reset</b></button></td></tr>
		
 </table>
 
</form>
</body>


</html>