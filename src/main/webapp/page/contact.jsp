<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><c:out value="${data.title}" /></title>
<link rel="stylesheet" type="text/css"
	href="<c:url value='/assets/css/contact.css'></c:url>" />
</head>
<body>

	<div class="container-fluid site-wrapper">
		<c:import url="/common/header_navbar.jsp" />

		<div class="container-fluid content-wrapper" id="content">
			<!-- this is the Content Wrapper -->
			<div class="container">
				<div class="row-fluid content-inner">
					<div id="left" class="span9">
						<div class="wrapper contact">
							<div class="heading">
								<h1 class="page-title">${data.getValue("CONTACT_BODY.TITLE")}</h1>
							</div>

							<div class="content">
								<div class="section">
									<div class="content">
										<div class="span12 contact-text">
											<h4>${data.getValue("CONTACT_BODY.SUBTITLE")}</h4>
											<p>
												${data.getValue("CONTACT_BODY.ADDRESS")}
												<br />
												${data.getValue("CONTACT_BODY.CITY")}
												<br />
												${data.getValue("CONTACT_BODY.COUNTRY")}
											</p>
											<p>
												${data.getValue("CONTACT_BODY.TEL")}
												<br />
												${data.getValue("CONTACT_BODY.EMAIL")}
											</p>
										</div>
									</div>
								</div>

								<div class="section contact-form">
									<div class="content">
										<div class="alert alert-success hide">${data.getValue("CONTACT_BODY.THANKS_MESSAGE")}</div>
										<p>${data.getValue("CONTACT_BODY.SEND_EMAIL_TITLE")}</p>
										<form>
											<fieldset>
												<div class="row-fluid">
													<div class="span6">
														<input type="text" placeholder='${data.getValue("CONTACT_BODY.NAME_PLACEHONDER")}' />
														<span class="help-block"></span>
													</div>
													<div class="span6">
														<input type="text"
															placeholder='${data.getValue("CONTACT_BODY.EMAIL_PLACEHONDER")}' /> 
													    <span class="help-block"></span>
													</div>
												</div>
												<div class="row-fluid">
													<div class="span12">
														<textarea name="text" placeholder='${data.getValue("CONTACT_BODY.MESSAGE_PLACEHONDER")}'></textarea>
													    <span class="help-block"></span>
													</div>
												</div>
												<div class="row-fluid">
													<div class="span12">
														<button class="btn btn-primary pull-right" type="submit">
															${data.getValue("CONTACT_BODY.BTN_SEND")}
														</button>
													</div>
												</div>
											</fieldset>
										</form>
									</div>
								</div>
							</div>
						</div>
					</div>
					<c:import url="/common/rightbar.jsp"/>
				</div>
			</div>
		</div>
		<c:import url="/common/footer.jsp" />

	</div>
</body>
</html>