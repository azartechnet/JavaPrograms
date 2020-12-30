
public class Sample {

	public static void main(String[] args) {
		
		StringBuilder s1=new StringBuilder("welcome");
		System.out.println("Appending::"+s1.append("hai"));
		System.out.println("Deleting::"+s1.delete(2,4));
		//System.out.println(s1);
		System.out.println("Inserting::"+s1.insert(6,"azar"));

	}

}
