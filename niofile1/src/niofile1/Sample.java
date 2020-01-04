package niofile1;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Sample {

	public static void main(String[] args) {

		
		Path g1=Paths.get("E:\\Sample\\sample1.java");
		Path g2=Paths.get("E:\\Sample1\\sample1.java");
		
		try
		{
			//Files.createDirectory(g1);
			Files.copy(g1, g2,StandardCopyOption.REPLACE_EXISTING,StandardCopyOption.COPY_ATTRIBUTES);
		}
		catch(IOException r)
		{
			System.out.println(r);
		}

	}

}
