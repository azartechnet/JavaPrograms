import static org.junit.Assert.*;

import org.junit.Test;

public class Sample {

	
	
	
	@Test
	public void testFindSquareroot() {
		Arithmetic instance = new Arithmetic();
		double expResult = 2.5;
		double result = instance.findSquareroot(6.25); 
		assertEquals("**",expResult, result,0.0);
		
		
		}


}
