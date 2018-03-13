import java.util.*;
import java.util.Iterator;

public class Demo 
{
  
  //HashSet<String> g=new HashSet<>();
	TreeSet<String> g=new TreeSet<>();
	//ArrayList<String>g=new ArrayList<>();
  void g1()
  {
	  g.add("a1");
	  g.add("b1");
	  g.add("c1");
	  g.add("d1");
	  g.add("d1");
	  
	  
	  Iterator<String>j=g.iterator();
	  
	  //ListIterator<String>j=g.listIterator();
	  
	  while(j.hasNext())
	  {
		  System.out.println("Inside Loop is:::"+j.next());
	  }
	  
	  System.out.println("ListData is:::"+g);
	  System.out.println("Before Removing Size of is:::"+g.size());
	  System.out.println("Remove data:::"+g.remove("a1"));
	  System.out.println("Check the data:::"+g.contains("a1"));
	  System.out.println("After Removing Size of is:::"+g.size());
  }
	
}
class Demo1
{
	public static void main(String[] args) 
	{
	  Demo h=new Demo();
	  h.g1();

	}

}
