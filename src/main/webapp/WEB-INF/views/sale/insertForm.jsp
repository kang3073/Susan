<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>1번가 수산 구매 추가</title>
<link href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css" rel="stylesheet" />
<link href="../resources/css/styles.css" rel="stylesheet" />
<script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js"></script>
</head>
<body>
	<div class="contentbody">
		<!--  본문 내용 시작 -->

		<div id="wrap">
			<h3>구매 등록</h3>
			<form action="${pageContext.request.contextPath}/guest/insertPro" id="insert" method="post">
				<fieldset>
					<div class="insert">
						<label>종류</label> 
						<input type="text" name="name" class="name">
						<br>
						<label>수량</label> 
						<input type="text" name="phoneNum" class="phoneNum" placeholder="ex. 010-1111-2222"><br>
						<label>단위</label> 
						<input type="text" name="phoneNum" class="phoneNum" placeholder="ex. 010-1111-2222"><br> 
						<label>가격</label> 
						<input type="text" name="phoneNum" class="phoneNum" placeholder="ex. 010-1111-2222"><br> 
						<label>결제종류</label> 
						<input type="text" name="phoneNum" class="phoneNum" placeholder="ex. 010-1111-2222"><br> 
						<label>전화번호</label> 
						<input type="text" name="phoneNum" class="phoneNum" placeholder="ex. 010-1111-2222"><br> 
						<label>전화번호</label> 
						<input type="text" name="phoneNum" class="phoneNum" placeholder="ex. 010-1111-2222"><br> 
				</fieldset>
				<div id="button" style="text-align: center;">
					<input type="submit" value="등록" class="btn btn-primary">
					<input type="reset" value="취소" class="btn btn-primary">
				</div>
			</form>
		</div>

		<!--  본문내용 끝 -->
	</div>
</body>
</html>