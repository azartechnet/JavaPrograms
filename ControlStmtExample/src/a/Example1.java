package a;

import java.util.Scanner;

public class Example1 
{
	int age;
	Scanner g=new Scanner(System.in);
    void input()
    {
    	System.out.println("Enter the value is:\n");
    	age=g.nextInt();
    	if(age>=60)
    	{
    	  System.out.println("Ur SeniorCitzzz");	
    	}
    	else
    	{
    		  	System.out.println("plz check ur age");	
    		
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example1 h=new Example1();
		h.input();

	}

}
