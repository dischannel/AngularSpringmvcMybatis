package com.alex.service.beans;

import java.util.List;

/**
* Created by Alex on 2016-11-08
*@Description simple_product_info Entity
*/ 

public class SimpleProductIOS {
	private String purchase_id;

	private String brand_order;

	private String description;

	private String subcategory_id;

	private String purchase_type;

	private Integer favorites_count;

	private String created_at;

	private String purchase_url;

	private String purchase_status;

	private List<String> image_urls;

	private String updated_at;

	private String price;

	private String brand_id;

	private String is_favorite;

	private String url;

	private String cover_image_url;

	private String post_ids;

	private String category_id;

	private Integer editor_id;
	
	private Integer id;

	private String name;

	public String getPurchase_id() {
		return purchase_id;
	}

	public void setPurchase_id(String purchase_id) {
		this.purchase_id = purchase_id;
	}

	public String getBrand_order() {
		return brand_order;
	}

	public void setBrand_order(String brand_order) {
		this.brand_order = brand_order;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSubcategory_id() {
		return subcategory_id;
	}

	public void setSubcategory_id(String subcategory_id) {
		this.subcategory_id = subcategory_id;
	}

	public String getPurchase_type() {
		return purchase_type;
	}

	public void setPurchase_type(String purchase_type) {
		this.purchase_type = purchase_type;
	}

	public Integer getFavorites_count() {
		return favorites_count;
	}

	public void setFavorites_count(Integer favorites_count) {
		this.favorites_count = favorites_count;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getPurchase_url() {
		return purchase_url;
	}

	public void setPurchase_url(String purchase_url) {
		this.purchase_url = purchase_url;
	}

	public String getPurchase_status() {
		return purchase_status;
	}

	public void setPurchase_status(String purchase_status) {
		this.purchase_status = purchase_status;
	}

	public List<String> getImage_urls() {
		return image_urls;
	}

	public void setImage_urls(List<String> image_urls) {
		this.image_urls = image_urls;
	}
	
	public String getCover_image_url() {
		return cover_image_url;
	}

	public void setCover_image_url(String cover_image_url) {
		this.cover_image_url = cover_image_url;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}

	public String getIs_favorite() {
		return is_favorite;
	}

	public void setIs_favorite(String is_favorite) {
		this.is_favorite = is_favorite;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPost_ids() {
		return post_ids;
	}

	public void setPost_ids(String post_ids) {
		this.post_ids = post_ids;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public Integer getEditor_id() {
		return editor_id;
	}

	public void setEditor_id(Integer editor_id) {
		this.editor_id = editor_id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

