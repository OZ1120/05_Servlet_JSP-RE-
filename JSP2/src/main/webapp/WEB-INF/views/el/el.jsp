<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL</title>
</head>
<body>
	<h2>EL 이용해서 request에 세팅된 속성 얻어와 출력하기</h2>
	
	<ul>
		<li> [작성법] : \${K} </li>
		<li> 기본 자료형 : \${score} </li>
		<li> String(객체) : \${address} </li>
		
		${score}
		${address}
		
		
		<li> 
			List 객체 : ${strList}
			<!-- EL 구문에서는 배열/리스트 관계 없이 요소 하나 얻어올 때
					[index] 사용 -->
			<ul>
				<li>${ strList[0]}</li>
				<li>${ strList[1]}</li>
				<li>${ strList[2]}</li>
			</ul>
	  </li>
	  <li>
	  	DTO : ${book1}
	  	<ul>
	  		<!-- 필드가 여러개있는데... -->
	  		<%-- ${K.필드명} : 객체의 필드값을 얻어오기 위한 getter 호출 --%>
	  		<!-- **** EL을 이용해서 필드 값을 얻어오려면 getter가 필수!! **** -->
	  		<!-- Book.java 에 getter 만들어뒀음 -->
	  		
	  		<li>${book1.title}</li><!-- == book1.getTitle() -->
	  		<li>${book1.writer}</li>
	  		<li>${book1.price}</li>
	  	</ul>
	  </li>
	</ul>
	
	<hr><hr><hr>
	
	
	
	
</body>
</html>