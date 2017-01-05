package com.alex.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alex.dao.SimpleProductInfoDao;
import com.alex.entity.Simpleproductinfo;
import com.alex.service.SimpleProductInfoService;

@Service("simpleProductInfoService")
public class SimpleProductInfoServiceImpl implements SimpleProductInfoService{

	
	@Resource
	private SimpleProductInfoDao sProductDao ;

	public List<Simpleproductinfo> getSProductInfo() {
		return sProductDao.getAllSimpleProduct();
	}

	public void submitSProductInfo(Simpleproductinfo sProductInfo) {
		Simpleproductinfo entity =  sProductDao.getSProductInfoByID(sProductInfo.getId());
		if(entity == null){
			sProductDao.insertSProductInfo(sProductInfo); //insert 
		}else{
			sProductDao.updateSProductInfo(sProductInfo); //update
		}
		
	}

	public void removeSProductInfo(Simpleproductinfo sProductInfo) {
		sProductDao.removeSProductInfo(sProductInfo);
		
	}

}
