package com.learn;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class WelcomeServelet
 */
@WebServlet("/annotation")
public class WelcomeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		System.out.println("Inside init()");
		super.init();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String var1 = request.getParameter("var1");
		
		String var2 = request.getParameter("var2");
		
		String var3 = request.getParameter("var3");
		
		response.getWriter().append("welcome " + var1 + " " + var2 + " " + var3).close();
		
	}
	
	@Override
	public void destroy() {
		System.out.println("Inside destroy()");
		// TODO Auto-generated method stub
		super.destroy();	
	}

}
