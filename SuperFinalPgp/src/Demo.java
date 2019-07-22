class B
  {
   int a=100;
   String n1,n2;
  void g2(String n1,String n2)
  {
	  this.n1=n1;
	  this.n2=n2;
	  System.out.println("welcome-1::"+a);
	  System.out.println("String Process"+n1+""+n2);
  }
}
class D1 extends B
{
	void g1()
	{
		 int a=200;
		 System.out.println("welcome-2::"+super.a);
		 System.out.println("String Process-2"+n1+""+n2);
	}
}





public class Demo 
{

	public static void main(String[] args) 
	{
       D1 g=new D1();
      
       g.g2("niit","dgl");
       g.g1();
 
	}

}
