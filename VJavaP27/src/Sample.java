import java.util.HashSet;

class Demo
{
	HashSet<Integer>list1=new HashSet<>();
	void get1()
	{
		list1.add(101);
		list1.add(102);
		list1.add(103);
		
		System.out.println("Your value is::"+list1);
		System.out.println("Your data size is::"+list1.size());
		System.out.println("Searching the data is::"+list1.contains(101));
		System.out.println("Remove the data is::"+list1.remove(101));
		System.out.println("After Removing data size is::"+list1.size());
	}
}

public class Sample {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
	}

}
