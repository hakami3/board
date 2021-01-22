<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"/>
<html>
<head>
	<title>리스트</title>
	<script src="${path}/resources/views/board/js/list.js"></script>

</head>
<style>
	h1 {
		margin : auto;
		text-alian : center;	
	}
	table {
		width : 70%;
		margin : auto;
		text-alian : center;
		border : 1px solid #444444;
	}
</style>
<body>
	<h1>
		글 리스트
	</h1>
	<table>
		<thead>
		<tr>
		<th>번호</th>	
		<th><div>글제목</div></th>
		<th>조회수</th>
		<th>추천수</th>
		<th>반대수</th>
		<th>작성자</th>
		<th>작성일자</th>
		</tr>
		</thead>
		<tbody>
			<c:choose>
				<c:when test="${empty boardList }" >
					<tr><td colspan="5" align="center">데이터가 없습니다.</td></tr>
				</c:when>
				<c:when test="${!empty boardList}">
					<c:forEach var="list" items="${boardList}">
						<tr>
							<td><c:out value="${list.board_id}"/></td>
							<td><a href="detail"><c:out value="${list.title}"/></a></td>
							<td><c:out value="${list.view_cnt}"/></td>
							<td><c:out value="${list.reco_cnt}"/></td>
							<td><c:out value="${list.opst_cnt}"/></td>
							<td><c:out value="${list.insert_user_id}"/></td>							
							<td><c:out value="${list.insert_dtm}"/></td>							
						</tr>
					</c:forEach>
				</c:when>
			</c:choose>
		</tbody>
	</table>
	<a href="create"><button>글쓰기</button></a>
</body>
</html>
