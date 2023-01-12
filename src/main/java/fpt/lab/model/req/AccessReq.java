package fpt.lab.model.req;

import java.io.Serializable;

public class AccessReq implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String ip;

	private String userAgent;
	
	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	
	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public AccessReq(String ip, String userAgent) {
		super();
		this.ip = ip;
		this.userAgent = userAgent;
	}

	public AccessReq() {
		super();
	}
}
