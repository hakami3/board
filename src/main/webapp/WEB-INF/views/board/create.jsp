<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <script src='https://code.jquery.com/jquery-3.1.0.min.js'></script>
    <script>
    $(function(){
    	$('#btn').on('click',function(){
    		var title   = $('#form_title').val();
    		var content = $('#form_content').val();
    		$.ajax({
    			url: './create/dtl',
    			async :true,
    			type:'POST',
    			datatype:'text',
    			data: {
    				title : title, 
    				content : content    				
    			},
    			success: function(data){
    				alert("글쓰기 완료!");
    				location.href = '/board/list';
    			},
    			error:function(jqXHR){
    				alert("ERROR");
    			}
			
    		});
    	})
    })
    </script>
	<title>글쓰기</title>
</head>
<body>
<h1>
	글쓰기
</h1>
    <form method="post" id="subForm" name="boardForm" enctype="multipart/form-data">
    <table width="700" border="3" bordercolor="lightgray" align="center">
            <tr>
            <td id="title">
                제 목
            </td>
            <td>
                <input name="title" id="form_title" type="text" size="30" maxlength="30" value=""/>
            </td>        
        </tr>
        <tr>
            <td id="title">
                내 용
            </td>
            <td>
                <textarea name="content" id="form_content" cols="72" rows="20"></textarea>            
            </td>        
        </tr>
        <tr align="center" valign="middle">
            <td colspan="5">
                <input type="reset"  value="작성취소" />
                <input type="button" id ="btn" value="등록" />
                <input type="button" onclick="btn1_click();" value="목록"/>            
            </td>
        </tr>
    </table>    
    </form>
	<script>
		function btn1_click() {
			location.href = "./list";
		}
	</script>
</body>
</html>
