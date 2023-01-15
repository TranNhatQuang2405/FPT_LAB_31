<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8" />
<title><c:out value="${data.title}" /></title>
<link rel="stylesheet" type="text/css"
	href="<c:url value='/assets/css/home.css'></c:url>" />
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
						<div class="wrapper">
							<div class="content">
								<div class="section article">
									<div class="heading">
										<h3>${data.getValue("ABOUT_BODY.TITLE")}</h3>
									</div>

									<div class="content">
										<div class="img-simple span6 pull-right">
											<div class="image">
												<a rel="nofollow" data-ss="imagemodal">
													<img src="<c:url value="${data.getValue('ABOUT_BODY.MAIN_IMAGE_URL')}"/>" />
												</a>
											</div>
										</div>
										<div class="country">
											<p>
												<span>${data.getValue("ABOUT_BODY.DESCRIPTION")}</span>
											</p>
										</div>
									</div>
								</div>
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