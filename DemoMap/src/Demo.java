import java.util.HashMap;
import java.util.Map;

public class Demo
{
	
	HashMap<Integer,String>k=new HashMap<>();
	void g2()
	{
	  k.put(1001,"a1");
	  k.put(1002, "a2");
	  
	  
	  for(Map.Entry m:k.entrySet())
	  {
	  
	  System.out.println("Key is:\n"+m.getKey()+"Values is:::"+m.getValue());
	  }
	  System.out.println("Befores Removing the size is:::"+k.size());
	  System.out.println("Remove data is::"+k.remove(1001));
	  System.out.println("Searching data is::"+k.containsKey(1001));
	  System.out.println("After Removing the size is:::"+k.size());
	  System.out.println("Index is:::"+k.get(1002));
	}
}
class Demo1
{
	public static void main(String[] args) 
   {
		Demo p=new Demo();
		p.g2();

	}
}

