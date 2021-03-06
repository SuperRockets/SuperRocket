<%@ page contentType = "text/html;charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
	<title>index</title>
	<jsp:include page="/WEB-INF/views/common/resCommon.jsp"></jsp:include>
	<script type="text/javascript">
		$(document).ready(function(){
			$("#btn01").click(function(){
				goHome();
			});
			
			$("#btn02").click(function(){
				restTest();
			});
			
			$("#btn03").click(function(){
				restDbInsertTest();
			});
		});
	
		function restTest(){
			var form = {
			    name : "111"
			};
			
			 $.ajax({
			     url: "http://localhost:8080/restTest",
			     method: "post",
			     type: "json",
			     contentType: "application/json",
			     data: JSON.stringify(form),
			     error: function(e){
			    	alert("에러"); 
			     },
			     success: function(data) {
			         console.log(data);
			         alert(data);
			     }
			 });
		}
		
		function restDbInsertTest(){
			if($.trim($("#name").val()) == ""){
				alert("아무거나 입력해라.");
				$("#name").focus();
			}
			
			alert($("#name").val());
			
			var form = {
			     name: $("#name").val(),
			};
			
			$.ajax({
			     url: "http://localhost:8080/restDbInsertTest",
			     method: "post",
			     type: "json",
			     contentType: "application/json",
			     data: JSON.stringify(form),
			     error: function(e){
			    	alert("에러"); 
			     },
			     success: function(data) {
			         console.log(data);
			     }
			 });
		}
		
		function goHome(){
			$("#testForm").submit();
		}
	</script>
</head>
<body>
<form id="testForm" name="testForm" method="post" action="/home"></form>
<h1></h1>
	<button id="btn01">일반적인 Spring 컨트롤러 호출 테스트</button><br/>
	* 일반적인 호출 <br/>
	클릭 > controller > service > dao > DB > jsp
	<br/>
	<br/>
	<button id="btn02">Restful 컨트롤러 호출 테스트</button><br/>
	*rest 호출<br/>
	클릭 > controller > service > dao > DB > json object
	<br/>
	<br/>
	<input type="text" name="name" id="name" />
	<button id="btn03" class="btn btn-ttc">Restful 인서트 테스트</button> *부트스트랩 적용 버튼<br/>
	*rest 호출<br/>
	클릭 > controller > service > dao > DB > json object
	<br/>
	<br/>
	<a href="http://bootstrapk.com/BS3/getting-started" target="_blank">부트스트랩 시작하기 페이지</a>
</body>
</html>
