package snippet;

import java.util.Scanner;

public class Snippet 
{
	
	int n,m;
	Scanner s1=new Scanner(System.in);
	
	void input()
	{
		System.out.println("Enter the n and m value is:");
		n=s1.nextInt();
		m=s1.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
			System.out.println("i value\t"+i);
			System.out.println("J value\t"+j);
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
	  Snippet d1=new Snippet();
	  d1.input();
	}
}

