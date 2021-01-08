
public class Sample {

	String name;
	int age;
	void get1(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println(name+""+age);
	}
	void display()
	{
		System.out.println(name+""+age);
	}
	public static void main(String[] args) {
		
		Sample s1=new Sample();
		s1.get1("mohamed",12);
		s1.display();

	}

}
