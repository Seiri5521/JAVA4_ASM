package com.poly.Service;

import com.poly.Storage.ProductLikedInfo;

import java.util.List;

import com.poly.Dao.StatsDAO;
import com.poly.Dao.Implement.StatsDAOImpl;

public class StatsServiceImpl implements StatsService {

	private StatsDAO statsDAO;

	public StatsServiceImpl() {
		statsDAO = new StatsDAOImpl();
	}

	@Override
	public List<ProductLikedInfo> findProductLikedInfo() {
		//Goi ham Dao tao de su dung

		return statsDAO.findProductLikedInfo();
	}
}
