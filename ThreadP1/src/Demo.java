
//To creating a simple thread program

class Foo implements Runnable
{
  public void run()
	{
		System.out.println("Welcome to niit");
	}
  
  void get1()
  {
	  System.out.println("welcome to normal method");
  }
}
public class Demo {

	public static void main(String[] args) {
	
		Foo t1=new Foo();
		
		Thread p1=new Thread(t1);
		p1.start();
		 t1.get1();
       
	}

}
