
public class Sample {

	
	int a=3;
	int b=2;
	void input()
	{
		if(a%b==0)
		{
			System.out.println("Even"+a);
		}
		else
		{
			System.out.println("Odd"+a);
		}
	}
	
	public static void main(String[] args)
	{
		Sample d1=new Sample();
		d1.input();

	}

}
