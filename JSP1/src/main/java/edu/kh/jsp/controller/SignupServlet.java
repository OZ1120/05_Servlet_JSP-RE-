package edu.kh.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


// 현재 클래스 servler으로 등록 + 주소랑 servlet매핑(연결 정도로 생각함될듯)
@WebServlet("/signup")
public class SignupServlet extends HttpServlet{
	
	//method post이므로 doPost오버라이딩
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//파라미터(전달인자, 전달된값) 가져와/ 파라미터는 스트링임.html에서 그대로 글자 가져오니깐
		String inputId = req.getParameter("inputId");
		String inputPw = req.getParameter("inputPw");
		String inputPwCheck = req.getParameter("inputPwCheck");
		String inputName = req.getParameter("inputName");
		String inputAge = req.getParameter("inputAge");
		

		System.out.println("inputId : " + inputId);
		System.out.println("inputPw : " + inputPw);
		System.out.println("inputPwCheck : " + inputPwCheck);
		System.out.println("inputName : " + inputName);
		System.out.println("inputAge : " + inputAge);
		
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		StringBuilder sb = new StringBuilder();
		
		sb.
		
	}
	
	
}
