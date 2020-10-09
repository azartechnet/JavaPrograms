
public class Product {

	int productId=1001;//class or instance variable
	int categoryId=2001;
	void addProduct()
	{
	   String pname="apple";//local variable
	   
	   System.out.println("ProductId is::"+productId+"ProductName is::"+pname);
	   
	}
	void display()
	{
		System.out.println("CategoryId is::"+categoryId);
	}
	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.addProduct();
		p1.display();

	}

}
