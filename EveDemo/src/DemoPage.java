
public class DemoPage 
{
	
   void get(float f)
   {
	   
	   
	   System.out.println("welcome method-1"+f);
   }
   void disp(String name,int b)
   {
	  System.out.println("welcome method-2"+name+""+b); 
   }
	public static void main(String[] args) 
	{
	   DemoPage g=new DemoPage();
	   g.get(4.5f);
	   g.disp("niit",100);

	}

}
