package com.niit.laptopbackend.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;


@Component
@Entity
@Transactional
public class Category {

@Id 
@GeneratedValue(strategy=GenerationType.SEQUENCE)
private int categoryId;
private String categoryName;
private String categoryDescription;


@OneToMany(mappedBy="category", fetch=FetchType.EAGER)
Set<Product> products;


public int getCategoryId() {
	return categoryId;
}


public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
}


public String getCategoryName() {
	return categoryName;
}


public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}


public String getCategoryDescription() {
	return categoryDescription;
}


public void setCategoryDescription(String categoryDescription) {
	this.categoryDescription = categoryDescription;
}

	
}
