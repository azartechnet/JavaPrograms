package j1Program1;

public class Demo1 
{

	String uname="niit1";
	void f1()
	{
		switch(uname)
		{
		case "niit":
			System.out.println("Welcome to niit");
			break;
		case "live":
			System.out.println("welcome to live");
			break;
		default:
			System.out.println("default Process");
			break;
		}
	}
	
	
	public static void main(String[] args) 
	{
		Demo1 g1=new Demo1();
		g1.f1();

	}

}
