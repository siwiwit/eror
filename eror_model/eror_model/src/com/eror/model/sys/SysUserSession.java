package com.eror.model.sys;

import java.util.Date;

import javax.persistence.Entity;

import com.eror.model.BaseModel;

@Entity
public class SysUserSession extends BaseModel {

	Date sessionDate;
	SysUserRole sysUserRole;

	public Date getSessionDate() {
		return sessionDate;
	}

	public void setSessionDate(Date sessionDate) {
		this.sessionDate = sessionDate;
	}

	public SysUserRole getSysUserRole() {
		return sysUserRole;
	}

	public void setSysUserRole(SysUserRole sysUserRole) {
		this.sysUserRole = sysUserRole;
	}
}
