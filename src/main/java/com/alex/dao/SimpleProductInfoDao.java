package com.alex.dao;

import java.util.List;

import com.alex.entity.Simpleproductinfo;

public interface SimpleProductInfoDao {
	
	public List<Simpleproductinfo> getAllSimpleProduct();
	
	public Simpleproductinfo getSProductInfoByID(int ID);
	public void insertSProductInfo(Simpleproductinfo sProductInfo);
	public void updateSProductInfo(Simpleproductinfo sProductInfo);
	public void removeSProductInfo(Simpleproductinfo sProductInfo) ;

}
