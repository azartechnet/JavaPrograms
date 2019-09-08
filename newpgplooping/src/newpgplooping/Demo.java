package newpgplooping;

import java.util.Scanner;

public class Demo {

	int i,n;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the conduction is:");
		n=sc.nextInt();
	}
	void cal()
	{
		for(i=0;i<=n;)
		{
		if(i%2==0)
		{
			System.out.println("Even"+i);
		}
		else
		{
			System.out.println("Odd"+i);
		}
		i++;
		}
	}
	
	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.input();
		f1.cal();

	}

}
