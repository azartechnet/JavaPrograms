
public class ProductImple implements product 
{

	@Override
	public void addProduct(ProductModel p) 
	{
	
		System.out.println("Welcome"+p.getPname());
		
		
		
	}
	
	public static void main(String as[])
	{
		ProductModel p=new ProductModel();
		p.setPname("NIIT");
		System.out.println(p.getPname());
		ProductImple pd=new ProductImple();
		pd.addProduct(p);
	}
  
}
