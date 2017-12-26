
class Demo 
{
	int prdid=100;//class or instance variable
	void g1()
	{
		String uname="niit";//local variable
		System.out.println("MethodOne"+prdid+"YourName is:"+uname);
	}
	void g2()
	{
		System.out.println("MethodTwo");
	}
}
class Demo1
{
	public static void main(String[] args)
	{
		Demo g=new Demo();
		g.g1();
		g.g2();

	}

}
