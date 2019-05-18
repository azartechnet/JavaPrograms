
public class Sample 
{
  
	 int a=100;
	void get1()
	{
		a++;
		System.out.println("value is:"+a);
	}
	
	public static void main(String[] args) 
	{
 		Sample s1=new Sample();
 		Sample s2=new Sample();
 		s1.get1();
 		s2.get1();
 		s2.get1();
 		s1.get1();

	}

}
