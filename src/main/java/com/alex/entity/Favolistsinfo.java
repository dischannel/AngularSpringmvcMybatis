package com.alex.entity;


/**
* Created by Alex on 2016-11-08
*@Description favo_lists_info Entity
*/ 
import javax.persistence.*;
@Table(name="favo_lists_info")
@Entity(name="favo_lists_info")


public class Favolistsinfo{
@Column(name="items_count",length=10)
	private Integer itemsCount;

@Column(name="user_id",length=10)
	private Integer userId;

@Column(name="description",length=100)
	private String description;

@Column(name="url",length=100)
	private String url;

@Column(name="created_at",length=20)
	private String createdAt;

@Column(name="updated_at",length=20)
	private String updatedAt;

@Column(name="publicc",length=100)
	private String publicc;

@Column(name="head_image_url",length=100)
	private String headImageUrl;

@Column(name="cover_image_url",length=100)
	private String coverImageUrl;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id",length=10)
	private Integer id;

@Column(name="name",length=50)
	private String name;

	public void setItemsCount(Integer itemsCount){
	this.itemsCount=itemsCount;
	}
	public Integer getItemsCount(){
		return itemsCount;
	}
	public void setUserId(Integer userId){
	this.userId=userId;
	}
	public Integer getUserId(){
		return userId;
	}
	public void setDescription(String description){
	this.description=description;
	}
	public String getDescription(){
		return description;
	}
	public void setUrl(String url){
	this.url=url;
	}
	public String getUrl(){
		return url;
	}
	public void setCreatedAt(String createdAt){
	this.createdAt=createdAt;
	}
	public String getCreatedAt(){
		return createdAt;
	}
	public void setUpdatedAt(String updatedAt){
	this.updatedAt=updatedAt;
	}
	public String getUpdatedAt(){
		return updatedAt;
	}
	public void setPublicc(String publicc){
	this.publicc=publicc;
	}
	public String getPublicc(){
		return publicc;
	}
	public void setHeadImageUrl(String headImageUrl){
	this.headImageUrl=headImageUrl;
	}
	public String getHeadImageUrl(){
		return headImageUrl;
	}
	public void setCoverImageUrl(String coverImageUrl){
	this.coverImageUrl=coverImageUrl;
	}
	public String getCoverImageUrl(){
		return coverImageUrl;
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

