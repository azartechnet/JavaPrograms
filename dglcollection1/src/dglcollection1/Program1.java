package dglcollection1;

import java.util.*;

public class Program1 
{
	
   TreeSet<Integer>h1=new TreeSet<>();	
   void get()
   {
	   h1.add(101);
	   h1.add(102);
	   h1.add(103);
	   
	   Iterator g1=h1.iterator();
	   
	   while(g1.hasNext())
	   {
		   System.out.println("loopValue is:"+g1.next());
	   }
	   
	   System.out.println("Result is:"+h1);
	   System.out.println("Before Removing Size is:"+h1.size());
	   System.out.println("Removing the elements is:"+h1.remove(101));
	   System.out.println("After Removing Size is:"+h1.size());
	   System.out.println("Searching the elements is:"+h1.contains(101));
   }
   
	public static void main(String[] args)
	{
		Program1 f1=new Program1();
		f1.get();

	}

}
