package fpt.lab.model.req;

import java.io.Serializable;

public class ContactReq implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String email;
	private String message;
	private String userId;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public ContactReq(String name, String email, String message, String userId) {
		super();
		this.name = name;
		this.email = email;
		this.message = message;
		this.userId = userId;
	}
	public ContactReq(String name, String email, String message) {
		this.name = name;
		this.email = email;
		this.message = message;
	}
	public ContactReq() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
