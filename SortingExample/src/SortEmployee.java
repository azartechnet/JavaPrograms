import java.util.TreeSet;

public class SortEmployee 
{

	public static void main(String arg[])
	{
		TreeSet<Employee> listEmployees=new TreeSet<Employee>();
		
		listEmployees.add(new Employee(1001,"Vinod",108000));
		listEmployees.add(new Employee(1003,"Arun",208000));
		listEmployees.add(new Employee(1002,"Sunita",88000));
		listEmployees.add(new Employee(1004,"Kishore",28000));
		
		for(Employee employee:listEmployees)
		{
			System.out.println(employee);
		}
		
	}

}
