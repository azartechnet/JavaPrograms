import java.util.*;

public class Demo 
{
	HashMap<Integer,String>g1=new HashMap<>();
    void g1()
    {
     g1.put(1001,"p1");
     g1.put(1002, "p2");
     g1.put(1003, "p3");
     
     for(Map.Entry m:g1.entrySet())
     {
    	 System.out.println(m.getKey()+""+m.getValue());
     }
     System.out.println(g1.remove(1001));
     System.out.println(g1.containsKey(1001));
     System.out.println(g1.get(1002));
    }

}
class Demo1
{
	

	public static void main(String[] args) 
	{
		
         Demo h=new Demo();
         h.g1();
	}

}
