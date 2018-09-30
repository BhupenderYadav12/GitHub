package com.niit.laptopfrontend.controller;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.niit.laptopbackend.dao.CategoryDao;
import com.niit.laptopbackend.dao.ProductDao;
import com.niit.laptopbackend.model.Category;
import com.niit.laptopbackend.model.Product;

@Controller

public class ProductController {
	@Autowired
	ProductDao productDao;
	@Autowired
	Product product;
	@Autowired
	CategoryDao categoryDao;
	
	@RequestMapping(value="/addproduct", method=RequestMethod.POST)
	public String productAdd(@ModelAttribute("prod") Product product,HttpSession httpSession)
	{
      if(product.getProduct_Id()==0)
      {
    	 
    	if( productDao.addProduct(product))
    	{
       MultipartFile file=product.getImage();
			
			ServletContext con=httpSession.getServletContext();
			String filelocation=con.getRealPath("/resources/images/");
			System.out.println(filelocation);
			String filename=filelocation+"\\"+product.getProduct_Id()+".jpg";
			System.out.println(filename);
			
			try{
				byte b[]=file.getBytes();
				FileOutputStream fos=new FileOutputStream(filename);
				fos.write(b);
				fos.close();
		    	}
			catch(IOException ex){}
			catch(Exception e){}
				}	
		}
      else
      {
    	  
    	  productDao.updateProduct(product);
      }
      return"redirect:/Product";
	}
	
	@RequestMapping("/deleteProduct/{id}")
	public String productDelete(@PathVariable("id") int product_Id)
	{
		productDao.deleteProduct(product_Id);
		return"redirect:/Product";
		
		
	}
      @RequestMapping("/editProduct/{id}")
      		 public String productUpdate(@PathVariable("id") int product_Id, Model model)
      		 {
      			 Product productData=productDao.getProductByID(product_Id);
      			 model.addAttribute("prod", productData);
      			 List<Product> allProduct=productDao.getALLProduct();
      			 model.addAttribute("productList",allProduct);
      			 List<Category> allCategory=categoryDao.getAllCategories();
      			 model.addAttribute("categoryList",allCategory);

      			 return "Product";
      		 }
      		
	
}
