import java.util.HashMap;

public class HashMapExample 
{
	HashMap<String,Integer> k1=new HashMap<>();
	void process()
	{
	  k1.put("j1",1000);
	  k1.put("j2",1002);
	  k1.put("j3",1003);
	  k1.put("j4",1004);
	  
	  
	  System.out.println("value is:\n"+k1);
	  System.out.println("Searching"+k1.containsKey("j4"));
	  System.out.println("value is:\n"+k1.containsValue(1004));
	}
}
class Sample
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMapExample l=new HashMapExample();
		l.process();

	}

}
