package fpt.lab.service;

import fpt.lab.dao.AccessDao;
import fpt.lab.model.req.AccessReq;

public class CommonService {
	public int accessSite(AccessReq accessReq) {
		AccessDao accessDao = new AccessDao();
		return accessDao.accessSite(accessReq);
	}
}
