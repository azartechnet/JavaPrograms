import java.util.HashSet;
import java.util.Iterator;

public class Sample
{

	//HashSet list=new HashSet();//collection
	HashSet<Integer>list=new HashSet<>();//JDK 1.7
	void input()
	{
		
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(103);//duplicated data
		
		
		Iterator h1=list.iterator();
		while(h1.hasNext())
		{
			System.out.println("Loop value is"+h1.next());
		}
		
		System.out.println("Before removing Total size"+list.size());
		System.out.println("Remove the data is:"+list.remove(101));
		System.out.println("After removing Total size"+list.size());
		System.out.println("After removing searching"+list.contains(101));
		
		//System.out.println("Your list is:"+list);
	}
	
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.input();

	}

}
