package com.servlets;

import java.io.IOException; 
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entities.*;
import com.helper.FactoryProvider;


public class SaveUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SaveUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		try {

			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String phone=request.getParameter("phone");
			String city=request.getParameter("city");
			String gender=request.getParameter("gender");
			
			User user=new User(name, email , phone , city, gender,  new Date());
			
			//System.out.println(note.getId()+" : "+ note.getTitle());
			//hibernate:save();
			
			Session s=FactoryProvider.getFactory().openSession();
			Transaction tx=s.beginTransaction();
			
			s.save(user);
			tx.commit();
			s.close();
			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.print("<div style='text-align: center;'> <img src='img/user.png'  alt='girs are not hot' width='400' height='400' > </div>");
			out.print("<h1 style='text-align:center;'>User added Successfully</h1>");
			out.print("<h3 style='text-align:center;'><a href='add_note.jsp'>Add more users</h3>");
			out.print("<h3 style='text-align:center;'><a href='all_notes.jsp'>View all users</h3>");
			
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
	}

}
