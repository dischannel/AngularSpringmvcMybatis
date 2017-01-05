package com.alex.service.beans;


/**
* Created by Alex on 2016-11-08
*@Description first_page_cate_info Entity
*/ 



public class FirstPageCateBean{
	private String editable;
	private Integer id;
	private String name;
	public void setEditable(String editable){
	this.editable=editable;
	}
	public String getEditable(){
		return editable;
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

