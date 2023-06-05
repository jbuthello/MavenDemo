package com.jsp.controller;

import java.util.List;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class GetAll {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		List<Product> products=productService.getAllProduct();
		System.out.println("ID | Name | Brand");
		for(Product p: products) {
			System.out.print(p.getId()); System.out.print("  | ");
			System.out.print(p.getName()); System.out.print("   | ");
			System.out.print(p.getBrand()); System.out.print("  ");
			System.out.println();
		}
	}

}