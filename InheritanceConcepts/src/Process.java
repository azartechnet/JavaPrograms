

//NormalClass Syntax
/*class ClassName
{
	//stmt
}*/
//Inheritance of class Syntax
/*
 * class className(D) extends Baseclass
 * {
 *   //Stmt;
 * }
 * 
 */
//Example Single Inheritance

class B
{
	String pname="apple";//member variable
	void get1()//NormalFunction
	{
		System.out.println("BaseClassVarible"+pname);
	}
}
class D extends B
{
	void get2()//NormalFunction
	{
		System.out.println("DerivedClass"+pname);
	}
}

public class Process
{

	public static void main(String[] args) 
	{
		
     D f1=new D();
     f1.get1();
     f1.get2();
	}

}
