package com.alex.service;

import java.util.List;

import com.alex.entity.Firstpagecateinfo;
import com.alex.service.beans.FirstPageCateBean;

public interface FirstPageCateInfoService {
	
	public List<Firstpagecateinfo> getFPageCateInfo();
	public void submitFPageCateInfo(Firstpagecateinfo fPageCateBean);
	public void removeFPageCateInfo(Firstpagecateinfo fPageCateInfo);

}
