package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class GetById
{
	public static void main(String[] args)
	{
		ProductService productService=new ProductService();
		
		Product product=productService.getProductById(4);
		if(product!=null) {
			System.out.println(product.getBrand());
			System.out.println(product.getName());
		}else {
			System.out.println("Incorrect Id.");	}
	}
}