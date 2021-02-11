
public class Demo {

	int productid=1001;
	void get1()
	{
		String pname="apple";
		System.out.println("Method-1"+productid+""+pname);
	}
	void get2()
	{
		System.out.println("Method-2"+productid);
	}
	
	public static void main(String[] args) {
		
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2();
		
	}

}
