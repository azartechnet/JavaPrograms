import java.util.ArrayList;
import java.util.Iterator;

public class Demo 
{

	public static void main(String[] args) 
	{
      ArrayList<String> list=new ArrayList<>();
      list.add("mohan");
      list.add("raja");
      list.add("sheik");
      
      Iterator<String>h1=list.iterator();
      
      while(h1.hasNext())
      {
    	  System.out.println("Loopvalues is"+h1.next());
      }
      
      System.out.println("Result is:\n"+list);
      System.out.println("TotalSize is:"+list.size());
      System.out.println("Index is"+list.get(2));
	}

}
