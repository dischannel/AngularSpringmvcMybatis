package com.alex.entity;


import javax.persistence.*;

@Table(name="t_user")
@Entity(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="userId",nullable = false,length = 10)
    private Integer id;
    
    @Column(name="userName",length=20)
    private String user_name;
    
    @Column(name="password",length=20)
    private String password;
    
  
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [ \nid : " + this.id + "\nuser Name : " + this.user_name
				+ "\npassword : " + this.password 
				+ " ]";
	}
}