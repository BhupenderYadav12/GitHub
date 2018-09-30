package com.niit.laptopbackend.dao;

import java.util.List;

import com.niit.laptopbackend.model.Category;

public interface CategoryDao  {
	public boolean addCategory(Category category);
	public boolean updateCategory(Category category);
	public boolean deleteCategory(int categoryId);	
	public Category getCategoryById(int categoryId);
	public List<Category>getAllCategories();


}
