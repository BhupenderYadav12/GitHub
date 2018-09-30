package com.niit.laptopbackend.dao;

import java.util.List;

import com.niit.laptopbackend.model.Product;

public interface ProductDao {
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(int product_id);
	public Product getProductByID(int product_id);
	public List<Product> getALLProduct();
	

}
