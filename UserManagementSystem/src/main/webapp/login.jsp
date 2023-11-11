<!doctype html>
<html lang="en">

<%@page import= "java.util.List" %> 
<%@page import= "org.hibernate.*" %> 


<%@page import= "com.helper.FactoryProvider" %> 
<%@page import= "com.Entities.*" %> 


  <head>
  
  	<title>Note Taker</title>
  	<h1>Welcome To User Management....!!</h1>
  	<!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>     
   
    
  </head>
  
  
  <body style="background: url(img/hacker.jpg); background-size: cover; background-attachment: fixed;">
        <div class="container">
            <div class="row">
                <div class="col m6 offset-m3">
                    
                    
                    <div class="card">
                        <div class="card-content">
                            <h4 style="margin-top: 10px;" class="center-align">Login here !!</h4>   
                         
                         <div class="form center-align">
                             <!--//creating form-->
                             
                             <form action="LoginServlet" method="post">
                                 
                                 <input type="email" name="lemail" placeholder="Enter user email"/>
                                 <input type="password" name="lpassword" placeholder="Enter user password"/>                                  
                                 <button type="submit" class="btn light-blue">Submit</button><br>
                                 
                             </form>
                             
                         </div>
               
        
                        </div>
                    </div>
                </div>
            </div>
        </div>
    



  </body>
</html>