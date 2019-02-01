import java.util.*;

public class Demo 
{

    String movie[]=new String[10];//one dimin array
    int ticketid[]=new int[10];
    int quantity[]=new int[10];
    int price[]=new int[10];
    int tot[]=new int[10];
    int i;
    Scanner s1=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the value is:");
		for(i=0;i<=2;i++)
		{
		ticketid[i]=s1.nextInt();	
		movie[i]=s1.next();
		quantity[i]=s1.nextInt();
		price[i]=s1.nextInt();
		
		}
		
		for(i=0;i<=2;i++)
		{
			tot[i]=quantity[i]*price[i];
		}
		
		
		
	}
	void display()
	{
		System.out.println("Billing infromation");
		
		
		for(i=0;i<=2;i++)
		{
			System.out.println("Your tickeid"+ticketid[i]);
			System.out.println("Your MovieName is"+movie[i]);
			System.out.println("Your total is"+tot[i]);
		}
		
		
	}
	
	public static void main(String sr[])
	{
		Demo g1=new Demo();
		g1.input();
		g1.display();

	}

}
