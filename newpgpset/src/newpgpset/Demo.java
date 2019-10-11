package newpgpset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Sample
{
	//HashSet<Integer>list=new HashSet<>();//to creat the hashset
	
	  TreeSet<Integer>list=new TreeSet<>();
	
	void input()
	{
		list.add(100);
		list.add(100);
		list.add(103);
		list.add(104);
		
		Iterator j1=list.iterator();
		
		while(j1.hasNext())
		{
			System.out.println("Inside loop is:"+j1.next());
		}
		
	  	System.out.println("Outside of loop:"+list);
	  	System.out.println("Before Removing Size:"+list.size());
	  	System.out.println("Removing the data:"+list.remove(100));
	  	System.out.println("After Removing Size:"+list.size());
	  	System.out.println("Searching:"+list.contains(100));
	}
}



public class Demo {

	public static void main(String[] args) {
		
		Sample k1=new Sample();
		k1.input();
		
		
	}

}
