<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <title>CampStory 메인페이지</title>
    

</head>
<body>
<%@ include file = "include/header.jsp" %>
    <div class="main_intro">
    	<br/>
       <div class="introbox" id="intbox">캠핑을 위한 모든 이야기<br/>Camp Story
       
       
       </div>
       <br/>
       <div class ="search_keyword" id="mainsearch">
	<form action="camp/klist" method="get">
		<input type="text" id="searchbar" name="keyword" placeholder="지역명 / 캠핑장 명을 검색 해 주세요"/>
		<input type="image" src="../resources/camp/images/search.png" id = "searchbtn" value="submit" name="submit" />
	</form>
	<div id="kwordList">
		<c:forEach var="keywordlist" items="${keywordlist }">
		<a href = "/camp/klist?keyword=${keywordlist.keyword}" class="mainkeyword"># ${keywordlist.keyword}</a>
		</c:forEach>
	
	</div>
	</div>
       <div id="mainlogo">
       <img src="https://i.ibb.co/G2kJKb2/logo-campstory.png" width="300px" height="250px" />
       </div>

    </div>
	

</body>
</html>