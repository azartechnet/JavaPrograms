

public class ProductImplementation implements Product 
{
  
	ProductModel pd=new ProductModel();
	
	@Override
	public void addProduct() 
	{
	  System.out.println("AddProductFun"+pd.getPname());	
		
	}

	@Override
	public void viewProduct() {
		  System.out.println("ViewProductFun"+pd.getPprice());	
		
	}

}
