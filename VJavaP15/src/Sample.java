class MangoVarities
{
enum Mango{Carrie(100),Fairchild(200),Haden(300);
private int price;
Mango(int p)
{
  price=p;
}
int getPrice()
{
  return price;
}



	public static void main(String[] args) {
		    Mango p=Mango.Fairchild;
		    System.out.println(p.getPrice());

	}


}
}

