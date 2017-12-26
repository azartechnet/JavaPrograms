import java.io.*;


public class Foo 
{
	String uname;
	int age;
	float avg;
	//DataInputStream g=new DataInputStream(System.in);
	//BufferedInputStream bf=new BufferedInputStream(new InputStream(System.in));
	
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		
		
   void input() throws IOException
   {
	   System.out.println("Enter the value is:");
	   uname=bf.readLine();
	   age=Integer.parseInt(bf.readLine());
	   avg=Float.parseFloat(bf.readLine());
   }
   void dis()
   {
	   System.out.println("Result is:\n"+uname+""+age+""+avg);
   }
}
class Demo
{
	public static void main(String[] args) throws IOException
	{
	   Foo j=new Foo();
	   
	   j.input();
	   j.dis();
	  
	  

	}

}
