
public class Demo {

	void get1(int empid,String empname)
	{
	System.out.println("yourEmployeeid::"+empid+"\n"+empname);	
	}
	void get2(int categoryid,String cname)
	{
		System.out.println("Your categoryid::"+categoryid+"\n"+cname);
	}
	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1(1001,"azar");
		f1.get2(2001,"mobile");

	}

}
