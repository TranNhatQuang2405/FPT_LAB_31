package fpt.lab.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fpt.lab.constant.ParamConstant;
import fpt.lab.constant.PathConstant;
import fpt.lab.model.dto.ItemSaleDto;
import fpt.lab.model.dto.PageContent;
import fpt.lab.service.MachineForSaleService;

@WebServlet(value = PathConstant.MACHINE_FOR_SALE_PATH)
public class MachineForSaleController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doInit(request);
		doGetData(request);
		request.getRequestDispatcher(PathConstant.JSP_MACHINE_FOR_SALE_PATH).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private void doInit(HttpServletRequest request) {
		MachineForSaleService machineForSaleService = new MachineForSaleService();
		PageContent pageContent = machineForSaleService.getPageContent();
		List<Integer> vistorCount = machineForSaleService.getVisitorCount();
		request.setAttribute(ParamConstant.PARAM_DATA, pageContent);
		request.setAttribute(ParamConstant.PARAM_PATH, PathConstant.MACHINE_FOR_SALE_PATH);
		request.setAttribute(ParamConstant.PARAM_FULL_PATH, request.getRequestURL());
		request.setAttribute(ParamConstant.PARAM_VISTOR_COUNT, vistorCount);
	}
	
	private void doGetData(HttpServletRequest request) {
		MachineForSaleService machineForSaleService = new MachineForSaleService();
		List<ItemSaleDto> itemSaleDtos = machineForSaleService.getListItemSale();
		request.setAttribute(ParamConstant.MFS_PARAM_ITEMS, itemSaleDtos);
	}
}
