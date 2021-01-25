<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:set var="root" value="${pageContext.request.contextPath}"/>
<title>방명록 수정</title>
</head>
<body>
	<div align="center">
		<form class="form_style" action="${root }/guest/writeOk.do" method="post">
			<div class="title">
				<label>이름</label>
				<input type="text" name="name" size="12" value="${guestDto.name}"/>
				&nbsp;&nbsp;&nbsp;&nbsp;
				
				<label>비밀번호</label>
				<input type="password" name="password"  size="10" value="${guestDto.password}"/>
			</div>
			
			<div class="content">
				<textarea rows="5" cols="55" name="message">${guestDto.message}</textarea>
			</div>
			
			<div class="title" style="text-align:right;" >
				<input type="submit" value="수정"/>
				<input type="reset" value="취소"/>
			</div>
		</form>
	</div>
</body>
</html>