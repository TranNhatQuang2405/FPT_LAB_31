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
import fpt.lab.model.req.AccessReq;
import fpt.lab.service.CommonService;
import fpt.lab.service.HomeService;

@WebServlet(value = PathConstant.HOME_PATH)
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doAccess(request);
		doInit(request);
		request.getRequestDispatcher(PathConstant.JSP_HOME_PATH).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void doAccess(HttpServletRequest request) {
		String userAgent = request.getHeader("User-Agent");
		String ip = request.getHeader("X-FORWARDED-FOR");
		if (ip == null || "".equals(ip)) {
			ip = request.getRemoteAddr();
		}
		AccessReq accessReq = new AccessReq(ip, userAgent);
		CommonService commonService = new CommonService();
		commonService.accessSite(accessReq);
	}

	private void doInit(HttpServletRequest request) {
		HomeService homeService = new HomeService();
		PageContent pageContent = homeService.getPageContent();
		List<Integer> vistorCount = homeService.getVisitorCount();
		request.setAttribute("data", pageContent);
		request.setAttribute("path", PathConstant.HOME_PATH);
		request.setAttribute("vistorCount", vistorCount);
	}

}
