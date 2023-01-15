package fpt.lab.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import fpt.lab.constant.NumberResultConstant;
import fpt.lab.constant.PathConstant;
import fpt.lab.dao.ItemDao;
import fpt.lab.model.dto.ItemHomeDto;

public class HomeService extends BaseService{

	public HomeService() {
		this.path = PathConstant.HOME_PATH;
	}
	
	public List<List<ItemHomeDto>> getListItemRemain(){
		ItemDao itemDao = new ItemDao();
		List<ItemHomeDto> itemHomeDtos = itemDao.selectItemRemain();
		int G = NumberResultConstant.LENGTH_ITEM_IN_HOME_PAGE;
		int NG = (itemHomeDtos.size() + G - 1) / G;
		List<List<ItemHomeDto>> result = new ArrayList<>(NG);
		IntStream.range(0, itemHomeDtos.size())
		    .forEach(i -> {
		        if (i % G == 0) {
		            result.add(i/G, new ArrayList<>());
		        }
		        result.get(i/G).add(itemHomeDtos.get(i));
		    });
		return result;
	}
	
}
