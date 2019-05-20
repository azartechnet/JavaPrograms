
public class Sample 
{
   int a,b,p1,p2;
   String n1;
  
   void get1(int a,int b)
   {
	   
	   this.a=a;//a1=100(a)
	   this.b=b;//b1=200(b)
	   System.out.println("Value is:"+a+""+b);
	 
   }
   void get2(int p1,int p2)
   {
	   this.p1=p1;
	   this.p2=p2;
	   System.out.println("Arguments value is:"+a+""+b);
   }
   void get3()
   {
	   System.out.println("Check"+p1+""+p2+""+n1);
   }
   
}

class Demo
{

	public static void main(String[] args) 
	{
		Sample s1=new Sample();
		s1.get1(100,200);
		s1.get2(9,9);
		s1.get3();

	}

}
