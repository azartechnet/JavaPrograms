import java.util.Scanner;

public class Demo 
{
	int product[][]=new int[2][2];
	int i,j,n,m;
	Scanner g=new Scanner(System.in);
	 void get1()
	 {
		 
		 System.out.println("Enter the n value is:\n");
		 n=g.nextInt();
		 m=g.nextInt();
		 
		 for(i=0;i<n;i++)
		 {
			 for(j=0;j<m;j++)
			 {
			
			 System.out.println("Enter the array value is:\n");
			 product[i][j]=g.nextInt();
			 }
			
			 
		 }
		 }
		 
	 
	 void disp()
	 {
		 for(i=0;i<n;i++)
		 {
			 for(j=0;j<m;j++)
			 {
			 System.out.println("Value is:\n"+product[i][j]);
			 }
		 }
	 }
}
class Demo1
{
	public static void main(String[] args)
	{
	
        Demo t=new Demo();
        t.get1();
        t.disp();
	}

}
