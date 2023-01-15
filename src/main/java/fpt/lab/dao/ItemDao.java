package fpt.lab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fpt.lab.config.DatabaseLoader;
import fpt.lab.model.dto.ItemHomeDto;
import fpt.lab.service.LoadFileService;

public class ItemDao{
	public List<ItemHomeDto> selectItemRemain() {
		try {
			Connection connection = DatabaseLoader.getConnection();
			String sql = LoadFileService.getSqlContent("select_remain_item.sql");
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			List<ItemHomeDto> itemHomeDtos = new ArrayList<ItemHomeDto>();
			while (rs.next()) {
				ItemHomeDto itemHomeDto = new ItemHomeDto();
				itemHomeDto.setItemId(rs.getString("ITEM_ID"));
				itemHomeDto.setItemName(rs.getString("ITEM_NAME"));
				itemHomeDto.setImageUrl(rs.getString("IMAGE_URL"));
				itemHomeDto.setShortDescription(rs.getString("SHORT_DESCRIPTION"));
				itemHomeDtos.add(itemHomeDto);
			}
			connection.close();
			return itemHomeDtos;
		} catch (Exception e) {
			return null;
		}
	}
}
