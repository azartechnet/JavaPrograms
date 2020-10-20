
public class Sample {

    int productid=101;//class or instance variable
    
	void get1()
	{
		String pname="apple";//local variable
		System.out.println("Welcome to get1 method.."+pname);
	}
	void get2()
	{
		System.out.println("Welcome to get2 method.."+productid);
	}
	
	public static void main(String[] args) {
		
		System.out.println("MainFunction..");
		Sample s1=new Sample();//Object Creations
		s1.get1();
		s1.get2();

	}

}
