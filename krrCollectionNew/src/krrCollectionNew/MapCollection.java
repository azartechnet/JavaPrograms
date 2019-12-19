package krrCollectionNew;

import java.util.HashMap;
import java.util.Map;

class Demo
{
	
	HashMap<Integer,String>list1=new HashMap<>();
   void get1()
   {
	   list1.put(101,"a");
	   
	   list1.put(102,"b");
	   
	   list1.put(103,"b");
	   
	   for(Map.Entry<Integer,String>g1:list1.entrySet())
	   {
		   System.out.println("Key"+g1.getKey()+"Value"+g1.getValue());
	   }
	   
	   
	  
	   
	   System.out.println(list1.size());
	   
	   System.out.println(list1.get(101));
	   
	   System.out.println(list1.remove(101));
	   
	   System.out.println(list1.containsKey(102));
   }
}

public class MapCollection {

	public static void main(String[] args) {
		
		
		Demo h1=new Demo();
		h1.get1();

	}

}
