import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionExample 
{
	
	ArrayList<String> k1=new ArrayList<>();
	void get1()
	{
	 	k1.add("a1");
	 	k1.add("a2");
	 	k1.add("a3");
	 	k1.add("a3");
	 	
	 	Iterator<String> h=k1.iterator();
	 	while(h.hasNext())
	 	{
	 		System.out.println("ArrayListData"+h.next());
	 	}
	 	
	 	System.out.println(""+k1.size());
	 	System.out.println(""+k1.remove("a1"));
	 	System.out.println(""+k1.contains("a1"));
	 	
	}
}
class Demo
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionExample l=new CollectionExample();
		l.get1();

	}

}
