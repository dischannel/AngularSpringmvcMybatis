package com.alex.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alex.dao.FirstPageCateInfoDao;
import com.alex.entity.Firstpagecateinfo;
import com.alex.service.FirstPageCateInfoService;
import com.alex.service.beans.FirstPageCateBean;

@Service("firstPageCateInfoService")
public class FirstPageCateInfoServiceImpl implements FirstPageCateInfoService{

	
	@Resource
	private FirstPageCateInfoDao fPageCateDao ;

	public List<Firstpagecateinfo> getFPageCateInfo() {
		return fPageCateDao.getAllFPageCateInfo();
	}
	
	public void submitFPageCateInfo(Firstpagecateinfo fPageCateBean) {
		Firstpagecateinfo entity =  fPageCateDao.getFPageCateInfoByID(fPageCateBean.getId());
		List<Firstpagecateinfo> entityResult = new ArrayList<Firstpagecateinfo>();
		if(entity == null){
			fPageCateDao.insertFPageCateInfo(fPageCateBean); //insert 
		}else{
			fPageCateDao.updateFPageCateInfo(fPageCateBean); //update
		}
	}
	
	public void removeFPageCateInfo(Firstpagecateinfo fPageCate){
		fPageCateDao.removeFPageCateInfo(fPageCate);
	}
	
	private Firstpagecateinfo convertToEntity(Firstpagecateinfo bean, boolean ignoreId){
		Firstpagecateinfo entity = new Firstpagecateinfo();
		entity.setEditable(bean.getEditable());
		if(ignoreId){
			entity.setId(bean.getId());
		}
		entity.setName(bean.getName());
		return entity;
	}
	private FirstPageCateBean convertToBean(Firstpagecateinfo entity){
		FirstPageCateBean bean = new FirstPageCateBean();
		bean.setEditable(entity.getEditable());
		bean.setId(entity.getId());
		bean.setName(entity.getName());
		return bean;
	}
	
	private List<FirstPageCateBean> convertToBeanList(List<Firstpagecateinfo> entitys){
		List<FirstPageCateBean> result = new ArrayList<FirstPageCateBean>();
		for(Firstpagecateinfo ent: entitys){
			FirstPageCateBean bean = new FirstPageCateBean();
			bean = convertToBean(ent);
			result.add(bean);
		}
		
		return result;
	}

}
