import java.util.HashMap;
import java.util.Map;

public class Sample 
{
	
	
  HashMap<Integer,String>list1=new HashMap<>();	
  void process()
  {
	  list1.put(101,"a1");
	  list1.put(102,"a2");
	  list1.put(103,"a3");
	  list1.put(104,"a4");
	  
	  for(Map.Entry m1:list1.entrySet())
	  {
		  System.out.println("Display Key and value is:"+m1.getKey()+""+m1.getValue());
		  
	  }
	  
	  
	  System.out.println("Result is:"+list1);
	  
	  System.out.println("Key:"+list1.get(101));
	  
	  System.out.println("TotalSize:"+list1.size());
	  
	  System.out.println("Removing:"+list1.remove(101));
	  
	  System.out.println("Searching:"+list1.containsKey(101));
  }
	public static void main(String[] args) 
	{
		Sample r1=new Sample();
		r1.process();

	}

}
