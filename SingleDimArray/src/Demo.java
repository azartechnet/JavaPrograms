import java.util.Scanner;

public class Demo 
{
  int prd[][]=new int[2][2];	
  int n,m;
  Scanner g=new Scanner(System.in);	
  void get1()
  {
	System.out.println("Enter the n and m value is:\n");
	n=g.nextInt();
	m=g.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			System.out.println("Enter the array value is:\n");
			prd[i][j]=g.nextInt();
			System.out.println("Result is:\n"+prd[i][j]);
		}
	}
  }
}
class Demo2
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        Demo h=new Demo();
        h.get1();
	}

}
