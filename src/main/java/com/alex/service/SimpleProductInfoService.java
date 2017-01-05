package com.alex.service;

import java.util.List;

import com.alex.entity.Simpleproductinfo;

public interface SimpleProductInfoService {
	
	public List<Simpleproductinfo> getSProductInfo();
	public void submitSProductInfo(Simpleproductinfo sProductInfo);
	public void removeSProductInfo(Simpleproductinfo sProductInfo);

}
