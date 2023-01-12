<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="title-wrapper">
	<div class="title-wrapper-inner">
		<a rel="nofollow" class="logo" href="<c:url value='${data.getValue("FOOTER.TITLE")}'></c:url>"> </a>
		<div class="title">${data.getValue("FOOTER.TITLE")}</div>
		<div class="subtitle">${data.getValue("FOOTER.DESCRIPTION")}</div>
	</div>
</div>

