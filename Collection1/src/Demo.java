import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Demo 
{
 //String name;
 //Scanner g=new Scanner(System.in);
	HashSet<String>g1=new HashSet<>();
 void input()
 {
	 //System.out.println("Adding the Data");
	  g1.add("raja");
	  g1.add("mohan");
	  g1.add("azar");
	  
	  Iterator<String> h=g1.iterator();
	  while(h.hasNext())
	  {
		  System.out.println("Your Data is:\n"+h.next());
	  }
	  System.out.println("Data Size is:\n"+g1.size());
	  System.out.println("Remove the data is:\n"+g1.remove("azar"));
	  System.out.println("Searching data is:\n"+g1.contains("azar"));
 }
}

class Demo1
{
	public static void main(String[] args)
	{
		Demo j=new Demo();
		j.input();

	}

}
