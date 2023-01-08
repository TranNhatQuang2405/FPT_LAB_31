package fpt.lab.service;

import fpt.lab.dao.PageDao;
import fpt.lab.model.PageContent;

public class BaseService {
	protected String path;
	
	public PageContent getPageContent() {
		PageDao pageDao = new PageDao();
		return pageDao.selectPageContent(this.path);
	}
}
