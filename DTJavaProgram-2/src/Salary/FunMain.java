package Salary;

public class FunMain {

	public static void main(String[] args) 
	{
	  CalSalary c=new CalSalary();
	  c.setEmpname("azar");
	  c.setEmpid(101);
	  c.setBasic(10000);
	  c.setHra(2);
	  c.setDa(3);
	  System.out.println("Your Employee details is:\n"+c.calsalary()+"Your EmpName"+c.getEmpname()+"Your EmpId"+c.getEmpid());

	}

}
