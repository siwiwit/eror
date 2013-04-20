package com.eror.model.sys;

import javax.persistence.Entity;

import com.eror.model.BaseModel;

@Entity
public class SysUserRole extends BaseModel {
	SysUser sysUser;
	SysRole sysRole;
	SysBusinessUnit sysBusinessUnit;
	public SysUser getSysUser() {
		return sysUser;
	}
	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}
	public SysRole getSysRole() {
		return sysRole;
	}
	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
	public SysBusinessUnit getSysBusinessUnit() {
		return sysBusinessUnit;
	}
	public void setSysBusinessUnit(SysBusinessUnit sysBusinessUnit) {
		this.sysBusinessUnit = sysBusinessUnit;
	}
	
}
