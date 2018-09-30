package com.niit.laptopbackend.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.niit.laptopbackend.model.Product;
@Repository
@Transactional


public class ProductDaoimpl implements ProductDao {
	@Autowired
private SessionFactory sessionFactory;
	@Override
	public boolean addProduct(Product product) {
		Session session=sessionFactory.getCurrentSession();
		try {
			session.save(product);
			return true;
		}
		catch(HibernateException e){
		e.printStackTrace();
			return false;
		}}

	@Override
	public boolean updateProduct(Product product) {
	Session session=sessionFactory.getCurrentSession();
	try {
		session.update(product);
		return true;
		}
		catch(HibernateException e) {
	e.printStackTrace();
		return false;
	}
	}
	@Override
	public boolean deleteProduct(int product_id) {
		Session session=sessionFactory.getCurrentSession();
		try
		{
		session.delete(getProductByID(product_id));	
		return true;
		}
		catch(HibernateException e){
		e.printStackTrace();
			return false;
	}
		}

	@Override
	public Product getProductByID(int product_id) {
		Session session=sessionFactory.getCurrentSession();
		try {
			Product product=(Product)session.get(Product.class, product_id);
			return product;
		}catch(HibernateException e){
			e.printStackTrace();
			
		return null;
	}}

	@Override
	public List<Product> getALLProduct() {
	Session session=sessionFactory.getCurrentSession();
	try {
		Query query=session.createQuery("from Product");
		List<Product> productList=(List<Product>)query.getResultList();
		return productList;
	}catch(HibernateException e){
		e.printStackTrace();
		return null;
	}

}}
