package krrCollectionNew;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

class Foo
{
	//HashSet<String>list1=new HashSet<>();
	
	//TreeSet<String>list1=new TreeSet<>();
	
	ArrayList<String>list1=new ArrayList<>();
	void get1()
	{
		list1.add("niit");
		
		list1.add("livewire");
		
		list1.add("IIHT");
		
		list1.add("niit");//duplicate data
		
		Iterator<String>g1=list1.iterator();
		
		
		while(g1.hasNext())
		{
			System.out.println(g1.next());
		}
		
	//	System.out.println("Data is:"+list1);
		
		System.out.println("Before Remove size"+list1.size());
		
		System.out.println("Remove the data is:"+list1.remove("niit"));
		
		System.out.println("After Remove size"+list1.size());
		
		System.out.println("Searcging"+list1.contains("niit"));
		
		System.out.println("Data is:"+list1);
	}
}

public class SetCollection {

	public static void main(String[] args) {
		
		
		Foo f1=new Foo();
		
		f1.get1();

	}

}
