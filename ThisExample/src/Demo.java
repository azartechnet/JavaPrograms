
 public class Demo 
{
     
    int a=100;
	 String uname;//class scope variable
	 void get(String uname)//methodscope variable
	 {
		 this.uname=uname;
		 System.out.println("Result is:\n"+uname);
	 }
	 void disp()
	 {
		 System.out.println("Result is:\n"+uname+""+a);
	 }
}

class D extends Demo
{
	void get1()
	{
   int a=300;
		System.out.println("Inheritance value is:\n"+uname);
		System.out.println("Inheritance Super is:\n"+super.a);
	}
}
class MainDemo
{
	public static void main(String[] args) 
	{
		D h=new D();
		h.get("niit");
		h.disp();
	    //h.get2();
		h.get1();
		

	}

}
