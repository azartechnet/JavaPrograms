

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	   //PrintWriter out=response.getWriter();
	   String u=request.getParameter("uname");
	   String p=request.getParameter("pass");
	   if(u.equals("admin")&&p.equals("admin"))
	   {
		   RequestDispatcher g1=request.getRequestDispatcher("sucess.jsp");
		   g1.forward(request, response);
	   }
	   else
	   {
		   RequestDispatcher g1=request.getRequestDispatcher("fail.jsp");
		   g1.include(request, response);
	   }
	}


}
