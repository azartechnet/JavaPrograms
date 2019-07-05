	import java.util.*;

public class MapProgram 
{
	
TreeMap<Integer,String> g1=new TreeMap<Integer,String>();
 void get()
 {
	 g1.put(101, "Azar");
	 g1.put(102, "mohan");
	 
	 for(Map.Entry m:g1.entrySet())
	 {
		 
		
		 System.out.println("Your value is:\n"+m.getKey()+""+m.getValue());
	 }
	 System.out.println("Your size is:\n"+g1.size());
	 System.out.println("Remove the elements is:\n"+g1.remove(101));
	 System.out.println("Search the data is:\n"+g1.containsKey(101));
	 System.out.println("After removing size is:\n"+g1.size());
 }
}
class Demo
{
	public static void main(String[] args)
	{
		
		MapProgram h=new MapProgram();
		h.get();

	}

}
