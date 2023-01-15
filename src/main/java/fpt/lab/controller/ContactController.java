package fpt.lab.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fpt.lab.constant.PathConstant;
import fpt.lab.model.dto.PageContent;
import fpt.lab.service.ContactService;


@WebServlet(value = PathConstant.CONTACT_PATH)
public class ContactController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doInit(request);
		request.getRequestDispatcher(PathConstant.JSP_CONTACT_PATH).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void doInit(HttpServletRequest request) {
		ContactService contactService = new ContactService();
		PageContent pageContent = contactService.getPageContent();
		List<Integer> vistorCount = contactService.getVisitorCount();
		request.setAttribute("data", pageContent);
		request.setAttribute("path", PathConstant.CONTACT_PATH);
		request.setAttribute("fullpath", request.getRequestURL());
		request.setAttribute("vistorCount", vistorCount);
	}

}
