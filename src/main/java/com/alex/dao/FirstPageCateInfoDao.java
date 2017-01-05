package com.alex.dao;

import java.util.List;

import com.alex.entity.Firstpagecateinfo;

public interface FirstPageCateInfoDao {
	
	public List<Firstpagecateinfo> getAllFPageCateInfo();
	public Firstpagecateinfo getFPageCateInfoByID(int ID);
	public void insertFPageCateInfo(Firstpagecateinfo fPageCate);
	public void updateFPageCateInfo(Firstpagecateinfo fPageCate);
	public void removeFPageCateInfo(Firstpagecateinfo fPageCate) ;

}
