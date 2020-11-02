
public class Sample {

	int a,b;
	void get1(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Get-1 function="+a+""+b);
	}
	void get2()
	{
		System.out.println("Get-2 function="+a+""+b);
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1(100,200);
		s1.get2();

	}

}
