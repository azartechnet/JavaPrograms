package dgljunitexception;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	
	
	@Test(expected=ArithmeticException.class)
	public void testDivide()
	{
		Calculator instance=new Calculator();
		instance.divide(4, 0);
	}
}
