import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo {

	public static void main(String[] args) throws IOException
	{
	  //Path p=Paths.get("D:/h1.txt");
      //Files.createFile(p);
		
		Path m=Paths.get("D:/NIO");
		Files.createDirectories(m);
		
		Path n=Paths.get("D:/NIO/jk.pdf");
		Files.createFile(n);
		
	}

}
