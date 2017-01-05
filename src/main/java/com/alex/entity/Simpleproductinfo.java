package com.alex.entity;

import java.util.Date;

/**
* Created by Alex on 2016-11-08
*@Description simple_product_info Entity
*/ 
import javax.persistence.*;
@Table(name="simple_product_info")
@Entity(name="simple_product_info")


public class Simpleproductinfo{
@Column(name="purchase_id",length=10)
	private String purchaseId;

@Column(name="brand_order",length=10)
	private String brandOrder;

@Column(name="description",length=1000)
	private String description;

@Column(name="subcategory_id",length=10)
	private String subcategoryId;

@Column(name="purchase_type",length=10)
	private String purchaseType;

@Column(name="favorites_count",length=10)
	private Integer favoritesCount;

@Column(name="created_at",length=20)
	private String createdAt;

@Column(name="purchase_url",length=100)
	private String purchaseUrl;

@Column(name="purchase_status",length=2)
	private String purchaseStatus;

@Column(name="image_urls",length=100)
	private String imageUrls;

@Column(name="updated_at",length=20)
	private String updatedAt;

@Column(name="price",length=20)
	private String price;

@Column(name="brand_id",length=10)
	private String brandId;

@Column(name="is_favorite",length=2)
	private String isFavorite;

@Column(name="url",length=100)
	private String url;

@Column(name="cover_image_url",length=100)
	private String coverImageUrl;

@Column(name="post_ids",length=10)
	private String postIds;

@Column(name="category_id",length=10)
	private String categoryId;

@Column(name="editor_id",length=10)
	private Integer editorId;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id",length=10)
	private Integer id;

@Column(name="name",length=100)
	private String name;

	public void setPurchaseId(String purchaseId){
	this.purchaseId=purchaseId;
	}
	public String getPurchaseId(){
		return purchaseId;
	}
	public void setBrandOrder(String brandOrder){
	this.brandOrder=brandOrder;
	}
	public String getBrandOrder(){
		return brandOrder;
	}
	public void setDescription(String description){
	this.description=description;
	}
	public String getDescription(){
		return description;
	}
	public void setSubcategoryId(String subcategoryId){
	this.subcategoryId=subcategoryId;
	}
	public String getSubcategoryId(){
		return subcategoryId;
	}
	public void setPurchaseType(String purchaseType){
	this.purchaseType=purchaseType;
	}
	public String getPurchaseType(){
		return purchaseType;
	}
	public void setFavoritesCount(Integer favoritesCount){
	this.favoritesCount=favoritesCount;
	}
	public Integer getFavoritesCount(){
		return favoritesCount;
	}
	public void setCreatedAt(String createdAt){
	this.createdAt=createdAt;
	}
	public String getCreatedAt(){
		return createdAt;
	}
	public void setPurchaseUrl(String purchaseUrl){
	this.purchaseUrl=purchaseUrl;
	}
	public String getPurchaseUrl(){
		return purchaseUrl;
	}
	public void setPurchaseStatus(String purchaseStatus){
	this.purchaseStatus=purchaseStatus;
	}
	public String getPurchaseStatus(){
		return purchaseStatus;
	}
	public void setImageUrls(String imageUrls){
	this.imageUrls=imageUrls;
	}
	public String getImageUrls(){
		return imageUrls;
	}
	public void setUpdatedAt(String updatedAt){
	this.updatedAt=updatedAt;
	}
	public String getUpdatedAt(){
		return updatedAt;
	}
	public void setPrice(String price){
	this.price=price;
	}
	public String getPrice(){
		return price;
	}
	public void setBrandId(String brandId){
	this.brandId=brandId;
	}
	public String getBrandId(){
		return brandId;
	}
	public void setIsFavorite(String isFavorite){
	this.isFavorite=isFavorite;
	}
	public String getIsFavorite(){
		return isFavorite;
	}
	public void setUrl(String url){
	this.url=url;
	}
	public String getUrl(){
		return url;
	}
	public void setCoverImageUrl(String coverImageUrl){
	this.coverImageUrl=coverImageUrl;
	}
	public String getCoverImageUrl(){
		return coverImageUrl;
	}
	public void setPostIds(String postIds){
	this.postIds=postIds;
	}
	public String getPostIds(){
		return postIds;
	}
	public void setCategoryId(String categoryId){
	this.categoryId=categoryId;
	}
	public String getCategoryId(){
		return categoryId;
	}
	public void setEditorId(Integer editorId){
	this.editorId=editorId;
	}
	public Integer getEditorId(){
		return editorId;
	}
	public void setId(Integer id){
	this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setName(String name){
	this.name=name;
	}
	public String getName(){
		return name;
	}
}

