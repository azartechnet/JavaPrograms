package cebcollection2;

import java.util.HashMap;
import java.util.Map;

public class Sample1 {

	HashMap<Integer,String>list1=new HashMap<>();
	void input()
	{
		list1.put(101,"a");
		list1.put(102,"b");
		list1.put(103,"c");
		list1.put(104,"a");
	
		
		for(Map.Entry h1:list1.entrySet())
		{
			System.out.println(h1);
		}
		System.out.println(list1.containsKey(102));
		
		
	}
	public static void main(String as[])
	{
		Sample1 j1=new Sample1();
		j1.input();
	}

}
