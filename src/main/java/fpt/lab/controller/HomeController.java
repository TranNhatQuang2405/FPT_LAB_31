package fpt.lab.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fpt.lab.constant.ParamConstant;
import fpt.lab.constant.PathConstant;
import fpt.lab.model.dto.ItemHomeDto;
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
		doGetData(request);
		request.getRequestDispatcher(PathConstant.JSP_HOME_PATH).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void doAccess(HttpServletRequest request) throws UnknownHostException {
		HttpSession session = request.getSession();
		String sessionId = session.getId();
		String userAgent = request.getHeader(ParamConstant.HEADER_USER_AGENT);
		String ip = request.getHeader(ParamConstant.HEADER_IP);
		String serverName = request.getServerName();
		if (ip == null || ip.isBlank()) {
			if(serverName.equals(ParamConstant.HEADER_LOCAL_DOMAIN)) {
				InetAddress address = InetAddress.getLocalHost();
				ip = address.getHostAddress();
			}else {
				ip = request.getRemoteAddr();
			}
		}
		AccessReq accessReq = new AccessReq(ip, userAgent, sessionId);
		CommonService commonService = new CommonService();
		commonService.accessSite(accessReq);
	}

	private void doInit(HttpServletRequest request) {
		HomeService homeService = new HomeService();
		PageContent pageContent = homeService.getPageContent();
		List<Integer> vistorCount = homeService.getVisitorCount();
		request.setAttribute(ParamConstant.PARAM_DATA, pageContent);
		request.setAttribute(ParamConstant.PARAM_PATH, PathConstant.HOME_PATH);
		request.setAttribute(ParamConstant.PARAM_FULL_PATH, request.getRequestURL());
		request.setAttribute(ParamConstant.PARAM_VISTOR_COUNT, vistorCount);
	}
	
	private void doGetData(HttpServletRequest request) {
		HomeService homeService = new HomeService();
		List<List<ItemHomeDto>> itemHomeDtos = homeService.getListItemRemain();
		request.setAttribute(ParamConstant.HOME_PARAM_SECTIONS, itemHomeDtos);
	}
}
