import java.util.Scanner;

public class Demo 
{
	int m1,m2,m3,tot,age;
	String uname;
	Scanner g=new Scanner(System.in);
   void get1()
   {
	   System.out.println("Enter the marks...");
	   m1=g.nextInt();
	   m2=g.nextInt();
	   m3=g.nextInt();
	   tot=m1+m2+m3;
   }
   void get2()
   {
	   if(tot>=500)
	   {
		   System.out.println("Enter the name and age");
		   uname=g.next();
		   age=g.nextInt();
		   System.out.println("Your name is:"+uname+""+age+"Total"+tot);
	   }
	   else
	   {
		   System.out.println("Invalid..");
	   }
   }
}
class Demo1
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
  Demo h=new Demo();
  h.get1();
  h.get2();
	}

}
