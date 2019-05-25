package com.cg.ProductSprinBoot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Inventory {
	@Id
	@Column(name="inventory_id")
private int id;
	@Column(name="inventory_name")
	private String name;
	public Inventory() {
		super();
	}
	
	
	public Inventory(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Inventory [id=" + id + ", name=" + name + "]";
	}
	
}
