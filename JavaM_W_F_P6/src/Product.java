import java.util.Scanner;

public class Product
{
   int productId,productprice;
   String productname;
   Scanner sc=new Scanner(System.in);
   void inputProcess()
   {
	   System.out.println("Enter the ProductsId...");
	   productId=sc.nextInt();
	   System.out.println("Enter the ProductsPrice...");
	   productprice=sc.nextInt();
	   System.out.println("Enter the Productsname...");
	   productname=sc.next();
   }
   void displayProcess()
   {
	   System.out.println("Your Product details is::");
	   System.out.println(productId+"\n"+productname+"\n"+productprice);
	   
   }
}


class MainProcess
{
	public static void main(String[] args) {
		
		Product p1=new Product();
		p1.inputProcess();
		p1.displayProcess();

	}

}
