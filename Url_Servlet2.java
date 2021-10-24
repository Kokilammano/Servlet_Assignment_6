package com.app.url;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/s2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		String skill1=req.getParameter("skill1");
		String skill2=req.getParameter("skill2");
		
		HttpSession session=req.getSession();
		session.setAttribute("skill1", skill1);
		session.setAttribute("skill2", skill2);
		
		PrintWriter out=res.getWriter();
		out.println("<h1>Education Details :</h1><hr>");
		out.println("<form action="+res.encodeURL("s3")+" method='post'>");
		out.println("Qualification :<input type='text' name='qlf'><br><br>");
		out.println("University :<input type='text' name='univ'><br><br>");
		out.println("<input type='submit' value='Submit'>");
		out.println("</form>");
	}

}

