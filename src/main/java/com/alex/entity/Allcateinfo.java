package com.alex.entity;


/**
* Created by Alex on 2016-11-07
*@Description all_cate_info Entity
*/ 
import javax.persistence.*;
@Table(name="all_cate_info")
@Entity(name="all_cate_info")


public class Allcateinfo{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false,length = 10)
	private Integer id;
	@Column(name="status",length=2)
	private String status;
	
	@Column(name="subtitle",length=200)
	private String subtitle;
	
	@Column(name="title",length=200)
	private String title;
	
	@Column(name="createdAt",length=20)
	private String createdAt;
	
	@Column(name="updated_at",length=20)
	private String updatedAt;
	
	@Column(name="cover_image_url",length=200)
	private String coverImageUrl;
	
	@Column(name="banner_image_url",length=200)
	private String bannerImageUrl;
	
	@Column(name="posts_count",length=10)
	private Integer postsCount;
	
	public void setStatus(String status){
	this.status=status;
	}
	public String getStatus(){
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

