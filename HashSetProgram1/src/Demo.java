import java.util.HashSet;
import java.util.Iterator;

public class Demo 
{
	
  HashSet<Integer>list1=new HashSet<>();	
  void input()
  {
	  list1.add(101);
	  list1.add(102);
	  list1.add(103);
	  list1.add(103);
	  
	  
	  Iterator j1=list1.iterator();
	  
	  while(j1.hasNext())
	  {
		  System.out.println("Display the data is:"+j1.next());
	  }
	  
	 // System.out.println("View the data is:"+list1);
	  
	  
	  System.out.println("Totalsize is:"+list1.size());
	  
	  System.out.println("Remove is:"+list1.remove(101));
	  
	  
	  System.out.println("Searching is:"+list1.contains(101));
	  
	  System.out.println("AfterRemovesize is:"+list1.size());
	  
  }
  
	public static void main(String[] args) 
	{
	
		Demo g1=new Demo();
		g1.input();

	}

}
