import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Demo 
{


    //String a;
   //int a;
   //Scanner g=new Scanner(System.in);
    void get()
    {
        HashSet<String> f=new HashSet<>();
        System.out.println("Enter the a value is:");
        //a=g.nextInt();
       // a=g.next();
       //f.add(a);
        f.add("raja");
        f.add("b1");
        f.add("c1");
        f.add("d1");
        
        
        System.out.println("Remove"+f.remove("b1"));
        System.out.println("Data"+f.size());
        System.out.println("Searching"+f.contains("b1"));
        
        Iterator d1=f.iterator();
        while(d1.hasNext())
        {
            System.out.println("\nUsing Iterator\n"+d1.next());
           
        }
         System.out.println("Data"+d1.getClass());
         System.out.println("Remove"+f.remove("b1"));
        System.out.println("Searching"+f.contains("b1"));

           
    }
  
}
class Demo1
{
	
	public static void main(String[] args) 
	{
	 Demo j=new Demo();
	 j.get();
		

	}

}
