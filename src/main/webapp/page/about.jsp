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
					<div id="right" class="span3">
						<div class="sidebar">
							<div class="wrapper share-box">
								<div class="heading">
									<h4>Share this page</h4>
								</div>

								<div class="content">
									<span>
										<ul>
											<li><a id="share-facebook"
												href="http://us-123-machinery.simplesite.com/423587166#"><i
													class="icon-facebook-sign"></i><span>Share on
														Facebook</span></a></li>
											<li><a id="share-twitter"
												href="http://us-123-machinery.simplesite.com/423587166#"><i
													class="icon-twitter-sign"></i><span>Share on Twitter</span></a>
											</li>
											<li><a id="share-google-plus"
												href="http://us-123-machinery.simplesite.com/423587166#"><i
													class="icon-google-plus-sign"></i><span>Share on
														Google+</span></a></li>
										</ul>
									</span>
								</div>
							</div>
							<div class="wrapper viral-box">
								<div class="heading">
									<h4>Create a website</h4>
								</div>

								<div class="content">
									<p>Everybody can create a website, it's easy.</p>
									<div class="bottom">
										<a rel="nofollow"
											href="http://www.simplesite.com/pages/receive.aspx?partnerkey=123i%3arightbanner&amp;referercustomerid=16328752&amp;refererpageid=423587166"
											class="btn btn-block">Try it for FREE now</a>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- the controller has determined which view to be shown in the content -->

		<div class="container-fluid footer-wrapper" id="footer">
			<!-- this is the Footer Wrapper -->
			<div class="container">
				<div class="footer-info">
					<div class="footer-info-text">This website was created with
						SimpleSite</div>
					<div class="footer-powered-by">
						<a rel="nofollow" href="http://www.simplesite.com/">Get Your
							own FREE website. Click here!</a>
					</div>
				</div>
				<div class="footer-page-counter" style="display: block">
					<span class="footer-page-counter-item">0</span> <span
						class="footer-page-counter-item">0</span> <span
						class="footer-page-counter-item">1</span> <span
						class="footer-page-counter-item">8</span> <span
						class="footer-page-counter-item">7</span> <span
						class="footer-page-counter-item">7</span>
				</div>
				<div id="css_simplesite_com_fallback" class="hide"></div>
			</div>
		</div>
		<!-- this is the Footer content -->
	</div>
</body>

</html>