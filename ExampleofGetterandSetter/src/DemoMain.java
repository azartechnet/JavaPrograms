
public class DemoMain 
{
  public static void main(String as[])
  {
	  DemoFirst g=new DemoFirst();
	  g.setEmpname("azar");
	  g.setEmpid(101);
	  g.setSal(1000);
	  System.out.println("Value is:\n"+g.getEmpname());
	  System.out.println("Value is:\n"+g.getEmpid());
	  System.out.println("Value is:\n"+g.cal());
  }
}
