
public class Sample {

	 static int a=100;
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
