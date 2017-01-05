package com.alex.entity;


/**
* Created by Alex on 2016-11-08
*@Description list_page_info Entity
*/ 
import javax.persistence.*;
@Table(name="list_page_info")
@Entity(name="list_page_info")


public class Listpageinfo{
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id",length=10)
	private Integer id;	
	
@Column(name="status",length=2)
	private String status;

@Column(name="liked",length=100)
	private String liked;

@Column(name="template",length=100)
	private String template;

@Column(name="title",length=100)
	private String title;

@Column(name="url",length=100)
	private String url;

@Column(name="type",length=10)
	private String type;

@Column(name="created_at",length=20)
	private String createdAt;

@Column(name="labels",length=100)
	private String labels;

@Column(name="updated_at",length=20)
	private String updatedAt;

@Column(name="content_url",length=100)
	private String contentUrl;

@Column(name="published_at",length=20)
	private String publishedAt;

@Column(name="short_title",length=50)
	private String shortTitle;

@Column(name="cover_image_url",length=100)
	private String coverImageUrl;

@Column(name="editor_id",length=10)
	private String editorId;

@Column(name="share_msg",length=200)
	private String shareMsg;

@Column(name="likes_count",length=10)
	private Integer likesCount;

	public void setStatus(String status){
	this.status=status;
	}
	public String getStatus(){
		return status;
	}
	public void setLiked(String liked){
	this.liked=liked;
	}
	public String getLiked(){
		return liked;
	}
	public void setTemplate(String template){
	this.template=template;
	}
	public String getTemplate(){
		return template;
	}
	public void setTitle(String title){
	this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setUrl(String url){
	this.url=url;
	}
	public String getUrl(){
		return url;
	}
	public void setType(String type){
	this.type=type;
	}
	public String getType(){
		return type;
	}
	public void setCreatedAt(String createdAt){
	this.createdAt=createdAt;
	}
	public String getCreatedAt(){
		return createdAt;
	}
	public void setLabels(String labels){
	this.labels=labels;
	}
	public String getLabels(){
		return labels;
	}
	public void setUpdatedAt(String updatedAt){
	this.updatedAt=updatedAt;
	}
	public String getUpdatedAt(){
		return updatedAt;
	}
	public void setContentUrl(String contentUrl){
	this.contentUrl=contentUrl;
	}
	public String getContentUrl(){
		return contentUrl;
	}
	public void setPublishedAt(String publishedAt){
	this.publishedAt=publishedAt;
	}
	public String getPublishedAt(){
		return publishedAt;
	}
	public void setShortTitle(String shortTitle){
	this.shortTitle=shortTitle;
	}
	public String getShortTitle(){
		return shortTitle;
	}
	public void setCoverImageUrl(String coverImageUrl){
	this.coverImageUrl=coverImageUrl;
	}
	public String getCoverImageUrl(){
		return coverImageUrl;
	}
	public void setEditorId(String editorId){
	this.editorId=editorId;
	}
	public String getEditorId(){
		return editorId;
	}
	public void setId(Integer id){
	this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setShareMsg(String shareMsg){
	this.shareMsg=shareMsg;
	}
	public String getShareMsg(){
		return shareMsg;
	}
	public void setLikesCount(Integer likesCount){
	this.likesCount=likesCount;
	}
	public Integer getLikesCount(){
		return likesCount;
	}
}

