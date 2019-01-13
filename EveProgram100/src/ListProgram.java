import java.util.ArrayList;
import java.util.Iterator;

public class ListProgram 
{
	
	
	void get1()
	{
	  ArrayList<String>k1=new ArrayList<>();
	  k1.add("b1");
	  k1.add("b2");
	  k1.add("b3");
	  k1.add("b3");
	  
	  Iterator<String>n1=k1.iterator();
	  while(n1.hasNext())
	  {
		  System.out.println(n1.next());
	  }
	  
	  
	}
	
	public static void main(String[] args)
	{
		ListProgram m1=new ListProgram();
		
		m1.get1();

	}

}
