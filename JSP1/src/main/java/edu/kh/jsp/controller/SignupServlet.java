package edu.kh.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


// 현재 클래스 servler으로 등록 + 주소랑 servlet매핑(연결 정도로 생각함될듯)
@WebServlet("/signup")
public class SignupServlet extends HttpServlet{
	
	//method post이므로 doPost오버라이딩
	
	@Override							// 요청 객체							// 응답 객체
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//파라미터(전달인자, 전달된값) 가져와/ 파라미터는 항상 스트링임.html에서 그대로 글자 가져오니깐
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
		
		
		// 비밀번호, 비밀번호 확인이 불일치 하면
		// <h3>비밀번호가 일치 하지 않습니다</h3>
			
		// 나이가 14세 미만인 경우
		// <h3>14세 이상만 가입 가능합니다</h3>
			
		// 조건을 모두 충족시
		// <h3>가입 성공</h3>
		// 아이디, 비밀번호, 이름, 나이 (ul, li 이용)
	// ---------------------------------------------------------
		// JSP 사용하기
		 // 1) JSP 파일 생성
		 // 2) Servlet 요청될때 생성된
		 // HttpServletRequest(요청데이터(파라미터)처리),HttpServletRespnse(응답할수있는)객체
		 // 재네 JSP로 보내야함. 응답화면을 JSP에서 만들거니까
		// == 이게 forward(요청 위임)
		
		 // RequestDispatcher 객체
		 // 얘있어야 어느jsp로 요청 위임할지 지정하고 보내줌
		 // -> HttpServletRequest에 포함되어있어서 사용해라
		
		String path = "/WEB-INF/views/signup_result.jsp"; // 경로 지정하기
//		RequestDispatcher dispatcher = req.getRequestDispatcher("경로"); 
		RequestDispatcher dispatcher = req.getRequestDispatcher(path); // "path" -> 애는 그냥 문자. path가 변수임
		
		dispatcher.forward(req, resp); // 지정된JSP로 요청 위임
		
		
		
			
		// ----------------------------------------------------------------------------------------------
		// 여기서 실행
//		resp.setContentType("text/html; charset=utf-8"); // 응답 형식 지정
//		PrintWriter out = resp.getWriter(); // 출력용 스트림 얻어오기
//		StringBuilder sb = new StringBuilder();
//		
//
//	sb.append("<!DOCTYPE html>");
//	sb.append("<html>");
//	
//	sb.append("<head>");
//	sb.append("<title>회원 가입 결과</title>");
//	sb.append("</head>");
//	
//	sb.append("<body>");
//	
//	
//	if(!inputPw.equals(inputPwCheck)) { // 비밀번호 불일치 여부 확인
//		sb.append("<h3>비밀번호가 일치하지 않습니다</h3>");
//	} else if ( Integer.parseInt(inputAge) < 14) {// 나이가 14 미만인지 확인
//		sb.append("<h3>14세 이상만 가입 가능합니다</h3>");
//	} else {
//		sb.append("<h3>가입 성공</h3>");
//		
//		sb.append("<ul>");
//		sb.append(String.format("<li>ID : %s</li>", inputId));
//		sb.append(String.format("<li>PW : %s</li>", inputPw));
//		sb.append(String.format("<li>NAME : %s</li>", inputName));
//		sb.append(String.format("<li>AGE : %s</li>", inputAge));
//		
//		sb.append("</ul>");
//	}
//	sb.append("</body>");
//	sb.append("</html>");
//	out.write(sb.toString());
		//------------------------------------------------------------------------------------------------
		
	}
	
	
}
