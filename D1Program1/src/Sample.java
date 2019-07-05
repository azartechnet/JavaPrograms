class Product
{
	int pid=101;
	
	void get1()
	{
		System.out.println("BaseClass is");
	}
	
}
class AddProduct extends Product
{
	void get()
	{
		System.out.println("A value is:"+pid);
	}
}

public class Sample {

	public static void main(String[] args) {
		
		AddProduct p1=new AddProduct();
		p1.get1();
		p1.get();
		

	}

}
