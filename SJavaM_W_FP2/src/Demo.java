
public class Demo {

	int productid=100;//class or instance variable
	void get1()
	{
		String productname="apple";//local variable
		System.out.println("Method-1"+productname);
	}
	void get2()
	{
		System.out.println("Method-2"+productid);
	}
	
	public static void main(String[] args) {
		

		Demo d1=new Demo();//object creation
		d1.get1();
		d1.get2();
		
	}

}
