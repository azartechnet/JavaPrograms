
public class Foo
{
   String name="niit";	//class or instance variables
   void inp1()
   {
	   int age=18;//local variables
	   System.out.println("Input-1"+age+""+name);
   }
   void inp2()
   {
	   System.out.println("Input-2"+name);
   }
	
}


class Demo
{
	public static void main(String[] args) 
	{
		System.out.println("MainIn");
	    Foo g1=new Foo();
	    g1.inp1();
	    g1.inp2();
	    System.out.println("MainOUT");

	}

}
