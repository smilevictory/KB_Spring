<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "초기화면" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

<h4>form 태그의 method 속성을 get으로 설정</h4>
<form action="service-test" method="get">
    <input type="submit" value="GET방식 요청 전송">
</form>
<h4>form 태그의 method 속성을 post으로 설정</h4>
<form action="service-test" method="post">
    <input type="submit" value="POST방식 요청 전송">
</form>

</body>
</html>