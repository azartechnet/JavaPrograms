package newpgpinterface;

public class ProductImple implements Product 
{


	//ProductModel pm=new ProductModel();
	
	@Override
	public void addProduct(ProductModel p) {
		
		System.out.println("ProductName"+p.getPname());
		System.out.println("ProductID"+p.getPid());

		
	}

	@Override
	public void viewProduct() {
		
		System.out.println("Welcome to view Product");
		
	}

}
