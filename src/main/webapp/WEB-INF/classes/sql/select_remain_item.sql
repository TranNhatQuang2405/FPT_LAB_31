SELECT 
	I.ITEM_ID,
	I.ITEM_NAME,
	I.IMAGE_URL,
	I.SHORT_DESCRIPTION
FROM Lab_31.ITEM I
WHERE I.DELETE_FLAG = 0
	AND I.REMAIN_QUANTITY > 0
	AND I.ACTIVE_FLAG = 1