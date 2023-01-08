package fpt.lab.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fpt.lab.constant.PathConstant;
import fpt.lab.model.PageContent;
import fpt.lab.service.HomeService;

@WebServlet(value = PathConstant.HOME_PATH)
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HomeService homeService = new HomeService();
		PageContent pageContent = homeService.getPageContent();
		request.setAttribute("data", pageContent);
		request.getRequestDispatcher("/page/home.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
