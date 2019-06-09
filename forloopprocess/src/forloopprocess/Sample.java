package forloopprocess;

public class Sample 
{

  int n=5;
  int i;
  void get()
  {
	  for(i=0;i<=n;i++)
	  {
		  System.out.println("Value is:"+i);
	  }
  }
	public static void main(String[] args) 
	{
	
        Sample s1=new Sample();
        s1.get();
	}

}
