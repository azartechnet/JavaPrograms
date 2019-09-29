package newpgpstring;

public class Sample {

	public static void main(String[] args) {
		
		
		/*String s1=new String("hello");
		
		String s2="hai";
		
		System.out.println("Object Creation"+s1);
		
		System.out.println("Withoutobject"+s2);
		
		System.out.println(s2.toLowerCase());
		
		System.out.println(s2.toUpperCase());*/
		
		
		StringBuffer sb=new StringBuffer("hello");
		
		System.out.println(sb.append("hai"));
		
		StringBuilder sk=new StringBuilder("niit");
		
		System.out.println(sk.substring(0,2));
		
	}

}
