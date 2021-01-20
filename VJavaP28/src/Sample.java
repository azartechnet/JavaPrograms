import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Demo
{
	//HashMap<Integer,String>list1=new HashMap<>();
	TreeMap<Integer,String>list1=new TreeMap<>();
	void get1()
	{
		list1.put(1001,"azar");
		list1.put(1002, "mohan");
		list1.put(1003, "raja");
		
		for(Map.Entry m1:list1.entrySet())
		{
			System.out.println(""+m1.getKey()+""+m1.getValue());
		}
		
		System.out.println("Your data is::"+list1);
		System.out.println("Your size is::"+list1.size());
		System.out.println("Your searching::"+list1.containsKey(1001));
		System.out.println("Remove your data is::"+list1.remove(1001));
		System.out.println("After Removing searching::"+list1.containsKey(1001));
	}
}


public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo f1=new Demo();
		f1.get1();

	}

}
