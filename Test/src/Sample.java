
public class Sample 
{
int x=30;
void display()
{
	final int y=50;
class Local
{
	void msg()
	{
		int x=25;
		System.out.println("x"+x);
		System.out.println("y"+y);
	}
}
Local 1=new Local();
Lmsg();
}

	public static void main(String[] args)
	{
		Sample obj=new Sample();
		obj.display();
	}

}
