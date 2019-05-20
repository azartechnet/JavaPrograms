
public class Sample 
{
   void get()
   {
	   System.out.println("BaseClass");
   }
}
class Foo extends Sample
{
	void get()
	{
		super.get();
		System.out.println("DerivedClass");
	}
}

class Demo
{
	public static void main(String[] args) 
	{
		//Sample s1=new Sample();//Role-1
		//s1.get();
		
		Sample s2=new Foo();//Role-2//Run time Ploy
		s2.get();

	}

}
