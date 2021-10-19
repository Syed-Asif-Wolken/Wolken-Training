package com.wolken.syedasif.jdbc.dao;
import com.wolken.syedasif.jdbc.dto.MarketDetailsDTO;

public interface MarketDetailsDAO {
	boolean save(MarketDetailsDTO dto);
	void getByLocation(MarketDetailsDTO dto);
	void getAll();
	boolean updateById(MarketDetailsDTO dto);
	boolean delete(MarketDetailsDTO dto);
}
