 public class StaticExample 
{
	
	String uname,pass;
	static int a=100;
    public StaticExample() 
    {
    	a++;
    	System.out.println("Value is:"+a);
	}
    public StaticExample(int studentid)
    {
    	System.out.println("YourStudent id is:\n"+studentid);
    }
    void get(String uname,String pass)
    {
    	
    	this.uname=uname;
    	this.pass=pass;
    	System.out.println("YourUsername"+uname+"YourPass"+pass);
    }
    void display()
    {
    	if(uname.equals("admin")&&pass.equals("admin"))
    	{
    		System.out.println("LoginSucess!!");
    	}
    	else
    	{
    		System.out.println("LoginFail!!!");
    	}
    }
    void get3()
    {
    	
    }
} 
   class Demo5 extends StaticExample
   {
	   //final int dl=300;
	  void get3()
	  {
		  int dl=100;  
		  System.out.println("FinalKeyword"+dl);
	  }
   }
   class MainDemo
   {
	public static void main(String[] args) 
	{
		new StaticExample();
		StaticExample h=new StaticExample(103);
	
		h.get("admin","admin");
		h.display();
		Demo5 j=new Demo5();
		j.get3();
		

	}

}
