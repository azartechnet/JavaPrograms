
public class Nestedifelse 
{

	int inc=10000;
	int exp=2000;
	int f;
	void input1()
	{
		if(inc>=10000)
		{
			if(exp>=5000)
			{
				f=inc-exp;
				System.out.println("Your income is:"+f);
			}
			else
			{
				f=inc-exp;
				System.out.println("Your income is:"+f);
			}
				
		}
		else
		{
			System.out.println("Your income low:"+f);
		}
	}
	
	public static void main(String[] args) 
	{
	  Nestedifelse g1=new Nestedifelse();
	  g1.input1();
	}

}
