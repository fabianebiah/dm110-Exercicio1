package br.inatel.calculadora.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculadoraServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6328972194354401407L;

	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello World!</h1>");
	}

}
