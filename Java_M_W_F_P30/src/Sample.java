import java.util.HashSet;
import java.util.Iterator;

public class Sample {

	
	void input()
	{
		HashSet<Integer>list1=new HashSet<>();
		
		list1.add(101);
		list1.add(102);
		list1.add(103);
		list1.add(103);
		
		Iterator h1=list1.iterator();
		while(h1.hasNext())
		{
			System.out.println("Your data is::"+h1.next());
		}
		
		System.out.println("Data is::"+list1);
		System.out.println("Size is::"+list1.size());
		System.out.println("Remove the data is::"+list1.remove(101));
		System.out.println("Searching the data is::"+list1.contains(101));
		System.out.println("After Removing Data is::"+list1);
	}
	
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.input();
	}

}
