interface B1
{
	int productid=100;
	public void get1();
}
interface B2 extends B1
{
	int categoryid=201;
	String cname="mobile";
	public void get2();
}
class D1 implements B2
{
	public void get1()
	{
		System.out.println("Your id::"+productid);
	}
	public void get2()
	{
		System.out.println("Your category id::"+categoryid+""+cname);
	}
}





public class Sample {

	public static void main(String[] args) {
		
		D1 f1=new D1();
		f1.get1();
		f1.get2();

	}

}
