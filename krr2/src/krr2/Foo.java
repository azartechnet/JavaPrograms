package krr2;

import java.util.Scanner;

public class Foo 
{

  int pid;
  float f1;
  String name;
  Scanner s1=new Scanner(System.in);
  void input()
  {
	  System.out.println("Enter the value is:");
	  pid=s1.nextInt();
	  f1=s1.nextFloat();
	  name=s1.next();
  }
  void display()
  {
	  System.out.println("Yourpid"+pid+"Your float"+f1+"your name"+name);
  }
}	
	
	
class Demo
{
	public static void main(String[] args) {
		

		Foo g1=new Foo();
		g1.input();
		g1.display();
	}

}
