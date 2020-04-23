package dglpgpJunitP1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestProgram1 {

	
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
	 public void checkProcess()
	 {
		 String username="admin@123";
		 String password="admin";
		 if(username.equals("admin")&&password.equals("admin"))
		 {
			 System.out.println("LogicSuces..");
			 Assert.assertEquals(username,password);
		 }
		 else
		 {
			 System.out.println("LogicFail..");
			 Assert.assertNotEquals(username, password);
		 }
	 }
}
