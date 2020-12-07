import java.util.HashMap;
import java.util.Map;

public class Sample {

	HashMap<Integer,String>list1=new HashMap<>();
	void get1()
	{
		list1.put(1001,"azar");
		list1.put(1002,"raja");
		list1.put(1003,"abi");
		list1.put(1004,"mohan");
		//list1.put(1004,"");
		for(Map.Entry h1:list1.entrySet())
		{
			System.out.println("Inside for loop is::"+h1);
			//System.out.println("Only get the key::"+h1.getKey());
			//System.out.println("Only get the value::"+h1.getValue());
		}
		//System.out.println("Your value is::"+list1);
		
		System.out.println("SearchingKey::"+list1.containsKey(1001));
		System.out.println("SearchingValue::"+list1.containsValue("abi"));
		
	}
	
	public static void main(String[] args) {
	
		Sample f1=new Sample();
		f1.get1();
	

	}

}
