
public class enum2 
{
  enum gg{a1(10),b1(50);
	  private int h;
	  gg(int g)
	  {
		  h=g;
	  }
	  int get()
	  {
		  return h;
	  }
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gg g=gg.b1;
		System.out.println("value is:\n"+g.get());

	}

}
