package dgljunitTestCase2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArithmeticTest {

	
	public ArithmeticTest(){
		
	}
	
   @Test
   public void testFindSquareroot()
   {
	   Arithmetic obj=new Arithmetic();
	   double expResult=2.5;
	   double result=obj.findSquareroot(6.25);
	   assertEquals("findsquareRoot",expResult,result,0.0);
   }
}
