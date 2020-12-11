class Demo<R>
{
	public <R> R get1(R t)//public int get1(int t){}
	{
	   return t;
	}
}





public class Sample {

	public static void main(String[] args) {
		
		Demo g=new Demo();
		System.out.println(g.get1(100));
		System.out.println(g.get1("azar"));

	}

}
