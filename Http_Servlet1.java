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
 * Servlet implementation class Servlet1
 */
@WebServlet("/s1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		
		HttpSession session=req.getSession();
		session.setAttribute("fname", fname);
		session.setAttribute("lname", lname);
		
		PrintWriter out=res.getWriter();
		out.println("<form action='s2' method='post'>");
		out.println("<h1>Skills Details :</h1><hr>");
		out.println("Skill-1 : <input type='text' name='skill1'><br><br>");
		out.println("Skill-2 : <input type='text' name='skill2'><br><br>");
		out.println("<input type='submit' value='Next'>");
		out.println("</form>");
	}

}
