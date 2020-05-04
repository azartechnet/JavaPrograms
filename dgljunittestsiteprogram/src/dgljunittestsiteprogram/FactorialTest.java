package dgljunittestsiteprogram;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	
	@Test
	public void testFact()
	{
		int num=6;
		Factorial instance=new Factorial();
		int expResult=720;
		int result=instance.fact(num);
		assertEquals(expResult, result);
	}

}
