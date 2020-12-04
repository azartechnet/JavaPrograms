
public class Sample {

	
	public <M> M test(M t)//public int test(int t)
	{
		
		return t;
		
	}
	
	
	public static void main(String[] args) {
		
		Sample g=new Sample();
		System.out.println("IntegerValue is::"+g.test(100));
		System.out.println("StringValue is::"+g.test("azar"));

	}

}
