

  
	 
public class Demo 
{
	enum employee{aa,ff};
		/*public int g;
		employee(int p1)
		{
			g=p1;
		}
		int get()
		{
			return g;
		}*/
	
	
	
	public static void main(String[] args)
	{
	  /*employee p1=employee.s;
      System.out.println(""+p1.get());*/
		for (employee g:employee.values())
		{
		  System.out.println(""+g);	
		}
	}

}
