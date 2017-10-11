import java.util.HashMap;
import java.util.Map;



public class MapExample
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> list=new HashMap<>();
		list.put(101,"a1");
		list.put(102, "a2");
		list.put(103, "a3");
		
		for(Map.Entry m:list.entrySet())
		{
			System.out.println(""+m.getKey()+""+m.getValue());
			
		}
		System.out.println("Total Size of Map"+list.size());
		System.out.println("Remove the elements of"+list.remove(101));
		System.out.println("After Remove elements"+list);
		Object obj=list.get(102);
		System.out.println("Index of the data"+obj);
		

	}

}
