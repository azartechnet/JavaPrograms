
public class SampleApp 
{
   
  SampleApp()
  {
	  System.out.println("Welcome default class..");
  }
  SampleApp(double u)
  {
	  System.out.println("welcome to "+u);
  }
	
}

class Demo
{
	public static void main(String[] args)
	{
		
		new SampleApp(123.55555);
		new SampleApp();
		

	}

}
