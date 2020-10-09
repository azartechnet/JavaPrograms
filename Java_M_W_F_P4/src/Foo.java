
public class Foo {

	
	void get1(int price)
	{
		System.out.println("Your ProductPrice is::"+price);
	}
	void get2(int empid)
	{
		String empname="azar";
		System.out.println("Your EmployeeId is::"+empid+"Your EmployeeName is::"+empname);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Foo f1=new Foo();
		f1.get1(100);
		f1.get2(101); 
	}

}
