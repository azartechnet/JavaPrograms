import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Path s1=Paths.get("D:/test.txt");
		Path s2=Paths.get("D:/newtest.txt");
		try
		{
			Files.copy(s1,s2);
		}
		catch(Exception t)
		{
			System.out.println(t);
		}

	}

}
