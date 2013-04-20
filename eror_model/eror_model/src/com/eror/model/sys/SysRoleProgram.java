package com.eror.model.sys;

import javax.persistence.Entity;

import com.eror.model.BaseModel;

@Entity
public class SysRoleProgram extends BaseModel {
	SysRole sysRole;
	SysProgram sysProgram;
	public SysRole getSysRole() {
		return sysRole;
	}
	public void setSysRole(SysRole sysRole) {
		this.sysRole = sysRole;
	}
	public SysProgram getSysProgram() {
		return sysProgram;
	}
	public void setSysProgram(SysProgram sysProgram) {
		this.sysProgram = sysProgram;
	}
}
