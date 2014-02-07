<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>

	<title>Update Information</title>
	
<link rel="stylesheet" href="resources/style/style.css" >
<script src="resources/js/jquery-1.10.2.js"></script>
<script src="resources/js/jquery-ui-1.10.4.custom.js"></script>	
	

<head>
<body>


  <div id="main">
    <div id="header">
      <div id="logo">
        <div id="logo_text">
          <!-- class="logo_colour", allows you to change the colour of the text -->
          <h1>Spring Framework</h1>
          <h2>Not Simple. Not Contemporary..</h2>
        </div>
      </div>
      <div id="menubar">
        <ul id="menu">
          <!-- put class="selected" in the li tag for the selected page - to highlight which page you're on -->
          <li><a href="HomePageGet">Home</a></li>
          <li><a href="viewAllPageGet">View Developers</a></li>
          <li  class="selected"><a href="updatePageGet">Update Developer</a></li>
          <li><a href="searchUserGet">Search Developer</a></li>
          <li><a href="logout">Logout</a></li>
        </ul>
      </div>
    </div>
    <div id="site_content">
      <div class="sidebar">
        <!-- insert your sidebar items here -->
        <h3>Latest News</h3>
        <h4>New Website Launched</h4>
        <h5>February 6, 2014</h5>
        <p>Take a look around and let us know what you think.<br /></p>
        <p></p>
      
      </div>
      <div id="content">
        <!-- insert the page content here -->
        <h1>Update form</h1>
        <br>
        
        <form action="updatePagePost.html" method="POST">
        
       <table align="center" class = "table1">

		<tr> 
			<td align="left"> <label>Name:</label> </td>
			<td align="center"> <input type="text" class="search" name="name" value="${name}"> </td>
    	</tr>
		<tr> 
			<td align="left"> <label> User name:</label> </td>
			<td align="center"> <input type="text" class="search" name="userName" value="${userName}"> </td>
		</tr>
		<tr>
			<td align="left"> <label> Password: </label> </td>
			<td align="center"> <input type="text" class="search" name="password" value="${password}"> </td>
		</tr>
	
		</table>

		<table align="center" class = "table1">
		<tr>
			<td align="center"> <input type="submit" value="Update" onclick ="myFunction()"> </td>
		</tr>
		</table>
       	
       	</form>
        
      </div>
    </div>
    <div id="content_footer"></div>
    <div id="footer">
     
    </div>
  </div>
 

</body>
</html>


<style>
 .table1 {
background: rgba(255,255,255,0.5);
}
</style>



<script>
function myFunction()
{
alert("Update successful!");
}
</script>