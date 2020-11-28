
public class Sample {

	Sample()
	{
		System.out.println("This default method..");
	}
	Sample(int a)
	{
		System.out.println("This is param cons.."+a);
	}
	
	void get1()
	{
		System.out.println("This is normal method..");
	}
	
	public static void main(String[] args) {
		
		Sample f1=new Sample();//default 
		new Sample(100);//param
		f1.get1();

	}

}
