package com.jsp.controller;

import com.jsp.service.ProductService;

public class DeleteController {
	public static void main(String[] args) {
		ProductService productService=new ProductService();
		
		boolean flag=productService.deleteProductById(2);
		if(flag==true) {
			System.out.println("Record Deleted.");
		}else {
			System.out.println("record not deleted");
		}
	}
}