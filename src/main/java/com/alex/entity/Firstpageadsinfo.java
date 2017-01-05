package com.alex.entity;


/**
* Created by Alex on 2016-11-08
*@Description first_page_ads_info Entity
*/ 
import javax.persistence.*;
@Table(name="first_page_ads_info")
@Entity(name="first_page_ads_info")


public class Firstpageadsinfo{
@Column(name="status",length=2)
	private String status;

@Column(name="target_url",length=100)
	private String targetUrl;

@Column(name="target",length=100)
	private String target;

@Column(name="target_id",length=10)
	private String targetId;

@Column(name="order",length=10)
	private String order;

@Column(name="image_url",length=100)
	private String imageUrl;

@Column(name="type",length=10)
	private String type;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id",length=10)
	private Integer id;

@Column(name="channel",length=100)
	private String channel;

	public void setStatus(String status){
	this.status=status;
	}
	public String getStatus(){
		return status;
	}
	public void setTargetUrl(String targetUrl){
	this.targetUrl=targetUrl;
	}
	public String getTargetUrl(){
		return targetUrl;
	}
	public void setTarget(String target){
	this.target=target;
	}
	public String getTarget(){
		return target;
	}
	public void setTargetId(String targetId){
	this.targetId=targetId;
	}
	public String getTargetId(){
		return targetId;
	}
	public void setOrder(String order){
	this.order=order;
	}
	public String getOrder(){
		return order;
	}
	public void setImageUrl(String imageUrl){
	this.imageUrl=imageUrl;
	}
	public String getImageUrl(){
		return imageUrl;
	}
	public void setType(String type){
	this.type=type;
	}
	public String getType(){
		return type;
	}
	public void setId(Integer id){
	this.id=id;
	}
	public Integer getId(){
		return id;
	}
	public void setChannel(String channel){
	this.channel=channel;
	}
	public String getChannel(){
		return channel;
	}
}

