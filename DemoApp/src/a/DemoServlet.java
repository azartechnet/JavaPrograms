package a;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		String u=request.getParameter("uname");
		
		HttpSession session1=request.getSession();
		
		session1.setAttribute("username", u);
		
		out.println("<form action='DemoServlet2' method='get'>");
		out.println("<input type='text' value='"+u+"'/>");
		out.println("<input type='submit' value='go'/>");
		out.println("</form>");
		
		//out.println(""+u);
	}

}
