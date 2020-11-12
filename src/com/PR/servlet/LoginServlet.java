package com.PR.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Connection con=null;
	PreparedStatement pst=null;
	  public void init()
	  {
		  ServletConfig config=getServletConfig();
		  ServletContext context=config.getServletContext();
		  String driver=context.getInitParameter("driver_class");
		  String url=context.getInitParameter("url");
		  String username=context.getInitParameter("username");
		  String password=context.getInitParameter("password");
		  System.out.println(driver);
		  System.out.println(url);
		  System.out.println(username);
		  System.out.println(password);
		  try
		  {
		  //Eastablish the connection
		  Class.forName(driver).newInstance();
	      con=DriverManager.getConnection(url, username, password);
	      if(con!=null)
	      {
	    	  System.out.println("connection is Eastablised");
	      }
	     
	      pst=con.prepareStatement("select * from tbl_login where loginId=? and loginpassword=? ");
	        
		  }
		  catch (Exception e) {
			// TODO: handle exception
		}
	  }


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			   throws ServletException,IOException{
			  response.setContentType("text/html");
			  PrintWriter out = response.getWriter();
			  try {
			      System.out.println(request.getParameter("userid"));
			      System.out.println(request.getParameter("password"));
//			  if(request.getParameter("userid")!=null &&
//			     request.getParameter("userid")!="" && request.getParameter("password")!=null &&
//			     request.getParameter("password")!="")
//			  {
			  String userid = request.getParameter("userid").trim().toString();
			  String password = request.getParameter("password").trim().toString();
			  
			 
			  //set the value to db
			  pst.setString(1, userid);
			  pst.setString(2, password);
//			  }
			   //exeute the value into db
			   boolean bo=pst.execute();
			 
			  int count=0;
			    if(bo==true)
			    {
			         out.println("<h2> Login is Successful executed</h2>");        	
			    }
			  }
			  catch (SQLException e) {
				// TODO: handle exception
				  e.printStackTrace();
			}
//			  if(count>0)
//			  {
//			  response.sendRedirect("welcome.jsp");
//			  }
//			  else
//			  {
//			 response.sendRedirect("login.jsp");
//			  }
//			  }
//			  else
//			  {
//			 response.sendRedirect("login.jsp");
//			  }
//			  System.out.println("Connected to the database"); 
//			  conn.close();
//			  System.out.println("Disconnected from database");
//			  } catch (Exception e) {
//			  e.printStackTrace();
//			  }
		}

}
