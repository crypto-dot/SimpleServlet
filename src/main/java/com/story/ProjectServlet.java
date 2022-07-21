package com.story;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ProjectServlet")
public class ProjectServlet extends HttpServlet{

	private static final long serialVersionUID = -6554315594585366595L;
	@Override
	public void init() throws ServletException{
		super.init();
	}
	@Override
	public void destroy() {
		super.destroy();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String requestHeaderID = req.getHeader("Payload-Data");
		String responseHeader;
		
		if(requestHeaderID != null && !requestHeaderID.isEmpty()) {
			responseHeader = requestHeaderID;
			res.setStatus(HttpServletResponse.SC_OK);
		} else {
			responseHeader = "Invalid request Header";
			res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		res.getWriter().append("Get is used to read information.");
		System.out.println("GET was called.");
		System.out.println(responseHeader);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String requestHeaderID = req.getHeader("Payload-Data");
		String responseHeader;
		
		if(requestHeaderID != null && !requestHeaderID.isEmpty()) {
			responseHeader = requestHeaderID;
			res.setStatus(HttpServletResponse.SC_OK);
		} else {
			responseHeader = "Invalid request Header";
			res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		res.getWriter().append("Data can be created using this method(POST).");
		System.out.println("POST was called.");
		System.out.println(responseHeader);
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String requestHeaderID = req.getHeader("Payload-Data");
		String responseHeader;
		
		if(requestHeaderID != null && !requestHeaderID.isEmpty()) {
			responseHeader = requestHeaderID;
			res.setStatus(HttpServletResponse.SC_OK);
		} else {
			responseHeader = "Invalid request Header";
			res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		res.getWriter().append("Only use delete to remove the specified target.");
		System.out.println("DELETE was called.");
		System.out.println(responseHeader);
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String requestHeaderID = req.getHeader("Payload-Data");
		String responseHeader;
		
		if(requestHeaderID != null && !requestHeaderID.isEmpty()) {
			responseHeader = requestHeaderID;
			res.setStatus(HttpServletResponse.SC_OK);
		} else {
			responseHeader = "Invalid request Header";
			res.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		}
		
		res.getWriter().append("Use this (PUT) to update information.");
		System.out.println("PUT was called.");
		System.out.println(responseHeader);
	}
}
