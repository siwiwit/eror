package com.eror.model;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.TABLE;
import javax.persistence.Temporal;
import static javax.persistence.TemporalType.TIMESTAMP;
import javax.persistence.Column;

import org.datanucleus.api.jpa.annotations.ColumnPosition;

@MappedSuperclass
public abstract class BaseModel {
	String id;
	Date createdDate;
	Date modifiedDate;
	String createUser;
	String modifyUser;
	private int version;
	@Id
	@GeneratedValue(strategy = TABLE)
	@Column(name = "id")
	@ColumnPosition(0)
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Basic
	@Temporal(TIMESTAMP)
	@ColumnPosition(1)
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	@Basic
	@Temporal(TIMESTAMP)
	@ColumnPosition(2)
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	@Basic
	@ColumnPosition(3)
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	@Basic
	@ColumnPosition(4)
	public String getModifyUser() {
		return modifyUser;
	}
	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}
	@Version
	@ColumnPosition(5)
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
}
