import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Demo 
{
	int ch;
	String cname,address;
	int age,cid;
	Scanner g=new Scanner(System.in);
	ArrayList<String> d1=new ArrayList<>();
	ArrayList<Integer> d2=new ArrayList<>();
	
	void customer()
	{
		System.out.println("...............................\n");
		System.out.println("Enter the Customer details..\n");
		System.out.println("\n...............................\n");
		System.out.println("Enter Your name..\n");
		cname=g.next();
		d1.add(cname);
		System.out.println("Enter Your cid..\n");
		cid=g.nextInt();
		d2.add(cid);
		System.out.println("Enter Your age..\n");
		age=g.nextInt();
		d2.add(age);
		System.out.println("Enter Your Address..\n");
		address=g.next();
		d1.add(address);
		
		Iterator g1=d1.iterator();
		while(g1.hasNext())
		{
			System.out.println("Your Details is:\n"+g1.next());
		}
		Iterator g2=d2.iterator();
		while(g2.hasNext())
		{
			System.out.println("Your Details is:\n"+g2.next());
		}
		
	}
	 void get1()
	 {
		 System.out.println("Enter the Choices...");
		 ch=g.nextInt();
		 switch(ch)
		 {
		 case 1:
			 customer();
			 break;
		 }
	 }
}
class Demo1
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Demo h=new Demo();
		h.get1();
		

	}

}
