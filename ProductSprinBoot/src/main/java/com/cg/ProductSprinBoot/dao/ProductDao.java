package com.cg.ProductSprinBoot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.ProductSprinBoot.dto.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	public  List<Product>findByName(String name);
	@Query
	public  List<Product>findByPriceBetween(double low,double high);
}
