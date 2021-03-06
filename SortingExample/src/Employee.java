
public class Employee implements Comparable<Employee>
{
	
	int empId;
	String empName;
	double salary;
	
	public Employee(int empId,String empName,double salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	public String toString()
	{
		return "Employee ID:"+empId+" Employee Name:"+empName+" Salary:"+salary;
	}

	@Override
	public int compareTo(Employee arg0) 
	{
		/*if(this.salary>arg0.salary)
			System.out.println("***"+this.salary);
		    System.out.println("&&&"+arg0.salary);
			return 1; */
		if(this.salary<arg0.salary)
			System.out.println("***"+this.salary);
	        System.out.println("&&&"+arg0.salary);
		
			return -1;
		/*else
			return 0;*/
	}
}
