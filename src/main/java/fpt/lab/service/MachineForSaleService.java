package fpt.lab.service;

import java.util.List;

import fpt.lab.constant.PathConstant;
import fpt.lab.dao.ItemDao;
import fpt.lab.model.dto.ItemSaleDto;

public class MachineForSaleService extends BaseService{

	public MachineForSaleService() {
		this.path = PathConstant.MACHINE_FOR_SALE_PATH;
	}
	
	public List<ItemSaleDto> getListItemSale(){
		ItemDao itemDao = new ItemDao();
		return itemDao.selectItemForSale();
	}

}
