
public class Sample {

	public static void main(String[] args) {
		
		
		//String s1=new String("helloworld");
		String s1="admin";
		String s2="hai";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.concat(s2));
		System.out.println(s1.charAt(3));
		
		if(s1.equals("admin"))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
		System.out.println(s1.startsWith("b"));
		System.out.println(s1.endsWith("d"));

	}

}
