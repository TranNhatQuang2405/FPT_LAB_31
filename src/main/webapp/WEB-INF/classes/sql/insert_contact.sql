INSERT INTO Lab_31.CONTACT(
	CONTACT_ID,
	GUEST_NAME_CONTACT,
	EMAIL_CONTACT,
	MESSAGE_CONTACT,
	CREATED_DATE_TIME,
	USER_CREATE,
	ACTIVE_FLAG,
	DELETE_FLAG
)
OUTPUT Inserted.CONTACT_ID
VALUES(
	CAST(Datediff(s, '1970-01-01', GETUTCDATE()) AS VARCHAR),
	?,
	?,
	?,
	GETDATE(),
	?,
	1,
	0
);