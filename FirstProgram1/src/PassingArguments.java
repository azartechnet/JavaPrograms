
public class PassingArguments 
{
   void h1(String name,int a1)
   {
	   System.out.println("FirstMethod:"+name+" "+a1);
   }
   void h2(float f1,int a2)
   {
	   System.out.println("SecondMethod:"+f1);
	   System.out.println("Integer"+a2);
   }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PassingArguments h=new PassingArguments();
		h.h1("azar",30);
		h.h2(3.4f,34);

	}

}
