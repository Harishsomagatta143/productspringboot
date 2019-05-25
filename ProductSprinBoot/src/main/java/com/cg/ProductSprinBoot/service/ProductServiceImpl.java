package com.cg.ProductSprinBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ProductSprinBoot.dao.ProductDao;
import com.cg.ProductSprinBoot.dto.Product;
@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
ProductDao productdao;
	@Override
	public Product addProduct(Product pro) {
		// TODO Auto-generated method stub
		
		return productdao.save(pro);
	}

	@Override
	public List<Product> showAll() {
		// TODO Auto-generated method stub
		return productdao.findAll();
	}

	@Override
	public List<Product> searchByName(String name) {
		// TODO Auto-generated method stub
		return productdao.findByName(name);
	}

	@Override
	public List<Product> searchByPriceBetween(double low, double high) {
		// TODO Auto-generated method stub
		return productdao.findByPriceBetween(low, high);
	}

	

}
