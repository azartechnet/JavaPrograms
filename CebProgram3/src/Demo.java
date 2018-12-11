
//oops concepts
public class Demo
{
   int a=100;//class instance
  public void get1()
	{
	    String uname="niit";//local variables
		System.out.println("method-1"+a+""+uname);
	}
  public void get2()
  {
	  System.out.println("method-2"+a);
  }


	public static void main(String[] args) 
	{
		System.out.println("MainMethod..");
		Demo d1=new Demo();
		d1.get1();
		d1.get2();
	}

}
