<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><c:out value="${data.title}"/></title>
	<link rel="stylesheet" type="text/css"
		href="<c:url value='/assets/css/machine.css'></c:url>">
</head>
<body>
    <div class="container-fluid site-wrapper"> <!-- this is the Sheet -->
    	<c:import url="/common/header_navbar.jsp"/>
        <div class="container-fluid content-wrapper" id="content"> <!-- this is the Content Wrapper -->
            <div class="container">
                <div class="row-fluid content-inner">
                    <div id="left" class="span9"> <!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
                        <div class="wrapper ">
                            <div class="content">
                            	<c:if test="${fn:length(items) == 0}">
                            		<div class="section article">
                            			<div class="heading">
	                                        <h3>${data.getValue("MACHINE_FOR_SALE_BODY.TITLE")}</h3>
	                                    </div>
                            		</div>
                            	</c:if>
								<c:forEach items="${items}" var="item" varStatus="loop">
									<div class="section article">
										<c:if test="${loop.index == 0}">
											<div class="heading">
		                                        <h3>${data.getValue("MACHINE_FOR_SALE_BODY.TITLE")}</h3>
		                                    </div>
										</c:if>
	                                    <div class="content">
	                                        <div class="img-simple span3 pull-left">
	                                            <div class="image">
	                                                <a rel="nofollow" data-ss="imagemodal">
	                                                	<img src="<c:url value='${item.imageUrl}'/>">
	                                                </a>
	                                            </div>
	                                        </div>
	                                        <p><span style="font-size: 24px;">${item.itemName}</span></p>
	                                        <p><span>${item.description}</span></p>
	                                    </div>
	                                </div>
								</c:forEach>
                           
                            </div>
                        </div>
                    </div>

                	<c:import url="/common/rightbar.jsp"/>
                </div>
            </div>
        </div>
		<c:import url="/common/footer.jsp"/>
    </div>
</body>
</html>