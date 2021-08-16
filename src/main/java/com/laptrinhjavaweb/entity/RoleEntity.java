package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {

	@Column(name = "code")
	private String code;
	
	@Column(name = "name")
	private String name;

	@ManyToMany(mappedBy = "roles")
	private List<UserEntity> userEntity = new ArrayList<>();
	
	
	public List<UserEntity> getUserEntity() {
		return userEntity;
	}

	
	public void setUserEntity(List<UserEntity> userEntity) {
		this.userEntity = userEntity;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
