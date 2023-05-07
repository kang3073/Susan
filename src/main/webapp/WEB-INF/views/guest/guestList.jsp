<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
        <link href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css" rel="stylesheet" />
        <link href="../resources/css/styles.css" rel="stylesheet" />
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js"></script>
</head>
    <body class="sb-nav-fixed">
    <jsp:include page="../main/top.jsp" /> 
        <div id="layoutSidenav">
        	<div id="layoutSidenav_nav">
         <jsp:include page="../main/side.jsp" />
         	</div>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">고객 관리</h1>
						<hr>
                        <div class="card mb-4">
                            <div class="card-body">
<!--                             <div id="productionselect_search"> -->
											<form action="${pageContext.request.contextPath}/guest/seach" method="GET">
												<label>이름 : </label>
												<input type="text" name="wo_num" id="search_wo_num">
												<label>전화 번호 : </label>
												<input type="text" name="manu_name" id="search_manu_name">
<!-- 												<label>품명 : </label> -->
<!-- 												<input type="text" name="item_name" id="search_item_name"> -->
<!-- 												<label> : </label> -->
<!-- 												<input type="date" name="manu_sdate" id="search_manu_sdate"> -->
<!-- 												 - <input type="date" name="manu_date" id="search_manu_date"> -->
<!-- 												<label>작업자 : </label> -->
<!-- 												<input type="text" name="emp_Kname" id="search_emp_Kname"> -->
												<button class="btn btn-primary" type="submit" id="IconButton6">
												조회
												</button>
											</form>
<!-- 										</div> -->
                            </div>
                        </div>
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
                                고객 정보 조회
                                <input type="button" class="btn btn-primary" id="IconButton2" value="신규등록" onclick="insert()">
                            </div>
                            <div class="card-body">
                                <table id="datatablesSimple">
                                    <thead>
                                        <tr>
                                            <th>이름</th>
                                            <th>번호</th>
                                            <th>주소</th>
<!--                                             <th>구매횟수</th> -->
                                        </tr>
                                    </thead>
                                    <tfoot>
                                        <tr>
                                            <th>이름</th>
                                            <th>번호</th>
                                            <th>주소</th>
<!--                                             <th>구매횟수</th> -->
                                        </tr>
                                    </tfoot>
                                    <tbody>
                                    <c:choose>
                                    	<c:when test="${empty customerList }">
                                    		<tr>
                                    		<td colspan="4" align="center">데이터가 없습니다.</td>
                                    		</tr>
                                    	</c:when>
                                    	<c:when test="${!empty customerList }">
                                    		<c:forEach var="cust" items="${customerList}">
                                    		<tr onClick="update();">
                                            	<td class="name">${cust.name}</td>
                                            	<td class="phoneNum">${cust.phoneNum}</td>
                                            	<td class="addr">${cust.addr}</td>
<%--                                             	<td class="count">${cust.count}</td> --%>
                                        	</tr>
                                    		</c:forEach>
                                    	</c:when>
                                    </c:choose>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </main>
                <footer class="py-4 bg-light mt-auto">
					<jsp:include page="../main/footer.jsp" />
                </footer>
            </div>
        </div>
		<script type="text/javascript">	   
			  function insert() 
			  { 
			   window.name = "insert"; 
			   openWin = window.open("${pageContext.request.contextPath}/guest/insert", 
			            "childForm", "width=600, height=300,top=300, left=300, resizable = no, scrollbars = no");   
			  }
			  
			  function update() 
			  { 
			   window.name = "update"; 
			   openWin = window.open("${pageContext.request.contextPath}/guest/update", 
			            "1번가 수산", "width=600, height=300,top=300, left=300, resizable = no, scrollbars = no");   
			  }
		</script>
		
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <script src="../resources/js/scripts.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js"></script>
        <script src="../resources/js/datatables-simple-demo.js"></script>
    </body>
</html>