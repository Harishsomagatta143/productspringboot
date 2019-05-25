package com.cg.ProductSprinBoot.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ProductSprinBoot.dto.Inventory;
import com.cg.ProductSprinBoot.dto.Product;
import com.cg.ProductSprinBoot.service.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productservice;
	/*@RequestMapping(method=RequestMethod.GET,value="/checkname/{uname}")
	public String getName(@PathVariable("uname")String mname,@RequestParam("prodid")String id) {
		System.out.println("hii");
		return id+"Capgemini"+mname;
	}
	@RequestMapping(method=RequestMethod.POST,value="/checkname")
	public String getData(@RequestParam("prodId") int pid,
			@RequestParam("prodName") String pname,@RequestParam("prodPrice")String pprice) {
		System.out.println(pid+" "+pname+" "+pprice);
		return "welcome";
	}*/
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public ResponseEntity<Product>  addProduct(@RequestBody Product pro) {
		Product prod=productservice.addProduct(pro);
		if(prod==null) {
			return new ResponseEntity("product not added",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Product>(prod,HttpStatus.OK);
	}
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public ResponseEntity<List<Product>> showAllProduct(){
		List<Product>myList=productservice.showAll();
		if(myList.isEmpty()) {
			return new ResponseEntity("product not show",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Product>>(myList,HttpStatus.OK);
	}
	@RequestMapping(value="/search",method=RequestMethod.GET)
	public ResponseEntity<List<Product>> searchProduct(@RequestParam("pname")String name){
		List<Product>myList=productservice.searchByName(name);
		if(myList.isEmpty()) {
			return new ResponseEntity("product not found",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Product>>(myList,HttpStatus.OK);
	}
	@RequestMapping(value="/price",method=RequestMethod.GET)
	public ResponseEntity<List<Product>> searchProduct(@RequestParam("low")double lowprice,@RequestParam("high")double highprice){
		//double low=Double.parseDouble(lowprice);
		//double high=Double.parseDouble(highprice);
		List<Product>myList=productservice.searchByPriceBetween(lowprice,highprice);
		if(myList.isEmpty()) {
			return new ResponseEntity("product not found",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Product>>(myList,HttpStatus.OK);
	}
	@RequestMapping(value="/addall",method=RequestMethod.POST)
	public ResponseEntity<Product> addAll(@ModelAttribute Product prod){
	/*@RequestParam("id")int pid,@RequestParam("name")String name,
			@RequestParam("price")double price,@RequestParam("desc")
			String desc,@RequestParam("inid")int inid,@RequestParam("inname") String inname)*/
		//double low=Double.parseDouble(lowprice);
		//double high=Double.parseDouble(highprice);
		/*Inventory inventory=new Inventory();
		inventory.setId(inid);
		inventory.setName(inname);
		Product prod=new Product();
		prod.setId(pid);
		prod.setName(name);
		prod.setPrice(price);
		prod.setDescription(desc);
		prod.setInventory(inventory);*/
		
		
	Product pro=productservice.addProduct(prod);
		if(pro==null) {
			return new ResponseEntity("no product added",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity <Product>(pro,HttpStatus.OK);
	}
}
