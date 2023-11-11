package com.servlets;

import java.io.IOException;  
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entities.*;
import com.helper.FactoryProvider;


public class LogoutServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
    
	  
    public LogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			
			int profileId=Integer.parseInt(request.getParameter("profile_id").trim());
			
			Session s=FactoryProvider.getFactory().openSession();
			Transaction tx=s.beginTransaction();
			Admin Admin=(Admin)s.get(Admin.class, profileId);
			
			Query q=s.createQuery("from User");
			  List<User> list=q.list();
			  for(User user:list)
			  {
				  User d=s.get(User.class, user.getId());
				  s.delete(d);
			  }
			  
			  
			s.delete(Admin);
			
			tx.commit();
			s.close();
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			response.sendRedirect("index.jsp");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
