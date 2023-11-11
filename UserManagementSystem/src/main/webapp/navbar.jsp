<nav class="navbar navbar-expand-lg navbar-dark purple">
  <a class="navbar-brand" href="home.jsp">User Management</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

<%@page import= "java.util.List" %> 
<%@page import= "org.hibernate.*" %> 
<%@page import= "com.helper.FactoryProvider" %> 
<%@page import= "com.Entities.*" %>  


  <div class="collapse navbar-collapse" id="navbarSupportedContent">
  
    <ul class="navbar-nav mr-auto">
      
      <li class="nav-item ">
        <a class="nav-link " href="profile.jsp">Admin profile</a>
      </li>
      
      <li class="nav-item ">
        <a class="nav-link" href="add_note.jsp">Add user</a>
      </li>
      
      <li class="nav-item ">
        <a class="nav-link " href="all_notes.jsp">Show users</a>
      </li>
    
	  <li class="nav-item ">
        <a class="nav-link " href="profile.jsp">Logout</a>
      </li>
      
    </ul>
    
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-light my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>