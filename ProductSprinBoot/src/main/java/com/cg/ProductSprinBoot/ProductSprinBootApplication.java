package com.cg.ProductSprinBoot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.cg.ProductSprinBoot")
public class ProductSprinBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductSprinBootApplication.class, args);
		System.out.println("welcome spring boot");
	}
	

}
