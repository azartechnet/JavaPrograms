
public class SampleTest
{
	public <M> M test(M t)
	{
		//System.out.println("Generic Methods.."+t);
		return t;
	}
	
	
   public static void main(String as[])
   {
	   SampleTest g=new SampleTest();
	   
	   g.test(100);
	   
	   g.test(2.3);
	   
	   g.test("azar");
   }
}
