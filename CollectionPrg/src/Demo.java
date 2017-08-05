import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Demo 
{
 HashSet<String> g1=new HashSet<>();	
 void get1()
 {
	 g1.add("azar");
	 g1.add("mohan");
	 
	 Iterator<String> h=g1.iterator();
	 while(h.hasNext())
	 {
		 System.out.println("Your value is:\n"+h.next());
	 }
	 System.out.println("Size"+g1.size());
	 System.out.println("Deleted"+g1.remove("azar"));
	 System.out.println("Searching"+g1.contains("azar"));
	 System.out.println("Size"+g1.size());
 }
}
class Demo1
{
	public static void main(String[]  args) 
	{
        		Demo j=new Demo();
        		j.get1();

	}

}
