package com.niit.laptopfrontend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.laptopbackend.dao.CategoryDao;
import com.niit.laptopbackend.dao.CustomerDao;
import com.niit.laptopbackend.dao.ProductDao;
import com.niit.laptopbackend.model.Category;
import com.niit.laptopbackend.model.Customer;
import com.niit.laptopbackend.model.Product;
@Controller
public class HomeController {
	@Autowired
	Category category;
	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	Product product;
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	CustomerDao customerDao;
	
	@Autowired
	Customer customer;
	
	@RequestMapping("/")
	public String rootpage()
	{
		return "Index";
	}

	@RequestMapping("/Index")
	public String homepage()
	{
		return "Index";
	}
	@RequestMapping("/Login")
	public String Loginpage()
	{
		return "Login";
		
	}

    @RequestMapping("/Category")
    public String categoryPage(Model model)
    {
    List<Category> allCategory=categoryDao.getAllCategories();
    model.addAttribute("cat", category);
    model.addAttribute("categoryList",allCategory);
    return "Category";
    }
    
    @RequestMapping("/Product")
    public String productPage(Model model)
    {
    	List<Category> allCategory=categoryDao.getAllCategories();
    	List<Product> allProduct=productDao.getALLProduct();
    	model.addAttribute("prod", product);
    	model.addAttribute("productList", allProduct);
        model.addAttribute("categoryList",allCategory);

    	
        return"Product";
    	}
    
    @RequestMapping("/Customer")
    public String customerPage(Model model)
    {
   
    model.addAttribute("customer", customer);
   
    return "Customer";
    }

    }
  
    	
   