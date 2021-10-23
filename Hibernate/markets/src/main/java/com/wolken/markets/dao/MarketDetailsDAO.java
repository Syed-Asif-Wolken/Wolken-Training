package com.wolken.markets.dao;

import com.wolken.markets.entity.MarketDetails;

public interface MarketDetailsDAO {
	public String save(MarketDetails details);
	public String update(MarketDetails details);
	public void getById(int id);
	public String delete(int id);
}
