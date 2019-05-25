package com.cg.ProductSprinBoot.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="data_product")
public class Product {
	@Id
	@Column(name="prod_id")
private int id;
	@Column(name="prod_name")
private String name;
	@Column(name="prod_price")
private double price;
	@Column(name="prod_desc")
private String description;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="prod_inventory")
	private Inventory inventory;
public Product() {
	super();
}

public Product(int id, String name, double price, String description, Inventory inventory) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.description = description;
	this.inventory = inventory;
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
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

public Inventory getInventory() {
	return inventory;
}
public void setInventory(Inventory inventory) {
	this.inventory = inventory;
}
@Override
public String toString() {
	return "Product [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description + ", inventory="
			+ inventory + "]";
}


}
