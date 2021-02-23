import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Sample {

	
	@Test
	public void get1()
	{
		
		int expected=4;
		MainClass m1=new MainClass();
		int actualresult=m1.mul(2, 2);
		Assert.assertEquals(expected, actualresult);
	}
	
	

}
