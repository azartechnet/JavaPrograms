import java.util.ArrayDeque;

public class ArrayDequeExample
{
	ArrayDeque<Integer> h1=new ArrayDeque<>();
	void g1()
	{
		h1.add(101);
		h1.add(102);
		h1.add(103);
		
		h1.addFirst(105);
		
		h1.addLast(109);
		
		h1.addLast(110);
		
		h1.removeFirst();
		
		//h1.removeLast();
		
		
		
		System.out.println("Display"+h1+"size"+h1.size());
		
	}
}
class Demo
{
	public static void main(String[] args) 
	{
		ArrayDequeExample k=new ArrayDequeExample();
		k.g1();

	}

}
