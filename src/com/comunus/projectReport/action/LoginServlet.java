package com.comunus.projectReport.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.comunus.projectReport.delegate.CommonDelegate;
import com.comunus.projectReport.dto.LoginDTO;
import com.comunus.util.CryptoUtil;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet( name="LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PrintWriter out;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out = null;
		
		//set the content type
		response.setContentType("text/html");
		out=response.getWriter();
	   	 try
	   	 {
	   		String username=request.getParameter("userid").trim().toString();
			String password=request.getParameter("password").trim().toString();
			
			System.out.println(username);
			System.out.println(password);
			LoginDTO loginDto=new LoginDTO();
			
			loginDto.setLoginId(username);
			loginDto.setLoginPassword(password);
			
			
			CommonDelegate login=new CommonDelegate();
	    
			String userType=login.getLogin(loginDto);
			
			if(userType.equals("ADMIN"))
			{
				System.out.println("Dashboard should be open");
				HttpSession session=request.getSession();
				 session.setAttribute("username",loginDto.getLoginId());
				 session.setAttribute("userType", "ADMIN");
				 RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/jsp/banner.jsp");
				 rd.forward(request, response);
			}
			else if(userType.equals("CUSTOMER"))
			{
				System.out.println("Customer Dashboard will open");
				HttpSession session=request.getSession();
				session.setAttribute("username", loginDto.getLoginId());
				session.setAttribute("login", loginDto);
				session.setAttribute("admin", "CUSTOMER");
				
				RequestDispatcher rd=request.getRequestDispatcher("/WEB-INF/view/jsp/banner.jsp");
				rd.forward(request, response);
			}
	   	 }
	   	 catch (Exception e) {
			// TODO: handle exception
	   		 
	   		System.out.println("Alternative way of Excecution");
	   		request.setAttribute("err", "Wrong Username and password");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
	   		 return ;
	 
		}
				
			
		
	}

}
