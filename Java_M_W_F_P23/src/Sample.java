
public class Sample {

	void get1(int empid,String empname)
	{
		System.out.println("Your empid::"+empid+""+empname);
	}
	void get1(int categoryid,int price)
	{
		System.out.println("Your categoryid::"+categoryid+""+price);
	}
	void get1(int price)
	{
		System.out.println("Your price::"+price);
	}
	public static void main(String[] args) {

		Sample s1=new Sample();
		s1.get1(101,"azar");
		s1.get1(202,400);
        s1.get1(300);
	}

}
