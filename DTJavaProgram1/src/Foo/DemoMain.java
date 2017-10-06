package Foo;

public class DemoMain {

	public static void main(String[] args)
	{
		Box h=new Box();
		h.setWidth(30);
		h.setHeight(20);
		h.setDepth(10);
		System.out.println("Your Result is:\n"+h.volume());

	}

}
