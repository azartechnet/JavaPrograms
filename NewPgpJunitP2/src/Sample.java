

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class Sample {

	
	int productid;
	Scanner sc=new Scanner(System.in);
	int expresult=1001;
	
	@Test
	public void add()
	{
		System.out.println("Enter the Productid::");
		
		productid=sc.nextInt();
		int actualresult=productid;
		
		if(productid==1001)
		{
			Assert.assertEquals(expresult, actualresult);
		}
		else
		{
			Assert.assertEquals(expresult, actualresult);
		}
		
	}

}
