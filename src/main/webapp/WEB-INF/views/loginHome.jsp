<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>

	<title>Login Page</title>
	
	<!--  <img src="resources/index.jpg">-->
		
<link rel="stylesheet" href="resources/css/ui-lightness/jquery-ui-1.10.4.custom.css" >
<script src="resources/js/jquery-1.10.2.js"></script>
<script src="resources/js/jquery-ui-1.10.4.custom.js"></script>


<head>

<body id="grad1">


<div class="login">
	<h1>Login</h1>
    <form action="loginHomePost.html" method="POST">
    	<input type="text" name="userName" placeholder="Username" required="required" />
        <input type="password" name="password" placeholder="Password" required="required" />
        <button type="submit" class="btn btn-primary btn-block btn-large">Let me in.</button>
   		<br>
   		<a href="registerPageGet"> Not a member?</a>
    </form>
</div>




<!--  







<form action="loginHomePost.html" method="POST">

<table align="center">


	<tr> 
		<td align="left"> <label> User name:</label> </td>
		<td align="center"> <input type="text" name="userName"  required> </td>
		
		
	</tr>
	<tr>
		<td align="left"> <label> Password: </label> </td>
		<td align="center"> <input type="password" name="password" required> </td>
	</tr>
	
	
</table>

<table align="center">

	<tr>
		<td align="center"> <input type="submit" value="Login" id="button"> </td>
	</tr>
	<tr>
		<td><a href="registerPageGet"> Register here!</a> </td>
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
-->

</body>
</html>




<style>

h1 
{
color:#FFFFFF;
font-size:2.5em;
}

</style>



<style>
#grad1
{
background: linear-gradient(to left, rgba(80,0,0,0), rgba(150,0,0,1)); /* Standard syntax (must be last) */
}
</style>

