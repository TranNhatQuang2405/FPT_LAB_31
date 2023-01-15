<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><c:out value="${data.title}"/></title>
	<link rel="stylesheet" type="text/css"
		href="<c:url value='/assets/css/about.css'></c:url>">
</head>
<body>
	<div class="container-fluid site-wrapper">
		
		<c:import url="/common/header_navbar.jsp"/>

		<div class="container-fluid content-wrapper" id="content">
			<!-- this is the Content Wrapper -->
			<div class="container">
				<div class="row-fluid content-inner">
					<div id="left" class="span9">
						<!-- ADD "span12" if no sidebar, or "span9" with sidebar -->
						<div class="wrapper ">
							<div class="content">
								<div class="section article">
									<div class="heading">
										<h3>${data.getValue("HOME_BODY.TITLE")}</h3>
									</div>

									<div class="content">
										<p>
											<strong><span style="font-size: 18px;"><span
													data-mce-mark="1">${data.getValue("HOME_BODY.SUBTITLE")}</span></span></strong>
										</p>
										<p>
											<span data-mce-mark="1">${data.getValue("HOME_BODY.DESCRIPTION")}</span>
										</p>
										<div class="img-simple  ">
											<div class="image">
												<a rel="nofollow" data-ss="imagemodal">
													<img src='<c:url value="${data.getValue('HOME_BODY.MAIN_IMAGE_URL')}"/>'>
												</a>
											</div>
										</div>
									</div>
								</div>
								<c:forEach items="${sections}" var="items">
									<div class="section">
										<div class="content">
											<ul class="thumbnails column-article-section">
												<c:forEach items="${items}" var="item">
													<li class="span4">
														<div class="img-simple span12 ">
															<div class="image">
																<a rel="nofollow" data-ss="imagemodal">
																	<img src="<c:url value='${item.imageUrl}'/>">
																</a>
															</div>
														</div>
														<h4>
															<a rel="nofollow" href="<c:url value='${item.itemId}'/>">${item.itemName}</a>
														</h4>
														<p>${item.shortDescription}</p>
													</li>
												</c:forEach>
											</ul>
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