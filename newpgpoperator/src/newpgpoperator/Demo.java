package newpgpoperator;

import java.util.Scanner;

public class Demo 
{

  int a1,b1,c1;
  float f1;
  String name;
  Scanner s1=new Scanner(System.in);
  void input()
  {
	  System.out.println("Enter the value is:");
	  a1=s1.nextInt();
	  f1=s1.nextFloat();
	  name=s1.next();
  }
  void disp()
  {
	  System.out.println("Result is"+a1+""+f1+""+name);
  }
  void operator()
  {
	  System.out.println("Enter the value is:");
	  a1=s1.nextInt();
	  b1=s1.nextInt();
	  
	  System.out.println(a1>=b1);//(3>2)(True)
	  System.out.println(a1==b1);//(3==2)(False)
	  System.out.println(a1&b1);//(2==3)(2)
	  System.out.println(a1|b1);//(2==3)(3)
	  
  }
  
	
}

class Foo
{
	public static void main(String[] args) {
	
		Demo g1=new Demo();
		//g1.input();
		//g1.disp();
		g1.operator();

	}

}
