package com.niit.category;

import com.niit.product.Product;

public class Category
{
  
  Product pt=new Product();
 public Category()
  {
	 
	  pt.cname=30;
	  System.out.println("CategoryPackage"+cname);
  }
 
}
class DemoMain
{
	public static void main(String as[])
	{
		new Category();
		//new Product();
		//g.display1();
		//g.display();
	}
}


