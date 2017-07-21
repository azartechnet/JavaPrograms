
public class Demo 
{
  Demo()
  {
	  System.out.println("Default cons....");
  }
  Demo(int productid,String pname)
  {
	  System.out.println("Your product id is:\n"+productid+"\nYour product name is:\n"+pname);
	  
  }
  void get()
  {
	  System.out.println("Normal function!!!");
  }
}
class Sample
{
		
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Demo g=new Demo();
		new Demo(101,"xyz");
        g.get();
	}

}
