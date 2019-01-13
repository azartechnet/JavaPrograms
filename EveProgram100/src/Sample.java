import java.util.HashSet;
import java.util.Iterator;

public class Sample
{

	
	void get1()
	{
		HashSet<String> list=new HashSet<>();
		
		list.add("a1");
		list.add("a2");
		list.add("a3");
		list.add("a1");
		
		Iterator<String> k=list.iterator();
		
		while(k.hasNext())
		{
			System.out.println(k.next());
		}
		
		System.out.println(""+list);
		System.out.println("Size "+list.size());
		System.out.println("Searching"+list.contains("a5"));
	}
	
	public static void main(String[] args) 
	{
		
    Sample g=new Sample();
    g.get1();
	}

}
