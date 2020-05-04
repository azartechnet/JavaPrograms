package dgljunittestsiteprogram;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseNumberTest {

	
	@Test
	public void testReverseNumber()
	{
		ReverseNumber instance=new ReverseNumber();
		int expResult=321;
		int result=instance.reverseNumber(123);
		assertEquals(expResult, result);
	}

}
