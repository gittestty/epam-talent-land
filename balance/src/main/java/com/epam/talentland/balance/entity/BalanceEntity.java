package com.epam.talentland.balance.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BALANCE")
public class BalanceEntity implements Serializable{
	
	private static final long serialVersionUID = 3206369835516229752L;

	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="user")
	private String user;
	
	@Column(name="ammount")
	private BigDecimal ammount;
	
	@Column(name="date")
	private Date transactionDate;

	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public BigDecimal getAmmount() {
		return ammount;
	}

	public void setAmmount(BigDecimal ammount) {
		this.ammount = ammount;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	

}
