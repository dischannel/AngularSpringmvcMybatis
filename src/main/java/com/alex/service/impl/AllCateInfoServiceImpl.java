package com.alex.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alex.dao.AllCateInfoDao;
import com.alex.entity.Allcateinfo;
import com.alex.service.AllCateInfoService;

@Service("allCateInfoService")
public class AllCateInfoServiceImpl implements AllCateInfoService{

	
	@Resource
	private AllCateInfoDao cateDao ;

	public List<Allcateinfo> getAllCateInfo() {
		// TODO Auto-generated method stub
		return cateDao.getAllCateInfo();
	}

}
