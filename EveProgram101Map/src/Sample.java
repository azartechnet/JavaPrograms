import java.util.*;


public class Sample
{

	
	HashMap<Integer,String>list=new HashMap<Integer, String>();
	void get1()
	{
		list.put(101,"azar");
		list.put(102, "mohan");
		list.put(103, "mohan");
		
		for(Map.Entry m1:list.entrySet())
		{
			System.out.println(m1.getKey());
			System.out.println(m1.getValue());
		}
		
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.remove(101));
		System.out.println(list.containsKey(101));
		
	}
	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.get1();

	}

}
