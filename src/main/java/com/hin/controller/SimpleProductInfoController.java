package com.hin.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alex.entity.Firstpagecateinfo;
import com.alex.entity.Simpleproductinfo;
import com.alex.service.FirstPageCateInfoService;
import com.alex.service.SimpleProductInfoService;
import com.alex.service.beans.FirstPageCateBean;
import com.alex.service.beans.SimpleProductIOS;

@Controller
@RequestMapping("/sprod")
public class SimpleProductInfoController {

	@Resource
	private SimpleProductInfoService sProductService;
	
	@RequestMapping("/simpleprod.json")
    public @ResponseBody List<Simpleproductinfo> getSProductInfoList() {
        return (sProductService.getSProductInfo());
    }

	@RequestMapping("/simpleprodios.json")
    public @ResponseBody List<SimpleProductIOS> getSProductInfoios() {
		List<Simpleproductinfo> entitys = new ArrayList<Simpleproductinfo>();
         entitys = sProductService.getSProductInfo();
         return convertToBeans(entitys);
    }
	
    @RequestMapping(value = "/submitinfo", method = RequestMethod.POST)
    public @ResponseBody void submitInfo(@RequestBody Simpleproductinfo sprod,
            HttpServletRequest request) {
    	sProductService.submitSProductInfo(sprod);
    }
    
    @RequestMapping(value = "/removeinfo", method = RequestMethod.POST)
    public @ResponseBody void removeInfo(@RequestBody Simpleproductinfo sprod,
            HttpServletRequest request) {
    	sProductService.removeSProductInfo(sprod);
    }

	private List<SimpleProductIOS> convertToBeans(List<Simpleproductinfo> entitys){
		List<SimpleProductIOS> beans = new ArrayList<SimpleProductIOS>();
		for (Simpleproductinfo entity: entitys){
			SimpleProductIOS bean = new SimpleProductIOS();
			bean.setBrand_id(entity.getBrandId());
			bean.setBrand_order(entity.getBrandOrder());
			bean.setCategory_id(entity.getCategoryId());
			bean.setCover_image_url(entity.getCoverImageUrl());
			bean.setCreated_at(entity.getCreatedAt());
			bean.setDescription(entity.getDescription());
			bean.setEditor_id(entity.getEditorId());
			bean.setFavorites_count(entity.getFavoritesCount());
			bean.setId(entity.getId());
			bean.setImage_urls(Arrays.asList(entity.getImageUrls().split(",")));
			bean.setIs_favorite(entity.getIsFavorite());
			bean.setName(entity.getName());
			bean.setPost_ids(entity.getPostIds());
			bean.setPrice(entity.getPrice());
			bean.setPurchase_id(entity.getPurchaseId());
			bean.setPurchase_status(entity.getPurchaseStatus());
			bean.setPurchase_type(entity.getPurchaseType());
			bean.setPurchase_url(entity.getPurchaseUrl());
			bean.setSubcategory_id(entity.getSubcategoryId());
			bean.setUpdated_at(entity.getUpdatedAt());
			bean.setUrl(entity.getUrl());
			beans.add(bean);
		}
		return beans;
	}
}
