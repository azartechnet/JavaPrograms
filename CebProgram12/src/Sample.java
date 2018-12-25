
public class Sample 
{
	  String empname="azar";
	  int empid=101;
	  String college="VSB";
	  
  void get()
  {
	System.out.println("SuperClass");
  }
}
class D extends Sample
{
  void get()
  {
	  System.out.println(""+empid+""+empname+""+college);
	  super.get();
  }
}

class Demo
{

	public static void main(String[] args) 
	{
		D f1=new D();
		
		f1.get();
		

	}

}
