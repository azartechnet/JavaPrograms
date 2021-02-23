import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;



public class SampleTest {


	@Test(expected=ArithmeticException.class)
	public void get1()
	{
		int a=10,b=0,er,exptresult,actualresult;
		actualresult=a/b;
		exptresult=20;
		Assert.assertEquals(exptresult,actualresult);
		System.out.println("Exception..");
	}

}
