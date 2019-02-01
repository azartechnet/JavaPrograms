
public class Demo 
{
   
	 void add(int a)
	 {
		 System.out.println(""+a);
	 }
	 void add(String name,int age)
	 {
		 System.out.println(""+name+""+age);
	 }
	
}
class Foo
{
	public static void main(String[] args) 
	{
		
		Demo g1=new Demo();
		g1.add(100);
		g1.add("niit",160);

	}

}
