
public class Sample {

	static int a=10;
	Sample()
	{
		
		a++;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		new Sample();
		new Sample();

	}

}
