package dowhileloop;

public class Sample {

	
	int i,n=5;
	void get1()
	{
		i=0;
		do
		{
			System.out.println("I value is"+i);
			i++;
		}
		while(i<=n);
	}
	
	public static void main(String[] args) 
	{
      Sample f1=new Sample();
      f1.get1();
	}

}
