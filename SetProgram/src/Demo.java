
import java.util.*;
public class Demo
{
	int i,n,ind;
   
  String name[]=new  String[10];
  Scanner g=new Scanner(System.in);
  
  void get1()
  {
	 System.out.println("Adding the value is:\n");
	 n=g.nextInt();
	 for(i=0;i<=n;i++)
	 {
		 System.out.println("Enter the value is:\n");
		 name[i]=g.next();
	 }
	 HashSet<String>g1=new HashSet<>();
	 for(i=0;i<=n;i++)
	 {
		 g1.add(name[i]);
	 }	 
		 Iterator<String>f=g1.iterator();
		 while(f.hasNext())
		 {
			 System.out.println("****"+f.next());
		 }
		 System.out.println("value is Size:"+g1.size());
		 System.out.println("Enter the index value is:\n");
		 ind=g.nextInt();
		 
		 System.out.println("Enter the remove value is:"+g1.remove(name[ind]));
		 System.out.println("value is Size:"+g1.size());
		 System.out.println("List of value is:\n"+g1.contains(name[i]));
		 
	 }
  }

class Demo1
{

	public static void main(String[] args)
	{
		Demo h=new Demo();
		h.get1();
		

	}

}
