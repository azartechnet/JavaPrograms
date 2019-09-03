package krr1;

//import java.lang.*;

public class Sample
{
	int a=100;//class or instance variable
	void get1()
	{
		int b=20;//local variable
		System.out.println("Method-1"+a+"***"+b);
	}
	void get2()
	{
		System.out.println("Method-2"+a);
	}
	
  public static void main(String as[])
  {
	  System.out.println("MainIN");
	  Sample d1=new Sample();
	  d1.get1();
	  d1.get2();
	  System.out.println("MainOUT");
  }
}
