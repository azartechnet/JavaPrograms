
public class Demo 
{
	
	
	String uname="niit";//class variable
	void get1()
	{
		int sal=1000;//local variable
		System.out.println("Method one"+uname+"\t"+sal);
		System.out.println(sal);
	}
	void get2()
	{
		System.out.println("Method two"+uname);
	}

	public static void main(String as[])
	{
	
	   Demo h1=new Demo();//object creation
	   h1.get1();
	   h1.get2();
       System.out.println("MainMethod");
	}

}
