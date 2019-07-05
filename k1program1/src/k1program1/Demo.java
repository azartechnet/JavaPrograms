package k1program1;

import java.lang.*;

public class Demo 
{
	int a=100;
  void get()
  {
	  int b=200;
	  System.out.println("Method-1"+a+"hhhh"+b);
  }
  void get1(String n)
  {
	  System.out.println("Method-2"+a+"***"+n);
  }
  
}

class Foo
{
	public static void main(String[] args)
	{
		
		System.out.println("MainClassStart");
		
		Demo f1=new Demo();
		f1.get();
		f1.get1("niit");
		System.out.println("MainClassEnd");
	}

}
