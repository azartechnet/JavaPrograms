package dgljunitRunWithExample;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorTest {

	private int a;
	private int b;
	private int expected;
	
	public CalculatorTest(int a,int b,int expected)
	{
		this.a=a;
		this.b=b;
		this.expected=expected;
	}
	@Test
	public void testAdd()
	{
		Calculator instance=new Calculator();
		int actual=instance.add(a, b);
		Assert.assertEquals(expected, actual);
	}
	@Parameters
	public static Collection<Integer[]>getParamter()
	{
		Integer [][]inputArr;
		inputArr=new Integer[][] {{1,2,3},{-1,2,1},{2,2,4},{4,0,4}};
		return Arrays.asList(inputArr);
	}
	

}
