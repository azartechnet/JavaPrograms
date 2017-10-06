import java.util.Scanner;

public class Logic 
{
	int n,rem=0,s;
	int i;
	int fact=1;
	Scanner g=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is:\n");
		n=g.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Your fact value is:\n"+fact);
	}
	void arm()
	{
		
		int temp,n1;
		System.out.println("Arm n value is:\n");
		n1=g.nextInt();
		temp=n1;
		while(n1!=0)
		{
			rem=n1%10;
			s=s+rem*rem*rem;
			n1=n1/10;
		}
		if(temp==s)
		{
		System.out.println("Arm");
		}
		else
		{
			System.out.println("NotArm");
		}
	}
}
class Sample
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Logic h=new Logic();
		h.input();
		h.arm();

	}

}
