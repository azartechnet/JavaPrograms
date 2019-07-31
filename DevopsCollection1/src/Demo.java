import java.util.HashSet;
import java.util.TreeSet;

public class Demo 
{
	
   //HashSet h1=new HashSet();//collection
   //HashSet<Integer>h1=new HashSet<>();//Generic
	TreeSet<Integer>h1=new TreeSet<>();
	
   void input()
   {
	   h1.add(101);
	   h1.add(102);
	   h1.add(103);
	   h1.add(103);
	   
	   System.out.println("ListData"+h1);
	   System.out.println("TotalSize"+h1.size());
	   System.out.println("BeforeRemovingSearch"+h1.contains(101));
	   System.out.println("Remove"+h1.remove(101));
	   System.out.println("AfterRemoving"+h1.contains(101));
	   System.out.println("AfterRemovingTotalSize"+h1.size());
   }
}

class Foo
{
	public static void main(String[] args) 
	{
		
		Demo g1=new Demo();
		g1.input();

	}

}
