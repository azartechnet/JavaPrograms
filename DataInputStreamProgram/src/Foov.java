import java.io.DataInputStream;
import java.io.IOException;

public class Foov 
{

	
	public static void main(String[] args) throws IOException
	{
		int regno;
		String name;
		float avg;
		char s;
     		DataInputStream d=new DataInputStream(System.in);
     		System.out.println("Enter the regno:\n");
     		regno=Integer.parseInt(d.readLine());
     		System.out.println("Enter charater:\n");
            s=d.readLine().charAt(0);
            System.out.println("Enter String:\n");
            name=d.readLine();
            System.out.println("Enter Float:\n");
            avg=Float.parseFloat(d.readLine());
            System.out.println("Result is;\n"+regno+""+s+""+name+""+avg);       
	}

}
