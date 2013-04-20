package com.eror.model.sys;

import javax.persistence.Entity;

import com.eror.model.BaseModel;
import javax.persistence.Basic;
import javax.persistence.Column;

import org.datanucleus.api.jpa.annotations.ColumnPosition;
@Entity
public class SysUser extends BaseModel {
	private String userName;
	private String userPwd;

	@Basic
	@Column(name = "passwd")
	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String passwd) {
		this.userPwd = passwd;
	}
	
	@Basic
	@Column(name = "userName")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}
}
