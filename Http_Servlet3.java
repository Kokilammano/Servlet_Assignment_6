package com.app.httpsession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/s3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		HttpSession session=req.getSession(false);
		
		String fname=(String)session.getAttribute("fname");
		String lname=(String)session.getAttribute("lname");
		String skill1=(String)session.getAttribute("skill1");
		String skill2=(String)session.getAttribute("skill2");
		
		PrintWriter out=res.getWriter();
		String qlf=req.getParameter("qlf");
		String univ=req.getParameter("univ");
		
		out.println("<h1>Details Summary :</h1><hr>");
		out.println("<p>First Name : " +fname +"</p>");
		out.println("<p>Last Name : " +lname +"</p>");
		out.println("<p>Skill-1 : " +skill1 +"</p>");
		out.println("<p>Skill-2 : " +skill2 +"</p>");
		out.println("<p>Qualification : " +qlf +"</p>");
		out.println("<p>University : " +univ +"</p>");
		
		out.close();
		
	}

}
