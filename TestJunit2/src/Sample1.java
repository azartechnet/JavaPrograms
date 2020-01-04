

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Sample1 {

	
	@Before
 public void setUp() {
		
		int a=2;
		int b=2;
		
		int c=a+b;
		
		System.out.println("BeforeTestMethod"+c);

	}
	
	@After
	public void tearDown()
	{
		System.out.println("AfterExecuted..");
	}
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	
	@Test
	public void addTest()
	{
		Sample2 f1=new Sample2();
		int expres=4;
		
		assertEquals(expres,f1.add(2,2));
	}
	

	
	
}
