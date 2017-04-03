package com.viz.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")
public class UserBean implements Serializable {
	@Column
	private String name;
	@Column
	private String email;
	@Id
	private String fbid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFbid() {
		return fbid;
	}
	public void setFbid(String fbid) {
		this.fbid = fbid;
	}
	public UserBean(String name, String email, String fbid) {
		super();
		this.name = name;
		this.email = email;
		this.fbid = fbid;
	}
	public UserBean(){}

}
