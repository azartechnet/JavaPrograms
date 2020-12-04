
public class Demo {

	String pname="apple";//instance or global variable
	void get1()
	{
		int productid=1001;//local variable
		System.out.println("Welcome to get-1 function"+productid);
	}
	void get2() {
		
		System.out.println("Welcome to get2 function"+pname);
	}
	
	
	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();

	}

}
