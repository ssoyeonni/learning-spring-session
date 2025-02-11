<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h3>
		2번 문제. 1번에서 출력한 세션 cust의 id, name, age를 수정해서 재출력하세요.
	</h3>
	기존 1번 문제: Customer2(id=tester, name=fisaman, age=30)
	<br><br>
	
	<!-- 2번 문제 -->
	답: ${sessionScope.cust}
</body>
</html>