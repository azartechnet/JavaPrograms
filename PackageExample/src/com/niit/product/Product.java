package com.niit.product;

import com.niit.category.Category;

public class Product 
{
   
  Category ct=new Category();
  
  public Product()
  {
	  ct.cname="gg";
	  System.out.println("ProductPackage"+ct.cname);
  }
}
