package com.niit.laptopbackend.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.laptopbackend.model.Authorization;
import com.niit.laptopbackend.model.Customer;

@Repository
@Transactional
public class CustomerDaoimpl implements CustomerDao{

	@Autowired
	public SessionFactory sessionFactory;
	public boolean addCustomer(Customer customer) {
		Session session=sessionFactory.getCurrentSession();
		session.save(customer);
		Authorization auth=new Authorization();
		auth.setUsername(customer.getEmailId());
		session.save(auth);
		
		
		return false;
	}
	

}
