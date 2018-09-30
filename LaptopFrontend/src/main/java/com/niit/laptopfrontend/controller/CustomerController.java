package com.niit.laptopfrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.laptopbackend.dao.CustomerDao;
import com.niit.laptopbackend.model.Customer;

@Controller
public class CustomerController {
	
@Autowired
CustomerDao customerDao;
@Autowired
Customer customer;


@RequestMapping(value="/addCustomer", method=RequestMethod.POST)
public String register(@ModelAttribute("customer") Customer customer)
{
	 customerDao.addCustomer(customer);
	return "Index";
}

}
