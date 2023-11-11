package com.servlets;

import java.io.IOException;  
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entities.*;
import com.helper.FactoryProvider;

public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		
			//title,content fetch
			
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			String email=request.getParameter("email");
			String type=request.getParameter("type");
			
			Admin p=new Admin(name, password, email, type);
			

			
			Session s=FactoryProvider.getFactory().openSession();
			Transaction tx=s.beginTransaction();
			
			s.save(p);
			tx.commit();
			s.close();
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			
			
			out.print("<br><div style='text-align: center;'> <img src='img/login.png'  alt='girs' width='350' height='350' > </div>");
			out.print("<br><h1 style='text-align:center;'>Registerd Successfully......!!</h1>");
			out.print("<h1 style='text-align:center;'><a href='home.jsp'>Home Page</h1>");

		
		
	}

}
