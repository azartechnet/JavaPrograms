package newpgpinterface;

public class MainPage {

	public static void main(String as[])
	{
		
		ProductModel p=new ProductModel();
		p.setPname("apple");
		p.setPid(101);
		ProductImple pl=new ProductImple();
		pl.addProduct(p);
	
		
		
		//pl.addProduct();
		//pl.viewProduct();

		//pm.setPname("apple");
		//pm.setPid(101);
		
	}
	
}
