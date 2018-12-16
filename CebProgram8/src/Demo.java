import java.util.Scanner;

public class Demo 
{
	
   String name[][]=new String[2][2];
   int i,j,n,m;
   Scanner f1=new Scanner(System.in);
   void input()
   {
	   System.out.println("Enter the n and m value ");
	   n=f1.nextInt();
	   m=f1.nextInt();
	   
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<m;j++)
		   {
			   System.out.println("Enter the arry value is:");
			   name[i][j]=f1.next();
		   }
		   
	   }
	   for(i=0;i<n;i++)
	   {
		   for(j=0;j<m;j++)
		   {
			   System.out.println("Your value is:"+name[i][j]);
			   
		   }
		   
	   }
	   
   }
}
class Foo
{
	public static void main(String[] args) 
	{
		Demo g=new Demo();
		g.input();

	}

}
