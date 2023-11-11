
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Notes</title>

<%@include file="all_js_css.jsp"%>
</head>
<body>
	<div class="container">
	  <%@include file="navbar.jsp"%>
	  <br>
	  <h1>Please Fill User Deatils :- </h1>
	  <!--this is add form  -->
	  
		  <form action="SaveUserServlet" method="post">
		  
	  <div class="form-group">
	    <label for="name">User Name</label>
	    <input name="name" required type="text" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter here"/>
	  </div>
	  <div class="form-group">
	    <label for="email">User Email</label>
	    <input name="email" required type="email" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter here"/>
	  </div>
	  
	  <div class="form-group">
	    <label for="phone">User Phone No.</label>
	    <input name="phone" required type="number" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter here"/>
	    <small id="phone" class="form-text text-muted">We'll never share your Phone no. with anyone else.</small>
	  </div>
	  
	  <div class="form-group">
	    <label for="city">User City</label>
	    <input name="city" required type="text" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter here"/>

	  </div>
	  
	  <div class="d-md-flex justify-content-start align-items-center mb-4 py-2">

                  <h6 class="mb-0 me-4" required type="radio" >Gender: &emsp;</h6>

                  <div class="form-check form-check-inline mb-0 me-4">
                    <input class="form-check-input" type="radio" name="gender"  
                      value="Female" />
                    <label class="form-check-label" for="femaleGender">Female</label>
                  </div>

                  <div class="form-check form-check-inline mb-0 me-4">
                    <input class="form-check-input" type="radio" name="gender"  
                      value="Male" />
                    <label class="form-check-label" for="maleGender">Male</label>
                  </div>

                  <div class="form-check form-check-inline mb-0">
                    <input class="form-check-input" type="radio" name="gender"  
                      value="Other" />
                    <label class="form-check-label" for="otherGender">Other</label>
                  </div>

		</div>
	  <!-- <div class="form-group">
	    <label for="content">Note Content</label>
	    <textarea name="content" required id="content" placeholder="Enter your content here" class="form-control" style="height:200px"></textarea>
	  </div> -->
	  
	  <div class="container text-center" >
	  <button type="submit" class="btn btn-primary">Add</button>
	  </div>
	</form>
  </div>
</body>
</html>