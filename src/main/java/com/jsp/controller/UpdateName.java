package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class UpdateName {
	public static void main(String[] args) {
//		Product product=new Product();
		ProductService productService=new ProductService();
		Product product=productService.updateProductName(8, "Z3");
		System.out.print(product.getName());
		System.out.println("  Updated Sucessfully...");
	}
}
