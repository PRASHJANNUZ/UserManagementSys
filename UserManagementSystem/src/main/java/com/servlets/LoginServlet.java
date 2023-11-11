package com.servlets;

import java.io.IOException;  
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.*;
import org.hibernate.Session;

import com.Entities.Admin;
import com.helper.FactoryProvider;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		
			//title,content fetch
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			
			String lemail=request.getParameter("lemail");
			String lpassword=request.getParameter("lpassword");
			
			System.out.println("**************:-"+lemail);
			System.out.println("**************:-"+lpassword);
			
			int check=0;
			
			 Session s=FactoryProvider.getFactory().openSession();
			  Query q=s.createQuery("from Admin");
			  List<Admin> list=q.list();
			  for(Admin admin:list)
			  {
				  if(admin.getEmail().equals(lemail) && admin.getPassword().equals(lpassword)) 
				  {
					  out.print("<br><div style='text-align: center;'> <img src='img/login.png'  alt='girs are not hot' width='350' height='350' > </div>");
					  out.print("<br><h1 style='text-align:center;'>Login Successfully......!!</h1>");
					  out.print("<h1 style='text-align:center;'><a href='home.jsp'>Home Page</h1>");
					  s.close();
					  check=1;
					  break;
				  }
					 
			  }
			  
			  if(check==0) {
				  out.println("<h1>Invalid User or Password........</h1>");
				  out.println("<h1><a href='login.jsp'>Try again...</h1>");
				  out.println("<br><h1><a href='index.jsp'>Register here</h1>");
			  }
		
	}

}
