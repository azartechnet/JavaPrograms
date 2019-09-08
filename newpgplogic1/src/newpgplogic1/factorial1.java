package newpgplogic1;

import java.util.Scanner;

public class factorial1 {
	int i,n;
    int fact=1;
    Scanner f1=new Scanner(System.in);
    void input()
    {
        n=f1.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
    void swap()
    {
    	int a=10,b=20;
    	int temp;
    	
    	//With using third variable
    	temp=a;
    	a=b;
    	b=temp;
    	
    	System.out.println(a+""+b);
    	
    	
    	
    }
        		
	public static void main(String[] args) {
		

		factorial1 h1=new factorial1();
		//h1.input();
		h1.swap();
		
	}

}
