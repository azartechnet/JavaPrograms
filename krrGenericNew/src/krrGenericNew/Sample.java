package krrGenericNew;

class GenericClass<T>
{
	private T t;//int t;
	void setVal(T t)
	{
		this.t=t;
	}
	void getVal()
	{
		System.out.println("Generic value is:"+t);
	}
	
}

public class Sample {

	public static void main(String[] args) {
		
		GenericClass<Integer>g1=new GenericClass<>();//Jdk1.7 You  have mention oneside
		GenericClass<String>g2=new GenericClass<>();
		 g1.setVal(100);
		 
		 g1.getVal();
		 
		 g2.setVal("niit");
		 
		 g2.getVal();
	}

}
