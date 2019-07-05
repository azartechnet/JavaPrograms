
public class Demo1 
{
	
	 int f1=300;//class variable
	 void fun1()
	 {
		 int d=100;//local variable
		 System.out.println("Method-1::"+f1+""+d);
	 }
	 void fun2(String name)
	 {
		 System.out.println("Method-2::"+f1+""+name);
	 }
}


class Foo
{
	public static void main(String[] args) {
	
		System.out.println("Welcome to niit");
		Demo1 g1=new Demo1();
		g1.fun1();
		g1.fun2("niit");
		
	}

}
