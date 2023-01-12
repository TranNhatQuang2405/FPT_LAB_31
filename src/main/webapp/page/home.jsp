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
								<div class="section">
									<div class="content">
										<ul class="thumbnails column-article-section">
											<li class="span4">
												<div class="img-simple span12 ">
													<div class="image">
														<a rel="nofollow" data-ss="imagemodal"
															data-href="http://cdn.simplesite.com/i/30/06/285978582474622512/i285978589337195389._szw1280h1280_.jpg"><img
															src="./Home - us-123-machinery.simplesite.com_files/i285978589337195389._rsw480h360_szw480h360_.jpg"></a>
													</div>
												</div>

												<h4>
													<a rel="nofollow"
														href="http://us-123-machinery.simplesite.com/423587159">Machine1</a>
												</h4>

												<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
													elit</p>
											</li>
											<li class="span4">
												<div class="img-simple span12 ">
													<div class="image">
														<a rel="nofollow" data-ss="imagemodal"
															data-href="http://cdn.simplesite.com/i/30/06/285978582474622512/i285978589337195392._szw1280h1280_.jpg"><img
															src="./Home - us-123-machinery.simplesite.com_files/i285978589337195392._rsw480h360_szw480h360_.jpg"></a>
													</div>
												</div>

												<h4>
													<a rel="nofollow"
														href="http://us-123-machinery.simplesite.com/423587159">Machine2</a>
												</h4>

												<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
													elit</p>
											</li>
											<li class="span4">
												<div class="img-simple span12 ">
													<div class="image">
														<a rel="nofollow" data-ss="imagemodal"
															data-href="http://cdn.simplesite.com/i/30/06/285978582474622512/i285978589337195397._szw1280h1280_.jpg"><img
															src="./Home - us-123-machinery.simplesite.com_files/i285978589337195397._rsw480h360_szw480h360_.jpg"></a>
													</div>
												</div>

												<h4>
													<a rel="nofollow"
														href="http://us-123-machinery.simplesite.com/423587159">Machine3</a>
												</h4>

												<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
													elit</p>
											</li>
										</ul>
									</div>
								</div>
								<div class="section">
									<div class="content">
										<ul class="thumbnails column-article-section">
											<li class="span4">
												<div class="img-simple span12 ">
													<div class="image">
														<a rel="nofollow" data-ss="imagemodal"
															data-href="http://cdn.simplesite.com/i/30/06/285978582474622512/i285978589337195403._szw1280h1280_.jpg"><img
															src="./Home - us-123-machinery.simplesite.com_files/i285978589337195403._rsw480h360_szw480h360_.jpg"></a>
													</div>
												</div>

												<h4>
													<a rel="nofollow"
														href="http://us-123-machinery.simplesite.com/423587159">Machine4</a>
												</h4>

												<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
													elit</p>
											</li>
											<li class="span4">
												<div class="img-simple span12 ">
													<div class="image">
														<a rel="nofollow" data-ss="imagemodal"
															data-href="http://cdn.simplesite.com/i/30/06/285978582474622512/i285978589337195406._szw1280h1280_.jpg"><img
															src="./Home - us-123-machinery.simplesite.com_files/i285978589337195406._rsw480h360_szw480h360_.jpg"></a>
													</div>
												</div>

												<h4>
													<a rel="nofollow"
														href="http://us-123-machinery.simplesite.com/423587159">Machine5</a>
												</h4>

												<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
													elit</p>
											</li>
											<li class="span4">
												<div class="img-simple span12 ">
													<div class="image">
														<a rel="nofollow" data-ss="imagemodal"
															data-href="http://cdn.simplesite.com/i/30/06/285978582474622512/i285978589337195414._szw1280h1280_.jpg"><img
															src="./Home - us-123-machinery.simplesite.com_files/i285978589337195414._rsw480h360_szw480h360_.jpg"></a>
													</div>
												</div>

												<h4>
													<a rel="nofollow"
														href="http://us-123-machinery.simplesite.com/423587159">Machine6</a>
												</h4>

												<p>Lorem ipsum dolor sit amet, consectetuer adipiscing
													elit</p>
											</li>
										</ul>
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
												href="http://us-123-machinery.simplesite.com/#"><i
													class="icon-facebook-sign"></i><span>Share on
														Facebook</span></a></li>
											<li><a id="share-twitter"
												href="http://us-123-machinery.simplesite.com/#"><i
													class="icon-twitter-sign"></i><span>Share on Twitter</span></a>
											</li>
											<li><a id="share-google-plus"
												href="http://us-123-machinery.simplesite.com/#"><i
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
											href="http://www.simplesite.com/pages/receive.aspx?partnerkey=123i%3arightbanner&amp;referercustomerid=16328752&amp;refererpageid=423587158"
											class="btn btn-block">Try it for FREE now</a>
									</div>

								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<c:import url="/common/footer.jsp"/>
	</div>
</body>

</html>