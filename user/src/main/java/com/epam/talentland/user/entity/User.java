package com.epam.talentland.user.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class User implements Serializable{
	
	private static final long serialVersionUID = 7549580706214636478L;

	@Id @Column
	@NotNull(message = "Id cannot be null")
	@NotEmpty(message = "Id cannot be empty")
	@Email(message = "Id must be an e-mail") 
	private String id;
	
	@Column
	@NotNull(message = "completeName cannot be null")
	@NotEmpty(message = "completeName cannot be empty")
	private String completeName;
	
	@Column
	@NotNull(message = "idRol cannot be null")
	private Integer idRol;
	
	@Column
	@NotNull(message = "isActive cannot be null")
	private Integer isActive;
	
	@Column
	@NotNull(message = "password cannot be null")
	@NotEmpty(message = "password cannot be empty")
	private String password;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompleteName() {
		return completeName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	


}
