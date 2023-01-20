package fpt.lab.filter;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fpt.lab.constant.PathConstant;
import fpt.lab.model.dto.UserDto;
import fpt.lab.model.req.AccessReq;
import fpt.lab.service.CommonService;

@WebFilter(urlPatterns = PathConstant.ALL_PATH)
public class ClientFilter extends HttpFilter {

	private static final long serialVersionUID = 1L;

	public ClientFilter() {
        super();
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		//HttpServletResponse httpServletResponse = (HttpServletResponse)response;
		//doCheckAccess(httpServletRequest, httpServletResponse); 
		chain.doFilter(request, response);
	}

	@SuppressWarnings("unused")
	private void doCheckAccess(HttpServletRequest request, HttpServletResponse response) throws UnknownHostException {
		HttpSession session = request.getSession();
		UserDto user = (UserDto) session.getAttribute("user");
		String sessionId = session.getId();
		String userAgent = request.getHeader("User-Agent");
		String ip = request.getHeader("X-FORWARDED-FOR");
		String serverName = request.getServerName();
		if (ip == null || "".equals(ip)) {
			if(serverName.equals("localhost")) {
				InetAddress address = InetAddress.getLocalHost();
				ip = address.getHostAddress();
			}else {
				ip = request.getRemoteAddr();
			}
		}
		AccessReq accessReq = new AccessReq(ip, userAgent, sessionId);
		CommonService commonService = new CommonService();
		if(user != null) {
			accessReq.setUserId(user.getUserId());
		}
		commonService.accessSite(accessReq);
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
