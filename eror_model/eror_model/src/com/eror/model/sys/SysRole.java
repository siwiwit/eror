package com.eror.model.sys;

import javax.persistence.Entity;

import com.eror.model.BaseModel;
@Entity
public class SysRole extends BaseModel {
	String roleName;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	boolean active;
}
