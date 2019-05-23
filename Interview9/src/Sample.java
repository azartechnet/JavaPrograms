import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Sample
{

	
	//HashSet h1=new HashSet();//collection
	
	//HashSet<String> h1=new HashSet<>();
	
	ArrayList<String> h1=new ArrayList<>();
	void get()
	{
		h1.add("a");
		h1.add("b");
		h1.add("c");
		h1.add("a");//duplicated not allowed
		
		Iterator<String> g1=h1.iterator();
		while(g1.hasNext())
		{
			System.out.print(g1.next());
		}
		
		System.out.println("Beforesize"+h1.size());
		
		System.out.println("BeforeSearching"+h1.contains("a"));
		
		System.out.println("Removing"+h1.remove("a"));
		
		System.out.println("AfterSearching"+h1.contains("a"));
		
		System.out.println("Aftersize"+h1.size());
		
		//System.out.println("list"+h1);
	}
	
}

class Demo
{
	public static void main(String[] args) 
	{
	
      Sample s1=new Sample();
      s1.get();
	}

}
