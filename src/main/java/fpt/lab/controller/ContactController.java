package fpt.lab.controller;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fpt.lab.constant.MessageConstant;
import fpt.lab.constant.ParamConstant;
import fpt.lab.constant.PathConstant;
import fpt.lab.constant.PatternConstant;
import fpt.lab.model.dto.PageContent;
import fpt.lab.model.req.ContactReq;
import fpt.lab.service.ContactService;

@WebServlet(value = PathConstant.CONTACT_PATH)
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile(PatternConstant.PATTERN_EMAIL,
			Pattern.CASE_INSENSITIVE);

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doInit(request);
		request.getRequestDispatcher(PathConstant.JSP_CONTACT_PATH).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doInit(request);
		ContactReq contactReq = doValidate(request, response);
		if (contactReq != null) {

		}
		request.getRequestDispatcher(PathConstant.JSP_CONTACT_PATH).forward(request, response);
	}

	private void doInit(HttpServletRequest request) {
		ContactService contactService = new ContactService();
		PageContent pageContent = contactService.getPageContent();
		List<Integer> vistorCount = contactService.getVisitorCount();
		request.setAttribute(ParamConstant.PARAM_DATA, pageContent);
		request.setAttribute(ParamConstant.PARAM_PATH, PathConstant.CONTACT_PATH);
		request.setAttribute(ParamConstant.PARAM_FULL_PATH, request.getRequestURL());
		request.setAttribute(ParamConstant.PARAM_VISTOR_COUNT, vistorCount);
	}

	private ContactReq doValidate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter(ParamConstant.CONTACT_PARAM_NAME);
		String email = request.getParameter(ParamConstant.CONTACT_PARAM_EMAIL);
		String message = request.getParameter(ParamConstant.CONTACT_PARAM_MESSAGE);
		boolean check = true;
		if (name == null || name.isBlank()) {
			request.setAttribute(ParamConstant.CONTACT_PARAM_ERROR_NAME, MessageConstant.EMPTY_FIELD);
			check = false;
		}
		if (email == null || email.isBlank() ) {
			request.setAttribute(ParamConstant.CONTACT_PARAM_ERROR_EMAIL, MessageConstant.EMPTY_FIELD);
			check = false;
		}else {
			Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
			if(!matcher.matches()) {
				request.setAttribute(ParamConstant.CONTACT_PARAM_ERROR_EMAIL, MessageConstant.EMAIL_INCORRECT);
				check = false;
			}
		}
		if (message == null || message.isBlank()) {
			request.setAttribute(ParamConstant.CONTACT_PARAM_ERROR_MESSAGE, MessageConstant.EMPTY_FIELD);
			check = false;
		}
		if (check == false) {
			request.setAttribute(ParamConstant.CONTACT_PARAM_NAME, name);
			request.setAttribute(ParamConstant.CONTACT_PARAM_EMAIL, email);
			request.setAttribute(ParamConstant.CONTACT_PARAM_MESSAGE, message);
			return null;
		}
		ContactReq contactReq = new ContactReq(name, email, message);
		return contactReq;
	}

}
