
public class Sample extends Thread
{
	synchronized public void get1()
   {
	   try
	   {
		   System.out.println("ThreadRunIN");
		    
		    wait(20000);
		    
		    System.out.println("ThreadRunOut");
	   }
	   catch(InterruptedException r)
	   {
		   
	   }
   }
   
   synchronized void get2()
   {
	   System.out.println("welcome..");
	   notifyAll();
   }
}

class Demo
{
	public static void main(String[] args) 
	{
		Sample t1=new Sample();
		Sample t2=new Sample();
		t1.get1();
		t2.get2();
		
        
	}

}
 