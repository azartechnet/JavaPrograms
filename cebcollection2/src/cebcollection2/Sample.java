package cebcollection2;

import java.util.HashMap;

public class Sample
{
	
	HashMap<Integer,String>list1=new HashMap<>();
	void input()
	{
		list1.put(101,"a");
		list1.put(102,"b");
		list1.put(103,"c");
		list1.put(104,"a");
		System.out.println(list1);
		System.out.println(list1.get(101));
	}
	
}
class Demo
{
	public static void main(String[] args)
	{
	
        Sample j1=new Sample();
        j1.input();
	}

}
