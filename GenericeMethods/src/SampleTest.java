
public class SampleTest
{
	public <M> void test(M t)
	{
		System.out.println("Generic Methods.."+t);
	}
	
	
   public static void main(String as[])
   {
	   SampleTest g=new SampleTest();
	   
	   g.test(100);
	   
	   g.test(2.3);
	   
	   g.test("niit");
   }
}
