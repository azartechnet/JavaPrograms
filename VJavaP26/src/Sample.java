class Demo<T>
{
	void get1(T m)
	{
	   	System.out.println("Your value is::"+m);
	}
}



public class Sample {

	public static void main(String[] args) {
		
		Demo<String> f1=new Demo<>();
		f1.get1("azar");
		Demo<Integer> f2=new Demo<>();
		f2.get1(123);
	}

}
