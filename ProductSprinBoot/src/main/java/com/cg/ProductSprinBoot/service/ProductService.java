package com.cg.ProductSprinBoot.service;

import java.util.List;

import com.cg.ProductSprinBoot.dto.Product;


public interface ProductService {
public Product addProduct(Product pro);
public List<Product> showAll();
public  List<Product>searchByName(String name);
public List<Product> searchByPriceBetween(double low,double high);
}
