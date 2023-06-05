// All database operations. All queries.
package com.jsp.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Product;


public class ProductDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("jb");
	EntityManager entityManager=entityManagerFactory.createEntityManager(); // entityManager comes form EMfactory &is used to perform all database manager
	EntityTransaction entityTransaction=entityManager.getTransaction(); //
	
	
//	Saving a product in database| DATA ACCESS OBJECT
	public Product saveProduct(Product product) {
	
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityTransaction.commit();
		
		return product;
	}
	
//	Get product by id
	public Product getProductById(int id) {
		
		return entityManager.find(Product.class, id);
	}
	
//	Deleting a record
	public boolean deleteProductById(int id) {
		Product product = getProductById(id);
		// or Product product = entitityManager.find(Product.class, id);
		entityTransaction.begin();
		entityManager.remove(product);
		entityTransaction.commit();
		return true;
	}
	
//	 to get all records
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts(){
		String jpql="SELECT p FROM Product p";
		Query query=entityManager.createQuery(jpql);
		List<Product> products=query.getResultList();
		return products;
	}

//	Update product name
	public Product updateProductName(int id, Product product) {
		if(product!=null) {
			entityTransaction.begin();
			entityManager.merge(product);
			entityTransaction.commit();
			return product;		
		}else {
			return null;
		}
	}
}