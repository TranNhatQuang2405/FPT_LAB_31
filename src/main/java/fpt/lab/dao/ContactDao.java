package fpt.lab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fpt.lab.config.DatabaseLoader;
import fpt.lab.model.req.ContactReq;
import fpt.lab.service.LoadFileService;

public class ContactDao {
	public boolean contact(ContactReq contactReq) {
		try {
			Connection connection = DatabaseLoader.getConnection();
			String sql = LoadFileService.getSqlContent("insert_contact.sql");
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, contactReq.getName());
			preparedStatement.setString(2, contactReq.getEmail());
			preparedStatement.setString(3, contactReq.getMessage());
			preparedStatement.setString(4, contactReq.getUserId());
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				connection.close();
				return true;
			}
			return false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
}
