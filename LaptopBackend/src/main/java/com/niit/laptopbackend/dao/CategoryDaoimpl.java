package com.niit.laptopbackend.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.niit.laptopbackend.model.Category;
@Repository
@Transactional
public class CategoryDaoimpl implements CategoryDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean addCategory(Category category) {
		Session session=sessionFactory.getCurrentSession();
		try {
			session.save(category);
			return true;
		}
		catch(HibernateException e){
		return false;
		}
	}

	@Override
	public boolean updateCategory(Category category) {
		Session session=sessionFactory.getCurrentSession();
		try
		{
			session.update(category);
			return true;
			
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean deleteCategory(int categoryId) {
		Session session=sessionFactory.getCurrentSession();
		try {
			session.delete(getCategoryById(categoryId));
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		return false;
		}
	}


	@Override
	public Category getCategoryById(int categoryId) {
	Session session=sessionFactory.getCurrentSession();
	try {
		Category category=(Category)session.get(Category.class,categoryId);
        return category;
	}
	catch(HibernateException e)
	{
		e.printStackTrace();
			return null;
	}
	}
	@Override
	public List<Category> getAllCategories() 
	{
		Session session=sessionFactory.getCurrentSession();
		try{
		  Query	 query=session.createQuery("from Category");
			List<Category>categoryList=(List<Category>)query.getResultList();
			return categoryList;
		}
	
	catch(HibernateException e)
		{ 
		e.printStackTrace();
		return null;
	}
		
	
}
}
	

