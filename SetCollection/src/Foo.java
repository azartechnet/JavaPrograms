import java.util.*;

public class Foo
{

	TreeSet<String>list1=new TreeSet<>();
	//HashSet<String>list1=new HashSet<>();
	void p1()
	{
		list1.add("a2");
		list1.add("a1");
		list1.add("a2");
		list1.add("a3");
		
		Iterator<String>j1=list1.iterator();//Travers the data
		
		while(j1.hasNext())
		{
			System.out.println("In Loop is:"+j1.next());
		}
		
		
		System.out.println("List is:"+list1);
		System.out.println("Before Remove size"+list1.size());
		System.out.println("Remove size"+list1.remove("a1"));
		System.out.println("After Remove size"+list1.size());
		System.out.println("After Remove List is:"+list1);
		System.out.println("Searching is:"+list1.contains("a1"));
	}
	
	
	
	public static void main(String[] args) 
	{
	
		Foo g1=new Foo();
		g1.p1();

	}

}
