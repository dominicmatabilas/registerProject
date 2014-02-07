<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>

	<title>Search Users</title>
	
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
          <li><a href="updatePageGet">Update Developer</a></li>
          <li class="selected"><a href="searchUserGet">Search Developer</a></li>
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
        <h5>Total number of registered developers: </h5>
        <h3>${numberOfUsers} <br /></h3>
               
          <h3>Search</h3>
        
        
        <form method="post" action="searchUserPost" id="search_form" name="search">
          <p>
            <input class="search" type="text" name="search" placeholder="Enter keywords....." />
            <input name="search" type="image" style="border: 0; margin: 0 0 -9px 5px;" src="resources/style/search.png" alt="Search" title="Search" />
          </p>
        </form>
       
        
      </div>
      <div id="content">
        <!-- insert the page content here -->
        <h1>Search Results</h1>
        <br>
       	
       	
		<table align = "center" border = "1" class = CSSTableGenerator>

				
						<tr> 
							<td align = "center">ID</td>
							<td align = "center">Name</td>
							<td align = "center">User name</td>
						</tr>
			<c:if test = "${empty foundUsers}">
			
				<tr>
				<td align = "center">No results found.</td>
				</tr>
				
			</c:if>
			
			<c:forEach var="users" items="${foundUsers}">

                        <tr>
                        		<td align = "center">${users.id}</td> 
								<td align = "left">${users.name}</td> 
                                <td align = "left"> ${users.userName}</td> 
                        </tr>

            </c:forEach>

		</table>
       	
       	
        
      </div>
    </div>
    <div id="content_footer"></div>
    <div id="footer">
     
    </div>
  </div>
 
 
 
 
</body>
</html>
	
	
	
	
	
