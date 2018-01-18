
public class Sample 
{
   Sample()
   {
	   System.out.println("welcome to niit");
   }
   Sample(int a)
   {
	   System.out.println("Your value is:\n"+a);
   }
}
class Demo
{
	
	public static void main(String[] args) 
	{
		/*Sample g=new Sample();
		
		Sample g1=new Sample(10);*/
		
		new Sample();
		
		new Sample(10);

	}

}
