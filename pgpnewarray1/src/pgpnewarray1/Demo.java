package pgpnewarray1;

import java.util.Scanner;

public class Demo
{
	int i,n;
	int a[]=new int[10];
	Scanner d1=new Scanner(System.in);
    void input1()
    {
    	System.out.println("Enter the value is:");
    	n=d1.nextInt();
    }
    void process()
    {
    	for(i=0;i<n;i++)
    	{
    		System.out.println("Enter the Array Value is:");
    		a[i]=d1.nextInt();
    	}
    }
    void display()
    {
    	for(i=0;i<n;i++)
    	{
    		System.out.println("Array value is:"+a[i]);
    	}
    }
	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.input1();
		f1.process();
		f1.display();

	}

}
