

class Login
{
	private String uname="admin";
	private String pass="admin";
	
	class ValidateCer
	{
		public void validate()
		{
			System.out.println(uname);
			System.out.println(pass);
		}
	}
}


public class Sample {

	public static void main(String[] args) {
	
		Login k1=new Login();
		Login.ValidateCer f1=k1.new ValidateCer();
		f1.validate();

	}

}
