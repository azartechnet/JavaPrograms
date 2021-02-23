

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Sample {

	int val1,val2;
	@Before
	public void setUp() throws Exception {
		
		 val1=2;
		 val2=2;
	}

	@Test
	public void get1()
	{
		Assert.assertEquals(val1, val2);
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Result is Pass");
	}

}
