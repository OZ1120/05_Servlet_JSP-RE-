package edu.kh.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ExamServlet1 extends HttpServlet {
																	// 톰캣 제공

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String inputName = req.getParameter("inputName");
		String inputAge = req.getParameter("inputAge");
		System.out.println("ex 서버 요청");
		System.out.println("전달 받은 inputName : " + inputName);
		System.out.println("전달 받은 inputAge : " + inputAge);
		
		
		resp.setContentType("text/html; charset=utf-8");
		PrintWriter out = resp.getWriter();
		
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("<!DOCTYPE html>");
		sb.append("<html>");
		
		sb.append("<head>");
		sb.append("<title> /ex1 응답 페이지 </title>");
		sb.append("</head>");

		sb.append("<body>");
		
		sb.append(String.format("<h1> %s님의 나이는 %s입니다 </h1>", inputName, inputAge));
		
		sb.append("</body>");
		
		sb.append("</html>");
		
		out.print(sb.toString());
		
	}
	

}
