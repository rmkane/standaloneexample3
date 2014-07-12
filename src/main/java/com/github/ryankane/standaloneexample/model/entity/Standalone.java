package com.github.ryankane.standaloneexample.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "standalone")
public class Standalone extends BaseEntity {
	@Column(name="NAME")
	private String name;
	
	@Column(name="AMOUNT")
	private double amount;
	
	@Column(name="CREATED")
	private Date created;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
