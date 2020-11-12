package com.comunus.projectReport.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommonServlet extends HttpServlet {
	
	public void validate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     if(request.getSession().getAttribute("username")==null)
	     {
	    	 request.setAttribute("err", "you have not logged into System");
	    	 request.getRequestDispatcher("/login.jsp").forward(request, response);
	     }
	}

}
