import java.util.Scanner;

public class Emirp {

	 public static void main(String args[])
	  {
	    Scanner sc=new Scanner(System.in);
	    char ch;
	    do{
	int i,c=0,r,n2=0,c1=0;
	    System.out.println("Enter The Number: ");
	    int n=sc.nextInt();
	    
	    for(i=1;i<=n;i++)
	    {
	      if(n % i == 0)
	        c++;
	    }
	    if(c == 2)
	    {
	      r = n % 10;
	      n2 = (n2 * 10) + r;
	      n = n / 10;
	    }
	    for(i=1;i<=n2;i++)
	    {
	      if(n2 % i == 0)
	        c1++;
	    }
	    if ( c ==2 && c1 ==2)
	    {
	          System.out.println("***Emirp Number***\n");
	    }
	    else
	    {
	          System.out.println("***Not Emirp Number***\n");
	    }
	    System.out.println("Do You Want To Check More Numbers ? Press y / n: ");
	    ch=sc.next().charAt(0);
	    }
	    while(ch!='n');
	    System.exit(0);
	    }

}
