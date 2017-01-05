package com.alex.entity;


/**
* Created by Alex on 2016-11-08
*@Description main_menu_info Entity
*/ 
import javax.persistence.*;
@Table(name="main_menu_info")
@Entity(name="main_menu_info")


public class Mainmenuinfo{
@Column(name="cover_image_url",length=100)
	private String coverImageUrl;

@Column(name="content_url",length=100)
	private String contentUrl;

@Column(name="created_at",length=20)
	private String createdAt;

@Column(name="editor_id",length=10)
	private String editorId;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id",length=10)
	private String id;

@Column(name="labels",length=100)
	private String labels;

@Column(name="liked",length=100)
	private String liked;

@Column(name="likes_count",length=10)
	private String likesCount;

@Column(name="published_at",length=20)
	private String publishedAt;

@Column(name="share_msg",length=500)
	private String shareMsg;

@Column(name="status",length=2)
	private String status;

@Column(name="short_title",length=50)
	private String shortTitle;

@Column(name="template",length=100)
	private String template;

@Column(name="type",length=10)
	private String type;

@Column(name="title",length=50)
	private String title;

@Column(name="updated_at",length=20)
	private String updatedAt;

@Column(name="url",length=100)
	private String url;

	public void setCoverImageUrl(String coverImageUrl){
	this.coverImageUrl=coverImageUrl;
	}
	public String getCoverImageUrl(){
		return coverImageUrl;
	}
	public void setContentUrl(String contentUrl){
	this.contentUrl=contentUrl;
	}
	public String getContentUrl(){
		return contentUrl;
	}
	public void setCreatedAt(String createdAt){
	this.createdAt=createdAt;
	}
	public String getCreatedAt(){
		return createdAt;
	}
	public void setEditorId(String editorId){
	this.editorId=editorId;
	}
	public String getEditorId(){
		return editorId;
	}
	public void setId(String id){
	this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setLabels(String labels){
	this.labels=labels;
	}
	public String getLabels(){
		return labels;
	}
	public void setLiked(String liked){
	this.liked=liked;
	}
	public String getLiked(){
		return liked;
	}
	public void setLikesCount(String likesCount){
	this.likesCount=likesCount;
	}
	public String getLikesCount(){
		return likesCount;
	}
	public void setPublishedAt(String publishedAt){
	this.publishedAt=publishedAt;
	}
	public String getPublishedAt(){
		return publishedAt;
	}
	public void setShareMsg(String shareMsg){
	this.shareMsg=shareMsg;
	}
	public String getShareMsg(){
		return shareMsg;
	}
	public void setStatus(String status){
	this.status=status;
	}
	public String getStatus(){
		return status;
	}
	public void setShortTitle(String shortTitle){
	this.shortTitle=shortTitle;
	}
	public String getShortTitle(){
		return shortTitle;
	}
	public void setTemplate(String template){
	this.template=template;
	}
	public String getTemplate(){
		return template;
	}
	public void setType(String type){
	this.type=type;
	}
	public String getType(){
		return type;
	}
	public void setTitle(String title){
	this.title=title;
	}
	public String getTitle(){
		return title;
	}
	public void setUpdatedAt(String updatedAt){
	this.updatedAt=updatedAt;
	}
	public String getUpdatedAt(){
		return updatedAt;
	}
	public void setUrl(String url){
	this.url=url;
	}
	public String getUrl(){
		return url;
	}
}

