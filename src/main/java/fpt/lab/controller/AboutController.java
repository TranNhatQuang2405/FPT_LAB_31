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
import fpt.lab.service.AboutService;

@WebServlet(value = PathConstant.ABOUT_PATH)
public class AboutController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doInit(request);

		request.getRequestDispatcher(PathConstant.JSP_ABOUT_PATH).forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	private void doInit(HttpServletRequest request) {
		AboutService aboutService = new AboutService();
		PageContent pageContent = aboutService.getPageContent();
		List<Integer> vistorCount = aboutService.getVisitorCount();
		request.setAttribute("data", pageContent);
		request.setAttribute("path", PathConstant.HOME_PATH);
		request.setAttribute("fullpath", request.getRequestURL());
		request.setAttribute("vistorCount", vistorCount);
	}

}
