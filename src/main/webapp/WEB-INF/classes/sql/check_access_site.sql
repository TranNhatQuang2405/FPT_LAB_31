SELECT A.SESSION_ID 
FROM Lab_31.ACCESS A
WHERE A.IP = ?
	AND A.USER_AGENT = ?
	AND A.SESSION_ID = ?
	AND A.DELETE_FLAG = 0