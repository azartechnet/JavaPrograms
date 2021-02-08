
public class Sample {

	int productid=1001;
	String pname="apple";//class or global variable
	
	void addProduct()
	{
		
		System.out.println("This is get1 function.."+productid+""+pname);
	}
	void addCategory()
	{
		int cid=2001;
		String cname="mobile";
		System.out.println("This is get2 function.."+cid+".."+cname);
	}
	
	public static void main(String[] args) {
		
		
		Sample h1=new Sample();
		h1.addProduct();
		h1.addCategory();

	}

}
