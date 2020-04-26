package dgljunitTestCase1;

import static org.junit.Assert.*;

import org.junit.Test;

public class EvenOrOddTest {

	public EvenOrOddTest()
	{
		
	}

	@Test
	public void testIsEvenNumber()
	{
		EvenOrOdd e=new EvenOrOdd();
		assertTrue(e.isEvenNumber(5));
		assertFalse(e.isEvenNumber(3));
	}
}
