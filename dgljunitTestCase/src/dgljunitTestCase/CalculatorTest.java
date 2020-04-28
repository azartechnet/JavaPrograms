package dgljunitTestCase;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

public CalculatorTest() {
		// TODO Auto-generated constructor stub
	}
	
	
@BeforeClass
public static void setUpClass() throws Exception 
{
    System.out.println("@BeforeClassImplmentated..");
}

	@Test
	public void testAdd() {
		
		Calculator c1=new Calculator();
		int expectedresult=8;
		int e1=4;
		assertEquals(expectedresult,c1.add(3,5));
		assertEquals(e1,c1.mul(2, 2));
		
	}

}
