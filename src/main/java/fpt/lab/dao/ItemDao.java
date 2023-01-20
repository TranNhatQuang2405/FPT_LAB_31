package fpt.lab.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import fpt.lab.config.DatabaseLoader;
import fpt.lab.model.dto.ItemHomeDto;
import fpt.lab.model.dto.ItemSaleDto;
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
	
	public List<ItemSaleDto> selectItemForSale() {
		try {
			Connection connection = DatabaseLoader.getConnection();
			String sql = LoadFileService.getSqlContent("select_machine_for_sale.sql");
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			List<ItemSaleDto> itemSaleDtos = new ArrayList<ItemSaleDto>();
			while (rs.next()) {
				ItemSaleDto itemSaleDto = new ItemSaleDto();
				itemSaleDto.setItemId(rs.getString("ITEM_ID"));
				itemSaleDto.setItemName(rs.getString("ITEM_NAME"));
				itemSaleDto.setImageUrl(rs.getString("IMAGE_URL"));
				itemSaleDto.setDescription(rs.getString("DESCRIPTION"));
				itemSaleDtos.add(itemSaleDto);
			}
			connection.close();
			return itemSaleDtos;
		} catch (Exception e) {
			return null;
		}
	}
}
