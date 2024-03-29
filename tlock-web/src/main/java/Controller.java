package org;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.naming.InitialContext;

@WebServlet("/Controller")
public class Controller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		  out.println("<html><h1>It works!!</h1></html>");
		  try
		  {
		  com.transInt b=(com.transInt)new InitialContext().lookup("java:global/tlock-ear-1.0-SNAPSHOT/tlock-web-1.0-SNAPSHOT/transBean");
		  b.tstart();
		  }
		  catch(javax.naming.NamingException n)
		  {
			  n.printStackTrace();
		  }
		System.out.println("Inside servlet");
	}
}
