import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FirstProgram 
{
	
   int productid;
   String pname;
   float productwig;
   char pgrade;
   
   //Scanner sc=new Scanner(System.in);
   DataInputStream dis=new DataInputStream(System.in);
   /*public void input()
   {
	   
	   System.out.println("Enter the Inputs:");
	   productid=sc.nextInt();
	   pname=sc.next();
	   //empname=sc.nextInt();
	   productwig=sc.nextFloat();
	   pgrade=sc.next().charAt(0);
	   
   }*/
   
   public void inputProcess() throws  IOException
   {
	  
      System.out.println("Enter the value is:");
	   productid=Integer.parseInt(dis.readLine());
	   pname=dis.readLine();
	   productwig=Float.parseFloat(dis.readLine());
	   pgrade=dis.readLine().charAt(0);
   }
   public void display()
   {
	   System.out.println("Your Id is"+productid);
	   System.out.println("Your Name is"+pname);
	   System.out.println("Your ProductWght is"+productwig);
	   System.out.println("Your ProductGrade is"+pgrade);
   }
   public void cal(int a1,String name)
   {
	   System.out.println("Arguments"+a1+""+name);
   }
}
class MainClass
{
	public static void main(String as[]) throws IOException
	{
		FirstProgram fp=new FirstProgram();
		//fp.input();
		//fp.inputProcess();
		//fp.display();
		fp.cal(100,"niit");
		
	}
}
