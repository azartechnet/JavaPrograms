import java.util.Scanner;

public class ValidateAge 
{
	public static void main(String[] args) 
	{
	
	        int age;
	        Scanner obj1 = new Scanner(System.in);
	        System.out.println("Enter the age: ");
	        age = obj1.nextInt();
	         if (age <= 0){
	            try 
	{
	            	throw new AgeException();
	}
catch (AgeException e)
 {        
		System.out.println("Exception raised");

	}
}
else
{
	System.out.println("Age entered is " + age);
}

}



	}



