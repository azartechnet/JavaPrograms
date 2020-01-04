import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Sample {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	 @Test
	    public void multiply() {
	        int actualValue=2*9;
	        int expectedValue=18;
	        Assert.assertEquals(expectedValue, actualValue);
	    }
	 
	 @Test
	 public void check()
	 {
		 int av=2*3;
		 int ev=4;
		 Assert.assertEquals(av, ev);
	 }
}
