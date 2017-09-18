package Inputs;

import java.util.Scanner;

public class sample {
	static Scanner SC = new Scanner(System.in);
	int N1,N2;
	void Display(int N1,int  N2)
	{
		int N3 = 0;
		N3 = N1*N2;
		System.out.print(N3);
	}


	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
   int N1,N2;
 System.out.println("enter the 1st no :");
 		N1 = SC.nextInt();
 		System.out.println("enter the 2nd no :");
 		N2 = SC.nextInt();
 		sample S = new sample();
 		System.out.println("the multi of 2 no is :");
 		S.Display(N1, N2);
	}
	

}
