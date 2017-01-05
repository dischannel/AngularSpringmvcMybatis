package com.alex.entity;


/**
* Created by Alex on 2016-11-08
*@Description cate_page_info Entity
*/ 
import javax.persistence.*;
@Table(name="cate_page_info")
@Entity(name="cate_page_info")


public class Catepageinfo{
@Column(name="status",length=2)
	private Integer status;

@Column(name="subtitle",length=100)
	private String subtitle;

@Column(name="title",length=100)
	private String title;

@Column(name="created_at",length=20)
	private Integer createdAt;

@Column(name="updated_at",length=20)
	private Integer updatedAt;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id",length=10)
	private Integer id;

@Column(name="cover_image_url",length=100)
	private String coverImageUrl;

@Column(name="banner_image_url",length=100)
	private String bannerImageUrl;

@Column(name="posts_count",length=10)
	private Integer postsCount;

	public void setStatus(Integer status){
	this.status=status;
	}
	public Integer getStatus(){
		return status;
	}
	public void setSubtitle(String subtitle){
	this.subtitle=subtitle;
	}
	public String getSubtitle(){
		return subtitle;
	}
	public void setTitle(String title){
	this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setCreatedAt(Integer createdAt){
	this.createdAt=createdAt;
	}
	public Integer getCreatedAt(){
		return createdAt;
	}
	public void setUpdatedAt(Integer updatedAt){
	this.updatedAt=updatedAt;
	}
	public Integer getUpdatedAt(){
		return updatedAt;
	}
	public void setId(Integer id){
	this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setCoverImageUrl(String coverImageUrl){
	this.coverImageUrl=coverImageUrl;
	}
	public String getCoverImageUrl(){
		return coverImageUrl;
	}
	public void setBannerImageUrl(String bannerImageUrl){
	this.bannerImageUrl=bannerImageUrl;
	}
	public String getBannerImageUrl(){
		return bannerImageUrl;
	}
	public void setPostsCount(Integer postsCount){
	this.postsCount=postsCount;
	}
	public Integer getPostsCount(){
		return postsCount;
	}
}

