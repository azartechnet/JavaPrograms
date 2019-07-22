
interface B
{
	void addProduct();
}
interface B1 //extends B
{
	void viewProduct();
}
class D1 implements B1,B
{
	public void addProduct()
	{
		System.out.println("addProduct");
	}
	public void viewProduct()
	{
		System.out.println("viewProduct");
	}
}

public class Sample {

	public static void main(String[] args) 
	{
	
         D1 h1=new D1();
         h1.addProduct();
         h1.viewProduct();
	}

}
