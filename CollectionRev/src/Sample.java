import java.util.HashSet;
import java.util.Iterator;

class Demo
{
	
	HashSet<Integer>list1=new HashSet<>();
	void get1()
	{
		list1.add(101);
		list1.add(102);
		list1.add(104);
		
		
		Iterator<Integer>h1=list1.iterator();
		
		while(h1.hasNext())
		{
			System.out.println("Your data is::"+h1.next());
		}
		
		System.out.println(list1);
		
	}
}




public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
	}

}
