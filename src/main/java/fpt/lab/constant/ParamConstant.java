package fpt.lab.constant;

public class ParamConstant {
	
	//Header
	public static final String HEADER_USER_AGENT = "User-Agent";
	public static final String HEADER_IP = "X-FORWARDED-FOR";
	public static final String HEADER_LOCAL_DOMAIN = "localhost";

	
	//Common
	public static final String PARAM_DATA = "data";
	public static final String PARAM_PATH = "path";
	public static final String PARAM_FULL_PATH = "fullpath";
	public static final String PARAM_VISTOR_COUNT = "vistorCount";
	public static final String PARAM_USER = "user";
	
	//ContactController
	public static final String CONTACT_PARAM_NAME = "name";
	public static final String CONTACT_PARAM_EMAIL= "email";
	public static final String CONTACT_PARAM_MESSAGE = "message";
	public static final String CONTACT_PARAM_ERROR_NAME = "error_name";
	public static final String CONTACT_PARAM_INVALID_EMAIL = "invalid_email";
	public static final String CONTACT_PARAM_ERROR_EMAIL = "error_email";
	public static final String CONTACT_PARAM_ERROR_MESSAGE = "error_message";
	public static final String CONTACT_PARAM_ERROR_CONTACT = "error_contact";
	public static final String CONTACT_PARAM_SUCCESS_CONTACT = "success_contact";

	//MachineForSaleController
	public static final String MFS_PARAM_ITEMS = "items";

	//HomeController
	public static final String HOME_PARAM_SECTIONS = "sections";
	
}
