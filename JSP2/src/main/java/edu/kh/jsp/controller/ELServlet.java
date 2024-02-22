package edu.kh.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/el")
public class ELServlet extends HttpServlet {
//a태그 요청 == GET 방식
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// HttpServlerRequest 객체에 여러 속성 추가
		
		// req.setAttrigbute("K", V); 이용하기
		// K값은 무조건 String, V는 아무거나
		
		// 추가된 속성 값은 위임 받은 jsp에서 ${K} 형태로 작성하면 출력 시 해당 위치에 V가 출력됨
		
		// 기본 자료형
		req.setAttribute("score", 90);
		
		// String
		req.setAttribute("address", "서울시 중구");
		
		// 컬렉션
		List<String> strList = new ArrayList<String>();
		// ArrayList : 배열 모양의 리스트 - 리스트야. 배열 아니고
		
		strList.add("Collection");
		strList.add("List");
		strList.add("Set");
		
		req.setAttribute("strList", strList); 
		
		// DTO
		Book book1 = new Book("해리포터", "조앤케이", 1.8);
		req.setAttribute("book1", book1);
		//------------------------------------------------
		
		
		
		
// --------------------------------------------------forward 실행		
		// forward : 요청 위임
		// 따른 JSP에 넘겨버령
		// -원래 Servlet이 요청받고
		//	결과 화면(HTML)만들어 응답해야 디는데
		//  Java에서 HTML코드 쓰기 힘듬
		// -> JSP에게 요청, 응답 객체 넘겨서 결과화면이랑 응답하게 만듬
		
		// 요청위임 3단계 
		// 1) JSP파일 경로 지정 - 너 어딨냐
		// 2) 요청 발송자 생성 (RequestDispatcher) 요청을 넘겨줄 객체 생성
		// 3) 요청 위임 
		
		String path = "/WEB-INF/views/el/el.jsp"; // 니어딨냐
		RequestDispatcher dispatcher = req.getRequestDispatcher(path); //requestDispatcher로 보내게 객체 만들어
		dispatcher.forward(req, resp); // 요청,응답 보내버령 디스패쳐로 포워드행 req랑 resp
		
	}

}
