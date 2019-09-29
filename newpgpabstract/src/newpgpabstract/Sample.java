package newpgpabstract;



abstract class s1
{
	abstract void get1();
	void get2()
	{
		System.out.println("Normal method");
	}
}
class d extends s1
{

	@Override
	void get1() {
		
		System.out.println("abstract method");
	}
	
}




public class Sample {

	public static void main(String[] args) {
		
		/*d f1=new d();
		f1.get1();
		f1.get2();*/
		
		s1 f1=new d();
		f1.get1();
		f1.get2();
		

	}

}
