package cebCollection1;

import java.util.HashSet;
import java.util.Iterator;

public class Sample
{

	HashSet<String>list1=new HashSet<>();
	
	void input()
	{
		 list1.add("a");
		 list1.add("b");
		 list1.add("c");
		//list1.add("a");
		Iterator<String>h=list1.iterator();
		
		while(h.hasNext())
		{
		
		System.out.println("List Value is:"+h.next());
		}
		System.out.println("Size of list1"+list1.size());
		System.out.println("Remove data"+list1.remove("a"));
		System.out.println("After Removing Size of list"+list1.size());
		System.out.println("Searching the data is:"+list1.contains("a"));
	}
}
class Demo
{
	public static void main(String[] args)
	{
		Sample s1=new Sample();
		s1.input();

	}

}
