
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Sample1
{

  public static void main(String as[])
  {
   try
   {
    Files.createDirectory(Paths.get("E:/Temp/App.txt"));
   }
   catch(IOException r)
   {
	   System.out.println("IOException");
   }
}
}