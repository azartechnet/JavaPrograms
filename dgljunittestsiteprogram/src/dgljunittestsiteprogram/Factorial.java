package dgljunittestsiteprogram;

public class Factorial {

	public int fact(int n)
	{
		int output;
		if(n==1)
		{
			return 1;
		}
		//Recursion function calling itself;
		output=fact(n-1)*n;
		return output;
	}
	
}
