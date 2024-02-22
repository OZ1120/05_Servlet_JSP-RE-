<%@page import="org.apache.jasper.tagplugins.jstl.core.If"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    
    <%-- JSP 전용 주석 
	1) JSP에 작성된 Java코드 주석 처리시 시용
	2) JSP 전용 주석은 컴파일 단계에서 걸러지기 때문에 
		 응답 화면(브라우저)에서 볼 수 없음
		 자동완성 없어...
--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 결과</title>
</head>
<body>
	<h2>회원가입 결과 페이지</h2>
	
	<%-- 
		request 변수 == 전달받은 HttpServletRequest 객체 참조변수
	<% %> 스크립틀릿 jsp에서 자바 코드 작성 태그
	
	<%= %> Expression(표현식) JSP에서 자바값 html화면 출력 태그
	
	--%>
	
	<% // 파라미터 얻기
		String inputId = request.getParameter("inputId");
		String inputPw = request.getParameter("inputPw");
		String inputPwCheck = request.getParameter("inputPwCheck");
		String inputName = request.getParameter("inputName");
		String inputAge = request.getParameter("inputAge");
	%>
	
 	<%-- 
	<%=inputId %>
	<%=inputPw %>
	<%=inputPwCheck %>
	<%=inputName %>
	<%=inputAge %> --%>
	
	
	<% if(!inputPw.equals(inputPwCheck)) { %>
	<h3>비밀번호가 일치하지 않습니다</h3>
		
	<% } else if (Integer.parseInt(inputAge) < 14) { %>	
		<h3>14세 이상만 가입 가능합니다</h3>
		
	<% } else { %>
		<h3>가입 성공</h3>
		<ul>
			<li>ID 	 : <%= inputId %></li>
			<li>PW 	 : <%= inputPw %></li>
			<li>NAME : <%= inputName %></li>
			<li>AGE  : <%= inputAge %></li>
		</ul>
	<% } %>
	
	
	

</body>
</html>