
public class Sample
{
 
   static int p=10;
	
  /*Sample()
  {
	  p++;
	  System.out.println(p);
  }*/
  
  void get()
  {
	  p++;
	  System.out.println(p);
  }
	
}
class Demo
{
  public static void main(String as[])
  {
	//new Sample();
	//new Sample();
	  
	  Sample g1=new Sample();
	  Sample g2=new Sample();
	  g1.get();
	  g2.get();
  }
}
