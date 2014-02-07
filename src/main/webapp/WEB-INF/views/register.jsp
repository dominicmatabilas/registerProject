<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>

	<title>Register Page</title>
	
	<div id="grad1"> </div>
		
<h3 align="center">Register form</h3>

<head>

<form action="registerPage.html" method="POST">

<table align="center" >

	<tr> 
		<td align="left"> </td>
		<td align="center"> </td>
	</tr>
	
	<tr> 
		<td align="left"> <label> Name: </label> </td>
		<td align="center"> <input type="text" name="name" required > </td>
		
		
	</tr>
	<tr> 
		<td align="left"> <label> User name:</label> </td>
		<td align="center"> <input type="text" name="userName" required> </td>
		
		
	</tr>
	<tr>
		<td align="left"> <label> Password: </label> </td>
		<td align="center"> <input type="text" name="password" required> </td>
		
	</tr>
	
	
</table>

<table align="center">
	<tr>
		<td align="center"> <input type="submit" value="Register" onclick = "myFunction()" > </td>
	</tr>
	<tr>
		<td> </td>
		<td> </td>
		<td> </td>
	</tr>
	<tr>
		<td align="center"> <P>Number of Registered Users: ${numberOfUsers}</P> </td> 
	</tr>
</table>

</form>


</body>
</html>








<style>
#grad1
{
height:200px;
background: linear-gradient(to left, rgba(80,0,0,0), rgba(150,0,0,1)); /* Standard syntax (must be last) */
}
</style>

<script>
function myFunction()
{
alert("Added new user!");
}
</script>