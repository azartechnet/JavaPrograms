
public class Foo 
{
	String uname="admin";//class or instance variables
   void f1(String name,int h1)
   {
	   double d=3.4;//local varibales
     System.out.println("welcome-1"+name+"Integervalue is:\n"+h1);	
     System.out.println("Double is:\n"+d);
   }
   void f2(float t1)
   {
	   System.out.println("welcome-2"+t1);	   
   }
}
class Demo
{
	public static void main(String[] args) 
	{
		
		Foo ob=new Foo();
		ob.f1("niit",10);
		ob.f2(2.4f);
		
       //System.out.println("welcome");
	}

}
