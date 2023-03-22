<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Math Function</title>
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

</head>
<body>
<h1>Mathematical Function Page</h1>
<form action="Math" method="POST" >
 <table>
	<tr><td><div class="container">
<label for ="no1">	 Number1:</label></div></td><td><input type="text" name="no1" 
<%
Double number1 = (Double)request.getAttribute("number1");
if(number1!=null){ %>
value="<%=number1 %>"<%} %>

id = "no1" pattern = "[0-9].{0,}" title ="Numbers only allowed"></td></tr>
	<tr><td><div class="container">
<label for ="no2">Number2:</label> </div></td><td><input type="text" name="no2" 
<%
Double number2 = (Double)request.getAttribute("number2");
if(number2!=null){ %>
value="<%=number2 %>"<%} %>
id = "no2" pattern = "[1-9].{0,}" title ="Numbers only allowed.Number2 cannot be Zero"></td></tr>
<tr><td><div class="container">
<label for ="result">Result :</label> </div></td><td><input type="text" name="result" 
<%
Double result = (Double)request.getAttribute("result");
if(result!=null){
%>
value="<%=result
%>"<%} %>id = "result" readonly></td></tr>
	<tr><td></td><td><button type="submit" style="background-color: green;color: white;"value = "Add"name="operation"><b>Add</b></button>
	<button type="submit" style="background-color: green;color: white;"value = "Multiple" name="operation"><b>Multiple</b></button>
	<button type="submit" style="background-color: green;color: white;"value = "Subtract"name="operation"><b>Subtract</b></button>
	<button type="submit" style="background-color: green;color: white;"value = "Divide"name="operation"><b>Divide</b></button>
	<button type="reset" style="background-color: green;color: white;"><b>Reset</b></button></td>
	</tr>
		
 </table>
 </form>
</body>
</html>