class Foo<M>
{
	public <M> M get1(M m)
	{
		
		return m;
	}
}

public class Demo2 
{ 
public static void main(String[] args) {
	
	Foo g1=new Foo();
	System.out.println(g1.get1(100));
	System.out.println(g1.get1("Azar"));
	System.out.println(g1.get1(2.5));
	

	}

}
