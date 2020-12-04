
public class Sample<T>
{

	public T t;//public int t;
	
	public void setValue(T t)
	{
		this.t=t;
	}
	public void getValue()
	{
		System.out.println("Your value is::"+t);
	}
	
	
	
	public static void main(String[] args) {
		
		Sample <Integer>f1=new Sample<Integer>();
		
		f1.setValue(1000);
		f1.getValue();
		
		Sample <String>f2=new Sample<String>();
		
		f2.setValue("hai");
		f2.getValue();
		

	}

}
