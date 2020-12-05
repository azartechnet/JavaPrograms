import java.util.*;

public class Sample {

	HashSet<Integer>list1=new HashSet<>();
	void get1()
	{
		list1.add(1001);
		list1.add(1002);
		list1.add(1003);
		list1.add(1003);
		
		Iterator<Integer>h1=list1.iterator();
		while(h1.hasNext())
		{
			System.out.println("Your While loop value is::"+h1.next());
		}
		
		System.out.println("Your list data is::"+list1);
		System.out.println("Your size is::"+list1.size());
		System.out.println("Your value is::"+list1.contains(1001));
		System.out.println("Remove the value is::"+list1.remove(1001));
		System.out.println("After Remove Your value is::"+list1.contains(1001));
		System.out.println("After Remove Your size is::"+list1.size());
		System.out.println("Your list data is::"+list1);
	}
	
	public static void main(String[] args) {
		
		Sample d1=new Sample();
		d1.get1();

	}

}
