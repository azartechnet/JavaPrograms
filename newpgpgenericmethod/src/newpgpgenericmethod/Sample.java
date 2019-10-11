package newpgpgenericmethod;


class Demo
{
	public <M> M get1(M f)
	{
		return f;
	}
}




public class Sample {

	public static void main(String[] args)
	{
		
      Demo g1=new Demo();
      System.out.println(g1.get1(100));
      
      Demo g2=new Demo();
      System.out.println(g2.get1(2.5));
      
      Demo g3=new Demo();
      System.out.println(g3.get1("niit"));
	}

}
