package com.alex.entity;


/**
* Created by Alex on 2016-11-08
*@Description first_page_cate_info Entity
*/ 
import javax.persistence.*;
@Table(name="first_page_cate_info")
@Entity(name="first_page_cate_info")


public class Firstpagecateinfo{
@Column(name="editable",length=2)
	private String editable;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id",length=10)
	private Integer id;

@Column(name="name",length=50)
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

