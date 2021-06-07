package com.example.security.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel("This is User Login Model")
public class MyUser {
	@Id
	@ApiModelProperty("This is user id property")
	private int id;
	@ApiModelProperty("This is user name property")
	@NotEmpty(message="Username is Mandatory")
	private String name;
	@NotEmpty(message="Password is Mandatory")
	@ApiModelProperty("This is user password property")
	private String password;
	@ApiModelProperty("This is user activated property")
	private boolean activated;
	@ApiModelProperty("This is user roles property")
	private String roles;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isActivated() {
		return activated;
	}
	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
}
