package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Demo
{
	//String name;
	ArrayList<String>g=new ArrayList<>();
	/*Scanner k=new Scanner(System.in);*/
	void get1()
	{
//	  System.out.println("Enter the String data:\n");	
	  //name=k.next();
	 /* g.add(name);*/
	   g.add("p1");
	   g.add("p2");
	   g.add("p3");
	  Iterator h=g.iterator();
	  while(h.hasNext())
	  {
		  System.out.println("Your data is:\n"+h.next());
	  }
	  System.out.println("Size of data"+g.size());
	  System.out.println("Remove of data"+g.remove(0));
	  System.out.println("Size of data"+g.size());
	  System.out.println("Search the data"+g.contains("p1"));
	}
}
class Foo
{
	public static void main(String[] args) 
	{
		Demo j=new Demo();
		j.get1();
		

	}

}
